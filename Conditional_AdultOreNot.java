import java.util.*;

public class Conditional_AdultOreNot {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 18)
        {
            System.out.println("You can Vote ");
        }
        else
        {
            System.out.println("You can not Vote ");
        }
    }
}
