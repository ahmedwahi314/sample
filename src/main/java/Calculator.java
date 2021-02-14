public class Calculator {
    String name;
    Calculator(String name){
        this.name = name;
    }
    public int add(int x,int y){
        return x+y;
    }
    public double sqrt_f(double x){
        double answer = Math.sqrt(x*1.0);
        return answer;
    }

}
