import java.util.Vector;

public class vectorProgram {
    public static void main(String[] args) {
        Vector<Integer>vt = new Vector<Integer>();

        vt.add(5);
        vt.add(6);
        vt.add(7);
        vt.add(5);

       
        vt.remove(1);

        for(int n: vt){
            System.out.println(n);
        }

        System.out.println("Campacity: "+vt.capacity());
    }
}
