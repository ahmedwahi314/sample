import java.util.Scanner;

public class Driver {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Boolean flag = true;
        while(flag) {
            System.out.println("0. Exit Session 1. Find square root");
            int option = sc.nextInt();
            Calculator cal = new Calculator("my_calc");
            switch (option) {
                case 0:
                    System.out.println("Bye");
                    flag = false;
                    break;
                case 1:
                    System.out.println("Enter number");
                    double x = sc.nextDouble();
                    System.out.println(cal.sqrt_f(x));
                    break;
                default:
                    System.out.println("Sorry wrong option");
            }
        }
    }

}
