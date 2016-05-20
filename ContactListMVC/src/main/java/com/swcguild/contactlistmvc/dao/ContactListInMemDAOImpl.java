/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.contactlistmvc.dao;

import com.swcguild.contactlistmvc.model.Contact;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author Rene Gomez
 */
public class ContactListInMemDAOImpl implements ContactListDAO {
    Map<Integer, Contact> contactMap = new HashMap<>();
    private static int contactIdCounter = 0;
    
    public ContactListInMemDAOImpl(){
        Contact contact = new Contact();
        contact.setFirstName("Winston");
        contact.setLastName("Churchill");
        contact.setCompany("England");
        contact.setPhone("2");
        contact.setEmail("winnie@notpooh.com");
        this.addContact(contact);
        
        contact = new Contact();
        contact.setFirstName("Bart");
        contact.setLastName("Simpson");
        contact.setCompany("Springfield");
        contact.setPhone("222-3333");
        contact.setEmail("wjon@notpooh.com");
        this.addContact(contact);
        
        contact = new Contact();
        contact.setFirstName("Turd");
        contact.setLastName("Ferguson");
        contact.setCompany("Plain Old People");
        contact.setPhone("245-4455");
        contact.setEmail("turdy@notpooh.com");
        this.addContact(contact);
        
        contact = new Contact();
        contact.setFirstName("Sarah");
        contact.setLastName("Dukie");
        contact.setCompany("The Software craftmanship guild");
        contact.setPhone("555-4455");
        contact.setEmail("turdy@gmail.com");
        this.addContact(contact);
        
        contact = new Contact();
        contact.setFirstName("Annie");
        contact.setLastName("Bob");
        contact.setCompany("Craftmanship guild");
        contact.setPhone("222-4455");
        contact.setEmail("annBob@gmail.com");
        this.addContact(contact);
        
        contact = new Contact();
        contact.setFirstName("Annie");
        contact.setLastName("Bob");
        contact.setCompany("Craftmanship guild");
        contact.setPhone("222-4455");
        contact.setEmail("annBob@gmail.com");
        this.addContact(contact);
        
        contact = new Contact();
        contact.setFirstName("Time");
        contact.setLastName("Love");
        contact.setCompany("Craftmanship Plumbers");
        contact.setPhone("556-4455");
        contact.setEmail("lovey@gmail.com");
        this.addContact(contact);
    }
    
    @Override
    public Contact addContact(Contact contact) {
        contact.setContactId(contactIdCounter);
        contactIdCounter++;
        contactMap.put(contact.getContactId(), contact);
        return contact;
    }

    @Override
    public void removeContact(int contactId) {
        contactMap.remove(contactId);
    }

    @Override
    public void updateContact(Contact contact) {
        contactMap.put(contact.getContactId(), contact);
    }

    @Override
    public List<Contact> getAllContacts() {
        
        return new ArrayList(contactMap.values());
        
    }

    @Override
    public Contact getContactBy(int contactId) {
        return contactMap.get(contactId);
    }

    @Override
    public List<Contact> searchContacts(Map<SearchTerm, String> criteria) {
        String firstNameCriteria = criteria.get(SearchTerm.FIRST_NAME);
        String lastNameCriteria = criteria.get(SearchTerm.LAST_NAME);
        String companyNameCriteria = criteria.get(SearchTerm.COMPANY);
        String phoneNameCriteria = criteria.get(SearchTerm.PHONE);
        String emailNameCriteria = criteria.get(SearchTerm.EMAIL);
        
        Predicate<Contact> firstNamePred;
        Predicate<Contact> lastNamePred;
        Predicate<Contact> companyNamePred;
        Predicate<Contact> phoneNamePred;
        Predicate<Contact> emailNamePred;
        
        Predicate<Contact> allPass = (contact) -> {return true;};
        
        firstNamePred = (firstNameCriteria == null || firstNameCriteria.isEmpty()) ? 
                allPass : (contact) -> contact.getFirstName().toLowerCase().contains(firstNameCriteria.toLowerCase());
        lastNamePred = (lastNameCriteria == null || lastNameCriteria.isEmpty()) ? 
                allPass : (contact) -> contact.getLastName().toLowerCase().contains(lastNameCriteria.toLowerCase());
        companyNamePred = (companyNameCriteria == null || companyNameCriteria.isEmpty()) ? 
                allPass : (contact) -> contact.getCompany().toLowerCase().contains(companyNameCriteria.toLowerCase());
        phoneNamePred = (phoneNameCriteria == null || phoneNameCriteria.isEmpty()) ? 
                allPass : (contact) -> contact.getPhone().toLowerCase().contains(phoneNameCriteria.toLowerCase());
        emailNamePred = (emailNameCriteria == null || emailNameCriteria.isEmpty()) ? 
                allPass : (contact) -> contact.getEmail().toLowerCase().contains(emailNameCriteria.toLowerCase());
        
        return contactMap.values().stream()
                .filter(firstNamePred)
                .filter(lastNamePred)
                .filter(companyNamePred)
                .filter(phoneNamePred)
                .filter(emailNamePred)
                .collect(Collectors.toList());
                
        
    }

    @Override
    public List<Contact> searchContacts(Predicate<Contact> filter) {
        return contactMap.values().stream()
                .filter(filter)
                .collect(Collectors.toList());
    }
    
}
