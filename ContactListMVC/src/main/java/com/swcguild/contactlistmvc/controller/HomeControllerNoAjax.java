/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.contactlistmvc.controller;

import com.swcguild.contactlistmvc.dao.ContactListDAO;
import com.swcguild.contactlistmvc.dao.SearchTerm;
import com.swcguild.contactlistmvc.model.Contact;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Rene Gomez
 */
@Controller
public class HomeControllerNoAjax {

    private ContactListDAO dao;

    @Inject
    public HomeControllerNoAjax(ContactListDAO dao) {
        this.dao = dao;
    }

    @RequestMapping(value = "/newContactFormNoAjax", method = RequestMethod.GET)
    public String displayNewContacFormAjax() {
        return "newContactFormWithoutAjax";
    }

    @RequestMapping(value = "addContactNoAjax", method = RequestMethod.POST)
    public String addNewContact(HttpServletRequest req) {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String company = req.getParameter("company");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        
        Contact newContact = new Contact();
        newContact.setFirstName(firstName);
        newContact.setLastName(lastName);
        newContact.setCompany(company);
        newContact.setPhone(phone);
        newContact.setEmail(email);
        
        dao.addContact(newContact);
        
        return "redirect:displayContactListNoAjax";
    }

    @RequestMapping(value = "/displayContactListNoAjax", method = RequestMethod.GET)
    public String displayContactList(Model model) {

        List<Contact> allContacts = dao.getAllContacts();
        model.addAttribute("contactList", allContacts);

        return "displayContactListNoAjax"; //has to match the .jsp name
    }
    
    @RequestMapping(value="/searchFormWithoutAjax", method=RequestMethod.GET)
    public String displaySearchFormWithoutAjax(Model model){
        return "searchFormWithoutAjax";
    }
    
    @RequestMapping(value="/searchFormWithoutAjax", method=RequestMethod.POST)
    public String searchFormWithoutAjax(Model model, HttpServletRequest req){
        String firstNameCriteria = req.getParameter("firstName");
        String lastNameCriteria = req.getParameter("lastName");
        String companyCriteria = req.getParameter("company");
        String phoneCriteria = req.getParameter("phone");
        String emailCriteria = req.getParameter("email");
        
        Map<SearchTerm, String> criteriaForSearch = new HashMap<>();
        criteriaForSearch.put(SearchTerm.FIRST_NAME, firstNameCriteria);
        criteriaForSearch.put(SearchTerm.LAST_NAME, lastNameCriteria);
        criteriaForSearch.put(SearchTerm.COMPANY, companyCriteria);
        criteriaForSearch.put(SearchTerm.PHONE, phoneCriteria);
        criteriaForSearch.put(SearchTerm.EMAIL, emailCriteria);
        
        List<Contact> foundContacts = dao.searchContacts(criteriaForSearch);
        model.addAttribute("contactList", foundContacts);
        model.addAttribute("fromSearch", true);
        model.addAttribute("listSize", foundContacts.size());
        
        
        return "displayContactListNoAjax";
    }

    @RequestMapping(value = "deleteContactNoAjax", method = RequestMethod.GET)
    public String deleteContact(HttpServletRequest req) {
        String contactId = req.getParameter("cId");

        int sanitizedId = this.sanitizeContactId(contactId);
        if (sanitizedId >= 0) {
            dao.removeContact(sanitizedId);
        }
//        try {
//            int contactIdInt = Integer.parseInt(contactId);
//            dao.removeContact(contactIdInt);
//        } catch (NumberFormatException e) {
//            req.setAttribute("badDelete", true);
//            req.setAttribute("cID", contactId);
//        }

        return "redirect:displayContactListNoAjax";
    }

    @RequestMapping(value = "/editContactNoAjax", method = RequestMethod.GET)
    public String displayEditFormNoAjax(HttpServletRequest req, Model model) {
        int sanitizedId = this.sanitizeContactId(req.getParameter("cId"));

        if (sanitizedId >= 0) {
            Contact contact = dao.getContactBy(sanitizedId);
            model.addAttribute("contactToEdit", contact);
        }

        return "editContactFormWithoutAjax";
    }

    @RequestMapping(value = "/editContactNoAjax", method = RequestMethod.POST)
    public String editModelContactNoAjax(@Valid @ModelAttribute("contactToEdit") Contact contact, 
            BindingResult result) {
        
        if(result.hasErrors()){
            return "editContactFormWithoutAjax";
        }
        
        dao.updateContact(contact);
        return "redirect:displayContactListNoAjax";
    }

    private int sanitizeContactId(String contactIdParam) {
        int contactIdInt = -1;

        try {
            contactIdInt = Integer.parseInt(contactIdParam);
        } catch (NumberFormatException e) {
            contactIdInt = -1;
        }

        return contactIdInt;
    }
}
