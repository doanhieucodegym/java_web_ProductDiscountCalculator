import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet_percent",urlPatterns = "/percent")
public class Servlet_percent extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            float price = Float.parseFloat(request.getParameter("txt_price"));
            float percent = Float.parseFloat(request.getParameter("txt_percent"));
            float amount = price * percent * 0.1f;
            float after_price =price -amount;
            String description = request.getParameter("txt_description");
        PrintWriter writer = response.getWriter();
        writer.println("Product Description :"+description);
        writer.println("List Price :"+price);
        writer.println("Discount Percent :"+percent+"%");
        writer.println("Discount Amount :"+amount);
        writer.println("Discount Price :"+after_price);



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
