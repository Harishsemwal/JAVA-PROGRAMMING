import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println("Enter the Devisor: ");
        int dev = sc.nextInt();

        try{
            int ans = num/dev;
        }
        catch(ArithmeticException e){
            System.out.println("Devsion By Zero...");
        }

        System.out.println("Multiplication: "+(num+dev));
    }
}
