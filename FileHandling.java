// import java.io.*;

// public class FileHandling  {
//     public static void main(String[] args) throws IOException {
//         File f1 = new File("name.txt");

//         f1.createNewFile();
//         System.out.println("is exits: "+f1.exists());
//         System.out.println("size: "+f1.length());
//         System.out.println("name: "+f1.getName());
//         System.out.println(""+f1.canWrite());
//         System.out.println(""+f1.canRead());
//     }
// }


// FileOutputStream

// import java.io.*;

// public class FileHandling
// {
//     public static void main(String[] args) throws IOException {
//        FileOutputStream fout;

//        fout = new FileOutputStream("name.txt", false);

//        String str = "HARISH";
//        char ch[] = str.toCharArray();

//        for(int i = 0; i < str.length(); i++){
//             fout.write(ch[i]);
//        }

//        fout.close();
//     }
// }


// FileInputStream

// import java.io.*;

// public class FileHandling{
//     public static void main(String[] args) throws IOException {
//         FileInputStream fout = new FileInputStream("name.txt");

//         int i;
//         do
//         {
//             i = fout.read();
//             if(i!=-1){
//                 System.out.println((char)i);
//             }
//         }while(i!=-1);

//         fout.close();
//     }
// }


//StringBufferWriter

// import java.io.*;

// class FileHandling{
//     public static void main(String[] args) throws IOException{
//         BufferedWriter bf = new BufferedWriter(new FileWriter("name.txt", true));
//         bf.write("Computer");
//         bf.close();
//     }
// }


//stringBufferReader

// import java.io.*;

// class FileHandling{
//     public static void main(String[] args) throws IOException{
//         BufferedReader rd = new BufferedReader(new FileReader("name.txt"));
//         String str = rd.readLine();

//         System.out.println("string: "+str);

//     }
// }