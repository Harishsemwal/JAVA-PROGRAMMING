//multiple catch statements...
public class p4 {
    public static void main(String[] args) {
        int arr[] = { 5, 10 };
        int b = 10;
        try {
            int x = arr[0] / (b - arr[1]);
        } catch (ArithmeticException e) {
            System.out.println("Division By Zero...");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array Index out of Bound...");
        } catch (ArrayStoreException e) {
            System.out.println("Wrong Data Type...");
        } catch (Exception e) {
            System.out.println("Handle By all exceptions....");
        }
        int y = arr[1] / arr[0];
        System.out.println("y: " + y);
    }
}
