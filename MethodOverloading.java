import java.util.*;

public class MethodOverloading {
    public int calc(int a, int b) {
        return a + b;
    }
    public int calc(int a, int b, int c) {
        return a + b + c;
    }
    public double calc(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        MethodOverloading c = new MethodOverloading();
        
        int sum1 = c.calc(2, 3);
        System.out.println("Sum of 2 and 3 is " + sum1);
    
        int sum2 = c.calc(2, 3, 4);
        System.out.println("Sum of 2, 3, and 4 is " + sum2);
        
        double sum3 = c.calc(2.5, 3.7);
        System.out.println("Sum of 2.5 and 3.7 is " + sum3);
    }
}

