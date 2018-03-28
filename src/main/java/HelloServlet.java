import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LocalDateTime localDateTime = LocalDateTime.now();
        req.setAttribute("currentTime",localDateTime.toString());
        System.out.println("aaaaa");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/hello.jsp");
        dispatcher.forward(req,resp);
    }
}
