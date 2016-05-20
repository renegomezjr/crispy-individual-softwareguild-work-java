/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.simpleboardgamelist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rene Gomez
 */
@WebServlet(name = "BoardGameListServlet", urlPatterns = {"/BoardGameList"})
public class BoardGameListServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<BoardGame> boardGames = new ArrayList<BoardGame>();
        
        boardGames.add(new BoardGame(1,1,7, "Lonely Hearts", "Your Mom"));
        boardGames.add(new BoardGame(18,19,46, "Game No One Will Play", "Monkeys"));
        boardGames.add(new BoardGame(3,5,2, "Best Game Ever", "Monks"));
        boardGames.add(new BoardGame(1,10000,10000, "Don't Drink The Water", "Flint"));
        boardGames.add(new BoardGame(1,10,100, "Copying and Pasting", "The Guild"));
        boardGames.add(new BoardGame(4,15,72, "I'm On A Boat", "Mo Fo"));
        
        request.setAttribute("myExcellentLibrary", boardGames);
//        RequestDispatcher rd = request.getRequestDispatcher("boardGameList.jsp");
//        rd.forward(request, response);
        request.getRequestDispatcher("boardGameList.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
