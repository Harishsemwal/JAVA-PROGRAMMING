public class ThreadDemo implements Runnable {
    public void run()
    {
        for(int counter = 0; counter <= 50; counter++){
            System.out.println(counter +" ");
        }
    }

    public static void main(String[] args) {
        Thread dmo = new Thread(new ThreadDemo());
        dmo.start();
    }
}
