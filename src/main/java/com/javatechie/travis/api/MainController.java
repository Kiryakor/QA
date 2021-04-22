package com.javatechie.travis.api;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/laba")
public class MainController extends HttpServlet {

    String anser = "";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        processRequest(resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String button = req.getParameter("button");
        String text = req.getParameter("text");

        MyParser myParser = new MyParser();
        anser = myParser.action(text);

        processRequest(resp);
    }

    //MARK: шаблонная функция html
    protected void processRequest(HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<head><title>Hello World</title></title>");
            out.println("<body>");

            out.println("<form name=\"myForm\" method=\"post\">");
            out.println("<p><b>Введите выражение:</b><br>");
            out.println("<input type=\"text\" name=\"text\" size=\"40\">");
            out.println("<input type=\"submit\" name=\"button\" value=\"Отправить\">");
            out.println("<p><b>Ответ: " + anser + "</b><br>");
            out.println("</form>");
            out.println("</body></html>");
        }
    }
}