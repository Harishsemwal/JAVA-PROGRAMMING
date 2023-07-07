import java.io.File;
import  java.io.IOException;

public class fileclass {
    public static void main(String[] args)  throws IOException {
        File f1 = new File("index.txt");
        System.out.println("it exits: "+f1.exists());
        f1.createNewFile();

        System.out.println("it exits: "+f1.exists());
        System.out.println("file size: "+f1.getName());
        System.out.println("lenght: "+f1.length());
        System.out.println("Can write: "+f1.canWrite());
    }
}
