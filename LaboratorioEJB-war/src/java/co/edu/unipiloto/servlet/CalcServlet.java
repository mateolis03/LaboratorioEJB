/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.servlet;

import co.edu.unipiloto.sessionBean.CalcBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mateo
 */
public class CalcServlet extends HttpServlet {

    @EJB
    private CalcBeanLocal calcBean;
    private String operacion = "";
    private double total = 0;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        /* TODO output your page here. You may use following sample code. */
        String numeros = request.getParameter("num");
        String operadores = request.getParameter("opr");
        String borrar = request.getParameter("cle");
        if (borrar != (null)) {
            total = 0.0;
            operacion = "";
        }
        if (numeros != null) {
            operacion += numeros;
        }
        if (operadores != null && !operadores.equals("=")) {
            operacion += operadores;
        }
        if (operadores != null && operadores.equals("=")) {
            if (operacion.contains("+")) {
                double valor1 = Double.valueOf(operacion.split("\\+")[0]);
                double valor2 = Double.valueOf(operacion.split("\\+")[1]);
                total = valor1 + valor2;
                operacion = String.valueOf(total);
            } else if (operacion.contains("-")) {
                double valor1 = Double.valueOf(operacion.split("\\-")[0]);
                double valor2 = Double.valueOf(operacion.split("\\-")[1]);
                total = valor1 - valor2;
                operacion = String.valueOf(total);
            } else if (operacion.contains("*")) {
                double valor1 = Double.valueOf(operacion.split("\\*")[0]);
                double valor2 = Double.valueOf(operacion.split("\\*")[1]);
                total = valor1 * valor2;
                operacion = String.valueOf(total);
            } else if (operacion.contains("/")) {
                double valor1 = Double.valueOf(operacion.split("\\/")[0]);
                double valor2 = Double.valueOf(operacion.split("\\/")[1]);
                total = valor1 / valor2;
                operacion = String.valueOf(total);
            } else if (operacion.contains("^")) {
                double valor1 = Double.valueOf(operacion.split("\\^")[0]);
                total = Math.pow(valor1, 2);operacion = String.valueOf(total);
                
            } else if (operacion.contains("MOD")) {
                double valor1 = Double.valueOf(operacion.split("MOD")[0]);
                double valor2 = Double.valueOf(operacion.split("MOD")[1]);
                total = valor1 % valor2;
                operacion = String.valueOf(total);
            }
        }
        request.setAttribute("result", operacion);
        request.getRequestDispatcher("index.jsp").forward(request, response);

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
