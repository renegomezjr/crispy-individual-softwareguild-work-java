/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.librarydao.controller;

import com.swcguild.librarydao.dao.LibraryDAO;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Rene Gomez
 */
@Controller
public class LibraryController {
    
    LibraryDAO dao;
    
    public LibraryController(LibraryDAO dao){
        this.dao = dao;
    }
}
