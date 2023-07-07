class parent
{
    private int age;
    private String str;

    public void setname(String name)
    {
        str = name;
    }

    public void setRoll(int val)
    {
        age = val;
    }

    public String getname()
    {
        return str;
    }

    public int getRoll()
    {
        return age;
    }
}
public class inheritanceprog {
    public static void main(String []args)
    {
        parent obj = new parent();
        obj.setRoll(15);
        obj.setname("Harish");

        System.out.println("name: "+ obj.getname());
        System.out.println("age: "+obj.getRoll());
    }
}
