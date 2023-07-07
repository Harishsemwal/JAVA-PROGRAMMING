// Create a Login form having User-Id and Password fields. After submitting the form matches
// the user-id and password with existing user-id and password. If user-id and password match a
// welcome message should be appear.

import java.util.*;

import javax.security.auth.login.LoginContext;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class newprogram26 extends Frame{
    private Label UserLabel;
    private Label passwordLabel;
    private TextField userField;
    private TextField passwoField;
    private Button lButton;

    public newprogram26()
    {
        setTitle("Login Form");
        setSize(300, 200);
        setLayout(new FlowLayout());

        UserLabel = new Label("User ID:");
        add(UserLabel);

        userField = new TextField(20);
        add(userField);

        passwordLabel = new Label("Password: ");
        add(passwordLabel);

        passwoField = new TextField(20);
        passwoField.setEchoChar('*');
        add(passwoField);

        lButton = new Button("Login");
        lButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String uString = userField.getText();
                String passwoString = passwoField.getText();

                if(uString.equals("harishsemwal581@gmail.com")&&passwoString.equals("HarishBhaii")){
                    showMessageDialog("Welcome, "+uString+"!");
                }
                else{
                    showMessageDialog("Invalid User Id Or Password.");
                }
            }
        });
        add(lButton);
        setVisible(true);
    }

    private void showMessageDialog(String message){
        Dialog dialog = new Dialog(this, "Message");
        dialog.setLayout(new FlowLayout());
        Label lavLabel = new Label(message);
        dialog.add(lavLabel);

        Button clButton = new Button("Close");
        clButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                dialog.dispose();
            }
        });
        dialog.add(clButton);
        dialog.setSize(200, 100);
        dialog.setVisible(true);
    }

    public static void main(String []args){
        newprogram26 loginForm = new newprogram26();
        System.out.println("Harish Semwal");
    }
}