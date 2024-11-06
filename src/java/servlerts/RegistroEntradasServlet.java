/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlerts;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistroEntradasServlet")
public class RegistroEntradasServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Aquí puedes manejar la lógica de consulta
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<h2>Consulta de entradas en proceso...</h2>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtiene los datos del formulario
        String serialEntrada = request.getParameter("serialEntrada");
        String costoCompra = request.getParameter("costoCompra");
        String cantidad = request.getParameter("cantidad");
        String precioVenta = request.getParameter("precioVenta");
        String fecha = request.getParameter("fecha");
        String codigoProducto = request.getParameter("codigoProducto");
        String serialCompra = request.getParameter("serialCompra");

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
    }
}

