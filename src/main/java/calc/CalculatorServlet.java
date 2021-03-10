package calc;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "CalculatorServlet",
        urlPatterns = "/Inputs"
)
public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String op = req.getParameter("OP");
        String X = req.getParameter("X");
        String Y = req.getParameter("Y");
        int x = Integer.parseInt(X);
        int y = Integer.parseInt(Y);
        Calculator calc = new Calculator("calc");
        double answer = 0.0;
        System.out.println(x);
        switch(op){
            case "POWER":
                answer = calc.power(x,y);
                break;
            case "FACTORIAL":
                answer = calc.factorial(x);
                break;
            case "LOGN":
                answer = calc.logarithm(x);
                break;
            case "SQRT":
                answer = calc.sqrt_f(x);
                break;
        }

        req.setAttribute("answer", String.valueOf(answer));
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);

    }
}
