import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class file {
   public static void main(String[] args) throws IOException, FileNotFoundException {
        FileInputStream fin = new FileInputStream("max.txt");
        int count1 = 0, count2 = 0;
        while(fin.read()!=-1){
            if(fin.read() == ' '){
                count1++;
            }
        }

        while(fin.read()!=-1){
           count2++;
        }
        int count3 = 0;
        Scanner sc = new Scanner(fin);
        while(sc.hasNextLine()){
            sc.nextLine();
            count3++;
        }
        System.out.println("Spaces: "+count1);
        System.out.println("Character: "+count2);
        System.out.println("Lines: "+count3);
   }


}
