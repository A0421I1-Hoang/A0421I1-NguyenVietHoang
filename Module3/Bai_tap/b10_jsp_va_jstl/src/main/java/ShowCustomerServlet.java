import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowCustomerServlet")
public class ShowCustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Customer[] customers = {
                new Customer("toan dz", "ha noi", "12/12/1969"),
                new Customer("toan dz ++", "new york", "13/12/1969"),
                new Customer("toan dz--", "moon", "????"),
                new Customer("dz toan", "???", "2000 BC")
        };
        request.setAttribute("customers", customers);
        RequestDispatcher rq = request.getRequestDispatcher("showCustomer.jsp");
        rq.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
