import java.util.Scanner;

class CalculateHeight
{
    private int lenght, breath, height;

    public void setDiamention(int lenght, int breath, int Height)
    {
        this.lenght = lenght;
        this.breath = breath;
        this.height = Height;
    }

    public void getDiamention()
    {
        System.out.println("Length: "+ lenght);
        System.out.println("Breath: "+breath);
        System.out.println("Height: "+height);

        System.out.println("The area is: "+(lenght*breath*height));
    }
}

class area_of_the_box
{
    public static void main(String args[])
    {
        System.out.println("Enter the lenght: ");
        Scanner sc = new Scanner(System.in);
        int lenght = sc.nextInt();

        System.out.println("Enter the breath: ");
        int breath = sc.nextInt();

        System.out.println("Enter the Height: ");
        int height = sc.nextInt();

        CalculateHeight obj = new CalculateHeight();

        obj.setDiamention(lenght, breath, height);
        obj.getDiamention();
    }
}
