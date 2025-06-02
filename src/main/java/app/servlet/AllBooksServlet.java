package app.servlet;



import app.model.Book;
import app.model.BookDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.naming.*;



@WebServlet("/books")
public class AllBooksServlet extends HttpServlet {
    private BookDAO bookDAO;


    @Override
    public void init() throws ServletException {

        try {
            bookDAO = new BookDAO();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException("Błąd inicjalizacji DAO", e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            List<Book> books = bookDAO.getAllBooks();
            req.setAttribute("books", books);
            req.getRequestDispatcher("books.jsp").forward(req, resp);
        } catch (SQLException e) {
            throw new ServletException(e);

        }
    }
}

