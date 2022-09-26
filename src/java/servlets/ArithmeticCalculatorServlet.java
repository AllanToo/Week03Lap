/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Allan T
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            try {
                
           
            String operation = request.getParameter("operation");

            int num1 = Integer.parseInt( request.getParameter("first"));
            
            int num2 = Integer.parseInt(request.getParameter("second"));
            
            int result = 0;

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "%":
                    result = num1 % num2;
                    break;
            }

            request.setAttribute("result", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);

         if(request.getParameter("first")== null ||  request.getParameter("first").equals(""))
        {
            request.setAttribute("result", "Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
                    return;
        }

        } catch (NumberFormatException e) {
            
            request.setAttribute("result", "invalid");
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
        }
    }
       
    }

   


