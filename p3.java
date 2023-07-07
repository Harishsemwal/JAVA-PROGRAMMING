// nested try catch...
public class p3 {
    public static void main(String[] args) {
        try {
            int a = 2, b = 4, c = 2, x = 7, z;
            int p[] = { 3 };
            p[3] = 33;
            try {
                z = x / ((b * b) - 4 * a * c);
                System.out.println("The value of z is: " + z);
            } catch (Exception e) {
                System.out.println("Devision By Zero... Occurs...");
            }
        } catch (Exception e) {
            System.out.println("Array Index Out-Of-Bound...");
        }
    }
}
