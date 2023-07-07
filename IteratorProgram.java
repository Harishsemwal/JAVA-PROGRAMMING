import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class IteratorProgram {
    public static void main(String[] args) {
        //boolean hasNext();
        //Object next();
        //void remove(); // it is not availabe in Eluminable

        ArrayList a1 = new ArrayList();
        for(int i = 1; i <= 10; i++){
            a1.add(i);
        }

        System.out.println(a1);
        Iterator it = a1.iterator();
        
        while(it.hasNext()){
            Integer I = (Integer)it.next();

            if(I > 3 && I < 8){
                it.remove();
            }

            System.out.println(a1);
        }

        // it can only move single Diraction...
    }
}
