package Harish;
import java.util.*;
public class itemss {

    public static void main(String[] args) {
        Map<String, Double> items = new HashMap<>();
        items.put("item1", 45.50);
        items.put("item2", 35.00);
        items.put("item3", 41.30);
        items.put("item4", 55.00);
        items.put("item5", 24.00);
        List<Map.Entry<String, Double>> sortedItems = new ArrayList<>(items.entrySet());
        Collections.sort(sortedItems, (a, b) -> b.getValue().compareTo(a.getValue()));
        System.out.println("Top Three Items:");
        for (int i = 0; i < 3 && i < sortedItems.size(); i++) {
            Map.Entry<String, Double> entry = sortedItems.get(i);
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("Implemented By:Rohit Negi   Section:G   Roll No:58");
    }
}
