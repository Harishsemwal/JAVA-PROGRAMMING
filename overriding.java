class a
{
    public void parentFun()
    {
        System.out.println("parent Function...");
    }
}

class b extends a
{
    public void parentFun()
    {
        System.out.println("Child Function...");
    }
}
public class overriding {
    public static void main(String []args)
    {
        a obj = new b();
        obj.parentFun();
    }
}
