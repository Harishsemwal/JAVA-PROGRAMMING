import java.util.Scanner;

public class Conditional_numberIsGraterLessOreEqual {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Both are Equal. ");
        } else {
            if (a > b) {
                System.out.println("a is grater than b. ");
            } else {
                System.out.println("b is grater than a. ");
            }
        }

    }
}
