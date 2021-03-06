import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.log4j.Property;
public class Calculator {
    String name;
    private final static Logger logger = LogManager.getLogger();

    Calculator(String name){
        this.name = name;
        logger.info("[CALCULATOR " + name + " CREATED]");
    }

    public double sqrt_f(double x){
        logger.info("[SQRT_FN] : "+x);
        double answer = Math.sqrt(x);
        logger.info("[SQRT_FN - RESULT] : "+answer);
        return answer;
    }
//    Logarithm base natural
//    power function
    public int factorial(int x){
        int fact = 1;
        logger.info("[FACTORIAL] : "+x);
        if(x<0){
            logger.info("[FACTORIAL - RESULT] : 0");
            return 0;
        }
        if(x<=1) {
            logger.info("[FACTORIAL - RESULT] : "+fact);
            return fact;
        }
        for(int i=2;i<=x;i++)
            fact*=i;
        logger.info("[FACTORIAL - RESULT] : "+fact);
        return fact;
    }
}
