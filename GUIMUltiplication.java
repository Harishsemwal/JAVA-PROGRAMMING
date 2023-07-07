import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GuiM extends Frame {
    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b1;

    public GuiM() {
        setTitle("Calculator: ");
        setSize(300, 200);
        setLayout(new FlowLayout());

        l1 = new Label("First number: ");
        l2 = new Label("Second number: ");
        t1 = new TextField(12);
        t2 = new TextField(12);
        b1 = new Button("Multiplay");
        l3 = new Label("Result");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        
        add(b1);

        add(l3);


        setVisible(true);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());

                int mul = num1 * num2;
                l3.setText(" "+mul);
            }
        });

    }
}

public class GUIMUltiplication {
    public static void main(String[] args) {
        GuiM obj = new GuiM();
    }
}
