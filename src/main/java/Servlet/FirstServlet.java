package Servlet;

import Units.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name ="FirstServlet", urlPatterns = "/productList")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        ArrayList<Product> products = new ArrayList<>();
        Product p1 = new Product();
        p1.setId(1);
        p1.setTitle("Apple");
        p1.setCost(50);
        products.add(p1);
        Product p2 = new Product();
        p2.setId(2);
        p2.setTitle("Plum");
        p2.setCost(30);
        products.add(p2);
        Product p3 = new Product();
        p3.setId(3);
        p3.setTitle("Cheese");
        p3.setCost(35);
        products.add(p3);
        Product p4 = new Product();
        p4.setId(4);
        p4.setTitle("Bread");
        p4.setCost(60);
        products.add(p4);
        Product p5 = new Product();
        p5.setId(5);
        p5.setTitle("Butter");
        p5.setCost(90);
        products.add(p5);

        out.println("<html><body><h1>" + (products.toString()) + "</h1></body></html>");
        out.close();

    }
}
