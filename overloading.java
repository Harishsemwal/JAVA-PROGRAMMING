class parent
{
    public void add(int a, int b)
    {
        System.out.println("sum: "+(a+b));
    }

    public void add(float a, float b)
    {
        System.out.println("sum: "+(a+b));
    }
}

class overloading
{
    public static void main(String []args)
    {
        parent obj = new parent();
        obj.add(5,6);
        obj.add(5.5f,6.3f);
    }
}