import java.util.Scanner;

public class Student {
    private int ID;
    private String name;
    private String branch;
    private String city;
    private String university;

    // Constructor with all arguments
    public Student(int ID, String name, String branch, String city, String university) {
        this.ID = ID;
        this.name = name;
        this.branch = branch;
        this.city = city;
        this.university = university;
    }

    // Constructor with four arguments
    public Student(int ID, String name, String branch, String city) {
        this(ID, name, branch, city, null);
    }

    // Constructor with three arguments
    public Student(int ID, String name, String branch) {
        this(ID, name, branch, null);
    }

    // Constructor with two arguments
    public Student(int ID, String name) {
        this(ID, name, null);
    }

    // Constructor with one argument
    public Student(int ID) {
        this(ID, null);
    }

    public void displayInfo() {
        System.out.println("Student ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("City: " + city);
        System.out.println("University: " + university);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student ID: ");
        int ID = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the Branch: ");
        String branch = scanner.nextLine();
        System.out.println("Enter the city: ");
        String city = scanner.nextLine();
        System.out.println("Enter the University: ");
        String university = scanner.nextLine();

        Student student = new Student(ID, name, branch, city, university);
        System.out.println("**********************");
        System.out.println("Student Details:");
        System.out.println("ID: " + student.ID);
        System.out.println("Name: " + student.name);
        System.out.println("Branch: " + student.branch);
        System.out.println("City: " + student.city);
        System.out.println("University: " + student.university);
    }
}
