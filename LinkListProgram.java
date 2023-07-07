import java.util.LinkedList;

public class LinkListProgram {
    public static void main(String[] args) {
        LinkedList<String>list = new LinkedList<String> ();
        list.addFirst("Harish");
        list.addLast("Semwal");
        list.add(1, "Prasad");
        System.out.println(list.getFirst());
        System.out.println(list.get(1));
        System.out.println(list.getLast());
        
    }
}
