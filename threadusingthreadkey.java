class alpha extends Thread
{
    public void run(){
       for(int i = 0; i < 10; i++){
        System.out.println("i = "+i+"Thead A..");
       } 
    }
}

class beta extends Thread
{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("i = "+i+"Thread B..");
        }
    }
}
public class threadusingthreadkey {
    public static void main(String[] args) {
        alpha obj1 = new alpha();
        beta obj2 = new beta();

        obj1.start();
        obj2.start();
    }
}
