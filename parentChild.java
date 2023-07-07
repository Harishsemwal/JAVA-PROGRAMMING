import java.lang.invoke.StringConcatFactory;

class parent
{
    public parent()
    {
        System.out.println("Parent Constructor...");
    }
}

class child extends parent
{
    public child()
    {
        System.out.println("Child Constructor...");
    }
}
public class parentChild {
    public static void main(String []args)
    {
        parent obj = new child();
    }
}
