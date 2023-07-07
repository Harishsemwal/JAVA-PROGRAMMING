import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class writeExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("index.txt");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        char ch[] = str.toCharArray();
        for(int i = 0; i < str.length(); i++)
        {
            fout.write(ch[i]);
        }
        fout.close();
    }
}
