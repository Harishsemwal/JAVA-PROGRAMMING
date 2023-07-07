import java.util.Scanner;

public class Count_Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        int range1 = 0, range2 = 0, range3 = 0, range4 = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            if (marks[i] >= 81 && marks[i] <= 100) {
                range1++;
            } else if (marks[i] >= 61 && marks[i] <= 80) {
                range2++;
            } else if (marks[i] >= 41 && marks[i] <= 60) {
                range3++;
            } else {
                range4++;
            }
        }
        System.out.println("Number of students who obtained marks:");
        System.out.println("81-100: " + range1);
        System.out.println("61-80: " + range2);
        System.out.println("41-60: " + range3);
        System.out.println("0-40: " + range4);
        sc.close();
    }
}

