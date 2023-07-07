class parent
{
    private int num;
    void dispData(int val)
    {
        num = val;
        System.out.println("nums: "+num);
    }
}
class child extends parent
{
    private int num;

    public void setData(int val)
    {
        this.num = val;
        super.dispData(5);
    }

    public void dispDatas()
    {
        System.out.println("nums: "+num);
    }
}

public class SuperKeyword {
    public static void main(String []args)
    {
        child obj = new child();
        obj.setData(8);
        obj.dispData(6);
        obj.dispDatas();
    }
}
