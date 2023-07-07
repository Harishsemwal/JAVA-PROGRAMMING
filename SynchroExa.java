import java.util.*;

class Account {
    private int val;
    public Account(int val) {
        this.val = val;
    }

    public boolean isuff(int w) {
        if (val > w) {
            return true;
        } else {
            return false;
        }
    }

    public void widrow(int amt) {
        val = val - amt;
        System.out.println("widrow money " + amt);
        System.out.println("Your Current Balance is: " + val);
    }
}

class customore implements Runnable {
    private Account account;
    public customore(Account account) {
        this.account = account;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the widrow ammount: ");
        int amt = sc.nextInt();
        synchronized(account){
            if (account.isuff(amt)) {
                account.widrow(amt);
            } else {
                System.out.println("Insufficient Balance...");
            }
        }
    }
}

public class SynchroExa {
    public static void main(String[] args) {
        Account obj = new Account(1000);
        customore c1 = new customore(obj);
        customore c2 = new customore(obj);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();
    }
}