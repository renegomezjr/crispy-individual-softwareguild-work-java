/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {

    loadContacts();
    $('#add-button').click(function (event) {
        event.preventDefault();
        $.ajax({
            type: 'POST',
            url: 'contact',
            data: JSON.stringify({
                firstName: $('#add-first-name').val(),
                lastName: $('#add-last-name').val(),
                company: $('#add-company').val(),
                phone: $('#add-phone').val(),
                email: $('#add-email').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function (data, status) {
            $('#add-first-name').val('');
            $('#add-last-name').val('');
            $('#add-company').val('');
            $('#add-phone').val('');
            $('#add-email').val('');
            loadContacts();

        });
    });

    $('#edit-button').click(function (event) {

        event.preventDefault();

        $.ajax({
            type: 'PUT',
            url: 'contact/' + $('#edit-contactId').val(),
            data: JSON.stringify({
                contactId: $('#edit-Id').val(),
                firstName: $('#edit-first-name').val(),
                lastName: $('#edit-last-name').val(),
                company: $('#edit-company').val(),
                phone: $('#edit-phone').val(),
                email: $('#edit-email').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function (data, status) {
            loadContacts();
        });
    });

    $('#search-button').click(function (event) {
        event.preventDefault();

        $.ajax({
            type: 'POST',
            url: 'search/contacts',
            data: JSON.stringify({
                firstName: $('#search-first-name').val(),
                lastName: $('#search-last-name').val(),
                company: $('#search-company').val(),
                phone: $('#search-phone').val(),
                email: $('#search-email').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function(data, status){
            fillContactTable(data, status);
        });
    });
});

function loadContacts() {
    var cTableBody = $('#contentRows');
    cTableBody.empty();

    $.ajax({
        url: "contacts",
        type: "GET",
        headers: {
            'Accept': 'application/json'
        }
    }).success(function (data, status) {
        fillContactTable(data, status);
    });
}

function fillContactTable(contactList, status) {
    var cTableBody = $('#contentRows');
    cTableBody.empty();

    $.each(contactList, function (index, contact) {
        cTableBody.append($('<tr>')
                .append($('<td>')
                        .append($('<a>')
                                .attr({
                                    'data-contact-id': contact.contactId,
                                    'data-toggle': 'modal',
                                    'data-target': '#detailsModal'
                                })
                                .text(contact.firstName + ' ' + contact.lastName)
                                )
                        )
                .append($('<td>').text(contact.company))
                .append($('<td>')
                        .append($('<a>')
                                .attr({
                                    'data-contact-id': contact.contactId,
                                    'data-toggle': 'modal',
                                    'data-target': '#editModal'
                                })
                                .text('Edit')
                                )
                        )
                .append($('<td>')
                        .append($('<a>')
                                .attr({
                                    'onClick': 'deleteContact(' + contact.contactId + ')'
                                })
                                .text('Delete')
                                )
                        )
                );
    });
}

function deleteContact(id) {
    var answer = confirm("Do you really want to delete this contact?");

    if (answer === true) {
        $.ajax({
            url: 'contact/' + id,
            type: 'DELETE'

        }).success(function () {
            loadContacts();
        });
    }
}

$('#detailsModal').on('show.bs.modal', function (event) {

    var element = $(event.relatedTarget);
    var contactId = element.data('contact-id');

    var modal = $(this);

    $.ajax({
        type: 'GET',
        url: 'contact/' + contactId,
        headers: {
            'Accept': 'application/json'
        }
    }).success(function (contact) {
        modal.find('#contact-Id').text(contact.contactId);
        modal.find('#contact-firstName').text(contact.firstName);
        modal.find('#contact-lastName').text(contact.lastName);
        modal.find('#contact-company').text(contact.company);
        modal.find('#contact-phone').text(contact.phone);
        modal.find('#contact-email').text(contact.email);
    });
});

$('#editModal').on('show.bs.modal', function (event) {

    var element = $(event.relatedTarget);
    var contactId = element.data('contact-id');

    var modal = $(this);
    $.ajax({
        type: 'GET',
        url: 'contact/' + contactId,
        headers: {
            'Accept': 'application/json'
        }
    }).success(function (contact) {
        modal.find('#contact-Id').text(contact.contactId);
        modal.find('#edit-first-name').val(contact.firstName);
        modal.find('#edit-last-name').val(contact.lastName);
        modal.find('#edit-company').val(contact.company);
        modal.find('#edit-phone').val(contact.phone);
        modal.find('#edit-email').val(contact.email);
        modal.find('#edit-contactId').val(contactId);
    });
});

//TEST DATA (basically contacts as JSONs)
var testContactData = [
    {
        contactId: 1,
        firstName: "Juan",
        lastName: "Sanchez",
        company: "SPGS",
        phone: "502-333-3434",
        email: "jsanchez@gmail.com"
    },
    {
        contactId: 2,
        firstName: "Julie",
        lastName: "Gomez",
        company: "CAPS",
        phone: "502-434-6634",
        email: "jgomez@gmail.com"
    },
    {
        contactId: 3,
        firstName: "Bob",
        lastName: "Smith",
        company: "McDonalds",
        phone: "502-985-2343",
        email: "hklops@gmail.com"
    },
    {
        contactId: 4,
        firstName: "Sandra",
        lastName: "Vanderhausen",
        company: "Buy the Pics",
        phone: "502-333-8976",
        email: "svanderhause@gmail.com"
    },
    {
        contactId: 5,
        firstName: "Momma",
        lastName: "Goldberg",
        company: "Momma's",
        phone: "502-333-9999",
        email: "goodeats@gmail.com"
    }
];
