import java.awt.*;
import java.awt.event.*;
public class CountryCapitalQuiz extends Frame {
    private List countryList;
    private List capitalList;
    private Button checkButton;
    private String[] countries = { "India", "United States", "United Kingdom" };
    private String[] capitals = { "New Delhi", "Washington D.C.", "London" };
    public CountryCapitalQuiz() {
        setTitle("Country Capital Quiz");
        setSize(400, 200);
        setLayout(new FlowLayout());
        countryList = new List(3, false);
        for (String country : countries) {
            countryList.add(country);
        }
        add(countryList);
        capitalList = new List(3, false);
        for (String capital : capitals) {
            capitalList.add(capital);
        }
        add(capitalList);
        checkButton = new Button("Check Answer");
        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedCountryIndex = countryList.getSelectedIndex();
                int selectedCapitalIndex = capitalList.getSelectedIndex();
                if (selectedCountryIndex != -1 && selectedCapitalIndex != -1) {
                    String selectedCountry = countryList.getItem(selectedCountryIndex);
                    String selectedCapital = capitalList.getItem(selectedCapitalIndex);
                    if (capitals[selectedCountryIndex].equals(selectedCapital)) {
                        showMessageDialog("Correct answer!");
                    } else {
                        showMessageDialog("Incorrect answer. The capital of " + selectedCountry + " is " + capitals[selectedCountryIndex]);
                    }
                } else {
                    showMessageDialog("Please select a country and its capital");
                }
            }
        });
        add(checkButton);
        setVisible(true);
    }
    private void showMessageDialog(String message) {
        Dialog dialog = new Dialog(this, "Message");
        dialog.setLayout(new FlowLayout());
        Label label = new Label(message);
        dialog.add(label);
        Button closeButton = new Button("Close");
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });
        dialog.add(closeButton);
        dialog.setSize(300, 100);
        dialog.setVisible(true);
    }
    public static void main(String[] args) {
        CountryCapitalQuiz quiz = new CountryCapitalQuiz();
        System.out.println("Implemented By:Rohit Negi   Section:G   Roll No:58");
    }
}
