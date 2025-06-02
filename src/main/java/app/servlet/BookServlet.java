package app.servlet;

import app.model.Book;
import app.model.BookDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


@WebServlet("/search")
public class BookServlet extends HttpServlet {
    private BookDAO bookDAO;
    DataSource dataSource;
    @Override
    public void init() throws ServletException {


        try {

            bookDAO = new BookDAO();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException(e);

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String query = request.getParameter("query");
        if (query == null) query = "";

        try {

            List<Book> books = bookDAO.searchBooks(query);
            request.setAttribute("books", books);
            request.getRequestDispatcher("results.jsp").forward(request, response);
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }
}
