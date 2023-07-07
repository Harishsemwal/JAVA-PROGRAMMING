import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUI extends Frame {
    Label l1, l2, l3;
    TextField t1, t2;
    Button b1, b2;

    public GUI() {
        setTitle("TWO SUM");
        setSize(800, 600);
        setLayout(new FlowLayout());

        l1 = new Label("First Number: ");
        add(l1);

        t1 = new TextField(5);
        add(t1);

        l2 = new Label("Second Number: ");
        add(l2);

        t2 = new TextField(5);
        add(t2);

        b1 = new Button("Sum");
        b2 = new Button("mul");
        add(b1);
        add(b2);

        l3 = new Label("Result: ");

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int value = num1 + num2;
                l3.setText(" " + value);
            }

        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int value = num1 * num2;
                l3.setText(" " + value);
            }
        });
        add(l3);
        setVisible(true);

    }
}

public class GUIPrograms {
    public static void main(String[] args) {
        GUI obj = new GUI();
    }
}
