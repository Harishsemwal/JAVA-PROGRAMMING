interface alpha
{
    void alphaDisplay();
}

interface beta
{
    void betaDisplay();
}

class gamma implements alpha, beta
{
    public void alphaDisplay()
    {
        System.out.println("This is alpha...");
    }

    public void betaDisplay()
    {
        System.out.println("This is Beta...");
    }
}

public class usingInterFace {
    // using interface perform multiple inheritance...
    public static void main(String args[])
    {
    gamma obj = new gamma();
    obj.alphaDisplay();
    obj.betaDisplay();
    }
}
