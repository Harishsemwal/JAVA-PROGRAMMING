import java.util.Scanner;

class inputdata
{
    public static void main(String []args)
    {
        System.out.println("Enter the name: ");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.err.println(str);
        str.split(str);
        System.out.println(str);
    }
}