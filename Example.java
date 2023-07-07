package pak1;
import pak2;
public class Example {
    public static void main(String []args)
    {
        Student s1 = new Student();
        s1.setData("Harish");
        s1.setRollNo("24");

        System.out.println(s1.getname());
        System.out.println(s1.getrollNo());
    }
}
