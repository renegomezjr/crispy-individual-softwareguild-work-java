/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.contactlistmvc.controller;

import com.swcguild.contactlistmvc.dao.ContactListDAO;
import com.swcguild.contactlistmvc.model.Contact;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Rene Gomez
 */
@Controller
public class HomeController {
    
    private ContactListDAO dao;
    
    @Inject
    public HomeController(ContactListDAO dao){
        this.dao = dao;
    }
    
    @RequestMapping(value="/mainAjaxPage", method=RequestMethod.GET)
    public String displayHomePage(){
        return "mainAjaxPage";
    }
    
    @RequestMapping(value="/contact/{id}", method=RequestMethod.GET)
    @ResponseBody
    public Contact getTheContact(@PathVariable("id")int contactId){
        return dao.getContactBy(contactId);
    }
    
    @RequestMapping(value="/contact", method=RequestMethod.POST)
    @ResponseBody @ResponseStatus(HttpStatus.CREATED)
    public Contact createTheContact(@Valid @RequestBody Contact newContact){
        dao.addContact(newContact);
        return newContact;
        
    }
    
    @RequestMapping(value="/contact/{id}", method=RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTheContact(@PathVariable("id")int contactId){
        dao.removeContact(contactId);
    }
    
    @RequestMapping(value="/contact/{id}", method=RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateTheContact(@PathVariable("id")int contactId,@Valid @RequestBody Contact editedContact){
        editedContact.setContactId(contactId);
        dao.updateContact(editedContact);
    }
    
    @RequestMapping(value="/contacts", method=RequestMethod.GET)
    @ResponseBody
    public List<Contact> getAllTheContacts(){
        return dao.getAllContacts();
    }
    
    @RequestMapping(value="/edit/{contactId}", method=RequestMethod.GET)
    public String editContactById(@PathVariable("contactId")int id, Model model){
        Contact contact = dao.getContactBy(id);
        model.addAttribute("contactToEdit", contact);
        
        return "editContactForm";
    }
    
    @RequestMapping(value="/edit/editContactFormSubmission", method=RequestMethod.POST)
    public String processEditForm(HttpServletRequest req){
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String company = req.getParameter("company");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        String id = req.getParameter("contactId");
        
        Contact newContact = new Contact();
        newContact.setFirstName(firstName);
        newContact.setLastName(lastName);
        newContact.setCompany(company);
        newContact.setPhone(phone);
        newContact.setEmail(email);
        newContact.setContactId(Integer.parseInt(id));
        
        dao.updateContact(newContact);
        
        
        return "redirect:/";
    }
}
