package calc;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.PropertySource;

import java.lang.Math;
public class Calculator {
    private String name;
    private final static Logger logger = LogManager.getLogger(Calculator.class);
    String log4jConfigFile = "some/path/log4j.properties";
//    PropertySource("");
    Calculator(String name){
//        PropertyConfigurator.configure(log4jConfigFile);
        this.name = name;
    }

    public double sqrt_f(double x){
        logger.info("[SQRT_FN] : "+x);
        double answer = Math.sqrt(x);
        logger.info("[SQRT_FN - RESULT] : "+answer);
        return answer;
    }
    public double logarithm(double x){
        logger.info("[LOG] : "+x);
        logger.info("[LOG - RESULT] : "+Math.log(x));
        return Math.log(x);
    }
    public double power(double x,int y){
        logger.info("[POWER] : "+x+", "+y);
        double answer =1.0;
        if(y==0) {
            logger.info("[POWER - RESULT] : "+answer);
            return answer;
        }
        for(int i=0;i<y;i++)
            answer *= x;
        logger.info("[POWER - RESULT] : "+answer);
        return answer;
    }
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
