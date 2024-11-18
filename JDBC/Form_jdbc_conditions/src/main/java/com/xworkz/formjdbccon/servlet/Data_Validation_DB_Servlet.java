package com.xworkz.formjdbccon.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.formjdbccon.dto.Data_Validation_DB;
import com.xworkz.formjdbccon.service.Jdbc_form_dbService;
import com.xworkz.formjdbccon.service.Jdbc_form_dbServiceimpl;

@WebServlet(urlPatterns = "/Register")
public class Data_Validation_DB_Servlet extends HttpServlet {

	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        String email = req.getParameter("email");
        long contactNumber = Long.parseLong(req.getParameter("contactNumber"));

        Data_Validation_DB dvdb = new Data_Validation_DB(name, age, email, contactNumber);

        Jdbc_form_dbService service = new Jdbc_form_dbServiceimpl();
        boolean result = service.validateandsave(dvdb);

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        if (result) {
            out.println("Form Submitted Successfully");
        } else {
            out.println("Form Submission Failed");
        }
    }
}
