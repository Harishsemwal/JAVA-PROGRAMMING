import java.util.*;

public class CursorsProgram {
    // Enumeration
    public static void main(String[] args) {
        Vector vt = new Vector();
        vt.addElement("One");
        vt.addElement("Two");
        vt.addElement("Three");
        vt.addElement("Four");

        System.out.println(vt);

        Enumeration e = vt.elements();
        while(e.hasMoreElements()){
            String s = (String)e.nextElement();
            //nextElement return objects type value so we will typecast
            System.out.println("s+ "+s.length());
        }
    }
}
