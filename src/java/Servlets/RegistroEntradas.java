/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author casf9
 */
@WebServlet(name = "RegistroEntradas", urlPatterns = {"/RegistroEntradas"})
public class RegistroEntradas extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
               // Obtiene los datos del formulario
            String serialEntrada = request.getParameter("serialEntrada");
            String costoCompra = request.getParameter("costoCompra");
            String cantidad = request.getParameter("cantidad");
            String precioVenta = request.getParameter("precioVenta");
            String fecha = request.getParameter("fecha");
            String codigoProducto = request.getParameter("codigoProducto");
            String serialCompra = request.getParameter("serialCompra");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistroEntradas</title>");
            out.println("</head>");
            out.println("<body>");
             // Procesa los datos recibidos
            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().println("<h2>Registro de Entrada Exitoso</h2>");
            response.getWriter().println("<p>Serial Entrada: " + serialEntrada + "</p>");
            response.getWriter().println("<p>Costo Compra: " + costoCompra + "</p>");
            response.getWriter().println("<p>Cantidad: " + cantidad + "</p>");
            response.getWriter().println("<p>Precio Venta: " + precioVenta + "</p>");
            response.getWriter().println("<p>Fecha: " + fecha + "</p>");
            response.getWriter().println("<p>Código Producto: " + codigoProducto + "</p>");
            response.getWriter().println("<p>Serial Compra: " + serialCompra + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
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
