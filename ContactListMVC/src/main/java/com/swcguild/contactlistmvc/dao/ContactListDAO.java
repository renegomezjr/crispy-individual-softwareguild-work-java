/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.contactlistmvc.dao;

import com.swcguild.contactlistmvc.model.Contact;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/**
 *
 * @author Rene Gomez
 */
public interface ContactListDAO {
    
    public Contact addContact(Contact contact);
    public void removeContact(int contactId);
    public void updateContact(Contact contact);
    public List<Contact> getAllContacts();
    public Contact getContactBy(int contactId);
    public List<Contact> searchContacts(Map<SearchTerm, String> criteria);
    public List<Contact> searchContacts(Predicate<Contact> filter);
}
