
import java.util.Scanner;

public class newprogram25 {
    public static void main(String[] args) {
        System.out.println("enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] arr = new int[num];
        System.out.println("enter the elements: ");
        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < num - 1; i++){
            for(int j = i+1; j < num; j++){
                if(arr[i] == arr[j]){
                    for(int k = j; k < num; k++){
                        arr[k] = arr[k+1];
                    }
                    num--;
                    j--;
                }
            }
        }

        System.out.println("The elements after removing duplicate: ");
        for(int i = 0; i < num; i++){
            System.out.println(arr[i]+ " ");
        }
    }
}
