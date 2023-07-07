import javax.swing.*;
import java.awt.*;

public class LayoutManagerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("LayoutManager Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JButton button1 = new JButton("Button 1");
        panel.add(button1, BorderLayout.NORTH);

        JButton button2 = new JButton("Button 2");
        panel.add(button2, BorderLayout.CENTER);

        JButton button3 = new JButton("Button 3");
        panel.add(button3, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setVisible(true);
    }
}
