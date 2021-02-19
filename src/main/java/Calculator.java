public class Calculator {
    String name;
    Calculator(String name){
        this.name = name;
    }

    public double sqrt_f(double x){
        double answer = Math.sqrt(x*1.0);
        return answer;
    }
//    Logarithm base natural
//    power function
    public int factorial(int x){
        int fact = 1;
        if(x<0)
            return 0;
        if(x<=1)
            return fact;
        for(int i=2;i<=x;i++)
            fact*=i;
        return fact;
    }
}
