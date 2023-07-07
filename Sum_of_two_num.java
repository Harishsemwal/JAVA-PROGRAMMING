package CLASSES_OBJECTS;
class Calculator
{
    public int add(int num1, int num2)
    {
        return num1+num2;
    }
}

public class Sum_of_two_num {
    public static void main(String [] args)
    {
        Calculator obj = new Calculator();
        int result = obj.add( 2, 5);

        System.out.println(result);
    }
}
