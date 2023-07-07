// Create a program to generate two threads, one thread will print odd numbers and second thread will print even numbers between 1 to 20 numbers. 
import java.util.*;
class alpha extends Thread
{
    public void run(){
        for(int i = 1; i <= 20; i++){
            if(i%2==0){
                System.out.println("ThreadA: "+ i);
            }
        }
    }
}

class beta extends Thread
{
    public void run(){
        for(int i = 1; i <= 20; i++){
            if(i%2!=0){
                System.out.println("ThreadB: "+ i);
            }
        }
    }
}

public class newprogram20 {
     public static void main(String[] args) {
        alpha obj1 = new alpha();
        beta obj2 = new beta();

        obj1.start();
        obj2.start();
    }
}
