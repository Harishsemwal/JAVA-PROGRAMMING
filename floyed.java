import java.util.*;
public class floyed {
    public static void main(String []args)
    {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int k = 1;
        for(int i = 0; i < num ; i++)
        {
            for(int j = 0; j < num; j++)
            {
                if(j < i)
                {
                    System.out.print(k+" ");
                    k++;
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
