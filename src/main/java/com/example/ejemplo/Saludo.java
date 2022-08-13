package com.example.ejemplo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Saludo", value = "/Saludo")
public class Saludo extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body><center>");
        for (int i = 1; i <=6; i++) {
            out.println("<h"+i+">Hola Mundo</h"+i+">");
        }
        out.println("</center></body></html>");
    }
}
