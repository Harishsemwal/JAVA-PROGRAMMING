import java.util.HashSet;
import java.util.Set;

public class SetProgram {
    public static void main(String[] args) {
        Set <Integer> nums = new HashSet<Integer>();

        for(int i = 0; i < 5; i++){
            nums.add(i);
        }
        nums.add(3);
        // it does not contain duplicate value...

        for(int n : nums){
            System.out.println(n);
        }
    }
}

// 11 : 24 : 35
