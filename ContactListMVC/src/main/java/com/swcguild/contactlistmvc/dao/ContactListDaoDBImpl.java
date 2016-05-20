/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.contactlistmvc.dao;

import com.swcguild.contactlistmvc.model.Contact;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Rene Gomez
 */
public class ContactListDaoDBImpl implements ContactListDAO {

    private static final String SQL_SELECT_ALL_CONTACTS = "SELECT * FROM contacts WHERE 1=1";
    private static final String SQL_ADD_CONTACT = "INSERT INTO contacts(first_name,"
            + " last_name, company, phone, email) VALUES (?,?,?,?,?)";
    private static final String SQL_DELETE_CONTACT_BY_ID = "DELETE FROM contacts WHERE id=?";
    private static final String SQL_GET_CONTACT_BY_ID = "SELECT * FROM contacts WHERE id=?";
    private static final String SQL_UPDATE_CONTACT = "UPDATE contacts SET first_name = ?, "
            + "last_name = ?,"
            + "company = ?,"
            + "phone = ?,"
            + "email = ? "
            + "WHERE id=?";
    private static final String SQL_SEARCH_CONTACTS = "SELECT * FROM contacts "
            + "WHERE first_name LIKE ? AND "
            + "last_name LIKE ? AND "
            + "company LIKE ? AND "
            + "phone LIKE ? AND "
            + "email LIKE ?";
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Contact addContact(Contact contact) {
        jdbcTemplate.update(SQL_ADD_CONTACT,
                contact.getFirstName(),
                contact.getLastName(),
                contact.getCompany(),
                contact.getPhone(),
                contact.getEmail());
        int id = jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID()", Integer.class);
        contact.setContactId(id);
        return contact;
    }

    @Override
    public void removeContact(int contactId) {
        jdbcTemplate.update(SQL_DELETE_CONTACT_BY_ID, contactId);
    }

    @Override
    public void updateContact(Contact contact) {
        jdbcTemplate.update(SQL_UPDATE_CONTACT,
                contact.getFirstName(),
                contact.getLastName(),
                contact.getCompany(),
                contact.getPhone(),
                contact.getEmail(),
                contact.getContactId());
    }

    @Override
    public List<Contact> getAllContacts() {
        List<Contact> allContacts = jdbcTemplate.query(SQL_SELECT_ALL_CONTACTS, new ContactMapper());
        return allContacts;
    }

    @Override
    public Contact getContactBy(int contactId) {
        
        try {
            return jdbcTemplate.queryForObject(SQL_GET_CONTACT_BY_ID, new ContactMapper(), contactId);
            
        } catch (EmptyResultDataAccessException e) {
            return null;
            
        }
        
    }
    
    
    
    @Override
    public List<Contact> searchContacts(Map<SearchTerm, String> criteria) {
        String firstNameCriteria = criteria.get(SearchTerm.FIRST_NAME);
        if(firstNameCriteria == null || firstNameCriteria.equals("")){
            firstNameCriteria = "%";
        }else{
            firstNameCriteria = "%" + firstNameCriteria + "%";
        }
        
        String lastNameCriteria = criteria.get(SearchTerm.LAST_NAME);
        if(lastNameCriteria == null || lastNameCriteria.equals("")){
            lastNameCriteria = "%";
        } else{
            lastNameCriteria = "%" + lastNameCriteria + "%";
        }
        
        String companyCriteria = criteria.get(SearchTerm.COMPANY);
        if(companyCriteria == null || companyCriteria.equals("")){
            companyCriteria = "%";
        } else{
            companyCriteria = "%" + companyCriteria + "%";
        }
        
        String phoneCriteria = criteria.get(SearchTerm.PHONE);
        if(phoneCriteria == null || phoneCriteria.equals("")){
            phoneCriteria = "%";
        } else{
            phoneCriteria = "%" + phoneCriteria + "%";
        }
        
        String emailCriteria = criteria.get(SearchTerm.EMAIL);
        if(emailCriteria == null || emailCriteria.equals("")){
            emailCriteria = "%";
        } else{
            emailCriteria = "%" + emailCriteria + "%";
        }
        
        return jdbcTemplate.query(SQL_SEARCH_CONTACTS,
                new ContactMapper(),
                firstNameCriteria,
                lastNameCriteria,
                companyCriteria,
                phoneCriteria,
                emailCriteria);
    }

    @Override
    public List<Contact> searchContacts(Predicate<Contact> filter) {
        List<Contact> allContacts = this.getAllContacts();
        return allContacts.stream().filter(filter).collect(Collectors.toList());
    }

    private static final class ContactMapper implements RowMapper<Contact> {

        @Override
        public Contact mapRow(ResultSet rs, int i) throws SQLException {
            Contact newContact = new Contact();

            newContact.setContactId(rs.getInt("id"));
            newContact.setFirstName(rs.getString("first_name"));
            newContact.setLastName(rs.getString("last_name"));
            newContact.setCompany(rs.getString("company"));
            newContact.setPhone(rs.getString("phone"));
            newContact.setEmail(rs.getString("email"));

            return newContact;
        }
    }
}
