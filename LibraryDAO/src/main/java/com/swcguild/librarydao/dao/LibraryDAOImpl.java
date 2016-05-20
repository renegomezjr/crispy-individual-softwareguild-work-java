/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.librarydao.dao;

import com.swcguild.librarydao.model.Author;
import com.swcguild.librarydao.model.Book;
import com.swcguild.librarydao.model.Publisher;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Rene Gomez
 */
public class LibraryDAOImpl implements LibraryDAO {
    
    private JdbcTemplate jdbcTemplate;
    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Book addBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Author addAuthor(Author author) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Publisher addPublisher(Publisher publisher) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateAuthor(Author author) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updatePublisher(Publisher publisher) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteBook(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAuthor(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePublisher(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    private static final String SQL_GETBOOKBY_ID = "SELECT * FROM books WHERE id = ?";
    
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public Book getBookById(int id) {
        Book book = jdbcTemplate.queryForObject(SQL_GETBOOKBY_ID, new BookMapper(), id);
        int[] authorIds = getAuthorIdsByBookId(id);
        book.setAuthorIds(authorIds);
        
        return book;
    }

    @Override
    public Author getAuthorById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Publisher getPublisherById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Book> getBookByTitle(String title) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Author> getAuthorByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Publisher> getPublisherByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Author> getAuthorByBookId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static final String GET_AUTHORSIDS_BY_BOOKIDS = "SELECT authorId FROM book_authors WHERE bookId=?";
    @Override
    public int[] getAuthorIdsByBookId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    //MAPPERS!!
    private static final class BookMapper implements RowMapper<Book> {
        
        public Book mapRow(ResultSet rs, int i) throws SQLException{
            Book newBook = new Book();
            
            newBook.setBookId(rs.getInt("id"));
            newBook.setTitle(rs.getString("title"));
            newBook.setISBN(rs.getString("isbn"));
            newBook.setPrice(rs.getBigDecimal("price"));
            newBook.setPublishDate(rs.getTimestamp("publishDate").toLocalDateTime().toLocalDate());
            newBook.setPublisherId(rs.getInt("publisherId"));
            
            return newBook;
        }
    
    }
    
}
