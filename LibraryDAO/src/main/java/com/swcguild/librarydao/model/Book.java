/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.librarydao.model;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author Rene Gomez
 */
public class Book {
    
    private int bookId;

    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    public int[] getAuthorIds() {
        return authorIds;
    }

    public void setAuthorIds(int[] authorIds) {
        this.authorIds = authorIds;
    }
    private String title;
    private String ISBN;
    private LocalDate publishDate;
    private BigDecimal price;
    
    private int publisherId;
//    Publisher publisher;
    
    private int[] authorIds;
    

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    
}
