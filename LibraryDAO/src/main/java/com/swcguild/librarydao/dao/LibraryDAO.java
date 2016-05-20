/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.librarydao.dao;

import com.swcguild.librarydao.model.Author;
import com.swcguild.librarydao.model.Book;
import com.swcguild.librarydao.model.Publisher;
import java.util.List;

/**
 *
 * @author Rene Gomez
 */
public interface LibraryDAO {
    
    public Book addBook(Book book);
    public Author addAuthor(Author author);
    public Publisher addPublisher(Publisher publisher);
    
    public void updateBook(Book book);
    public void updateAuthor(Author author);
    public void updatePublisher(Publisher publisher);
    
    public void deleteBook(int id);
    public void deleteAuthor(int id);
    public void deletePublisher(int id);
    
    public Book getBookById(int id);
    public Author getAuthorById(int id);
    public Publisher getPublisherById(int id);
    
    public List<Book> getBookByTitle(String title);
    public List<Author> getAuthorByName(String name);
    public List<Publisher> getPublisherByName(String name);
    
    public List<Author> getAuthorByBookId(int id);
    public int[] getAuthorIdsByBookId(int id);

}
