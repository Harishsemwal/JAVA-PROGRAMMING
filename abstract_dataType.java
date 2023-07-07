class abstract parent
{
    private String name;
    private int age;

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int a)
    {
        age = a;
    }
}

class base extends parent
{
    private int age; 
    private String name;

    void dispData()
    {
        System.out.println("name: "+name);
        System.out.println("age: "+age);
    }
}

public class abstract_dataType {
    public static void main(String []args)
    {
        base obj = new base();
        obj.setAge(5);
        obj.setName("Harish");
    }
}
