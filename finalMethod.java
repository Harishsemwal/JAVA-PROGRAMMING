class a
{
    public final void parentFun()
    {
        System.out.println("parent Function...");
    }
}

class b extends a
{
    // it can not be overriding

    
    // public void parentFun()
    // {
    //     System.out.println("Child Function...");
    // }
}

public class finalMethod {
    public static void main(String []args)
    {
        a obj = new b();
        obj.parentFun();
    }
}
