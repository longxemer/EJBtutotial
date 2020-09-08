package com.Ejb;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Add")
public class Servlet extends HttpServlet {
    @EJB
    ejb obj;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        int a = Integer.parseInt(request.getParameter("so1"));
        int b = Integer.parseInt(request.getParameter("so2"));

        obj.setA(a);
        obj.setB(b);

        obj.add();
        int c = obj.getC();

        out.println("Kết quả là : "+c);

    }


}
