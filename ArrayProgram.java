import java.util.ArrayList;
import java.util.Collection;

public class ArrayProgram {
    public static void main(String[] args) {

        ArrayList <Integer> nums = new ArrayList <Integer> ();
        // Collection <Integer> nums = new ArrayList <Integer> ();
        //Here I use Integer Which denotes the implimentaion of Generic.
        nums.add(6);
        nums.add(9);
        nums.add(4);
        nums.add(3);
        nums.add(4);
        // nums.add("7"); it can Genrates error.

        System.out.println(nums.get(2));
        System.out.println(nums.indexOf(4));

        // for(int n : nums){
        //     System.out.println(n);
        // }
    }
}
