import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n, x;
        System.out.println("Enter number of Elements in List");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            numbers.add(x);
        }
        Set<Integer> uniq = new HashSet<>(numbers);
        List<Integer> ans = new ArrayList<>(uniq);
        System.out.println("The Elements: ");
        System.out.println(ans);
    }
}
