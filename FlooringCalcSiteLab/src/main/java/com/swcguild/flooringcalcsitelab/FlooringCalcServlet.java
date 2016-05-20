/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.flooringcalcsitelab;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rene Gomez
 */
@WebServlet(name = "FlooringCalcServlet", urlPatterns = {"/FlooringCalc"})
public class FlooringCalcServlet extends HttpServlet {

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
        String widthString = request.getParameter("width");
        String lengthString = request.getParameter("length");
        String costString = request.getParameter("costSqFt");

        if (widthString == null || lengthString == null || costString == null) {
            request.setAttribute("badInput", true);
        } else {
            try {
                double width = Double.parseDouble(widthString);
                double length = Double.parseDouble(lengthString);
                double costSqFt = Double.parseDouble(costString);

                if (width <= 0 || length <= 0 || costSqFt <= 0) {
                    request.setAttribute("badInput", true);

                } else {
                    FlooringCalculator floorCalc = new FlooringCalculator(width, length, costSqFt);
                    request.setAttribute("calculations", floorCalc);

                    request.setAttribute("width", width);
                    request.setAttribute("length", length);
                    request.setAttribute("costSqFt", costSqFt);

                    request.setAttribute("laborTime", floorCalc.getLaborTime());
                    request.setAttribute("laborCost", floorCalc.getLaborCost());
                    request.setAttribute("flooringCost", floorCalc.getFlooringCost());
                    request.setAttribute("flooringArea", floorCalc.getAreaSqFt());
                }

            } catch (NumberFormatException ex) {
                request.setAttribute("badInput", true);

            }

        }
        request.getRequestDispatcher("result.jsp").forward(request, response);

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
