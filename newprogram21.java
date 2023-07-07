/*Write a program to solve the following problem:

Suppose only one berth is available in a train and two passengers are asking for that berth in two different counters. The clerks at different counters sent a request to the server to allot that berth to their passengers. And only one passenger is eligible to get the berth in a train, another passenger get a message “Sorry Berth unavailable”. Solve this problem using synchronized keyword */
import java.util.*;
class berthTrains
{
    private int ticket;
    public berthTrains(int val){
        this.ticket = val;
    }
    public boolean isSuff(int w){
        if(ticket > w){
            return true;
        }
        else{
            return false;
        }
    }

    public void widrowTicket(int num){
        ticket = ticket - num;
        System.out.println("Ticket Allot: "+ num);
        System.out.println("Availabe Tickets: "+ticket);
    }
}

class passengers implements Runnable
{
    private berthTrains accTrain;
    public passengers(berthTrains accTrain){
        this.accTrain = accTrain;
    }

    public void run(){
        Scanner kb = new Scanner(System.in);
        System.out.println("enter (book/not book) 0/1: ");
        int request = kb.nextInt();

        synchronized(accTrain){
            if(accTrain.isSuff(1) || request == 1){
                accTrain.widrowTicket(1);
            }else{
                System.out.println("Ticket is already Booked...");
            }
        }
    }
}

public class newprogram21 {
    public static void main(String[] args) {
        berthTrains iTrain = new berthTrains(1);
        passengers c1 = new passengers(iTrain);
        passengers c2 = new passengers(iTrain);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();
    }
}
