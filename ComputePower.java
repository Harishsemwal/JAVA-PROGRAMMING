import java.util.*;

public class ComputePower {
    public static void main(String[] args) {
        int num = 2;
        int power = 1;
        int exponent = 10;

        for (int i = 1; i <= exponent; i++) {
            power = power * num;
            System.out.println(num + " raised to the power of " + i + " is " + power);
        }
    }
}
