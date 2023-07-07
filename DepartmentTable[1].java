package Term_work;

import java.awt.*;                                                        
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DepartmentTable extends Frame implements ActionListener {
	TextField txt1, txt2, txt3;
	Button btn1,btn2,btn3,btn4;
	Label lbl1,lbl2,lbl3;
	Panel p1,p2;
	static Connection cn = null;
	static Statement st = null;
	static ResultSet rs;
	DepartmentTable(){
		setLayout(new FlowLayout());
		setSize(400,400);
		p1 = new Panel(new FlowLayout());
		p2 = new Panel(new FlowLayout());
		lbl1 = new Label("Dept no");
		lbl2 = new Label("Dept Name");
		lbl3 = new Label("Location");
		txt1 = new TextField("");
		txt2 = new TextField("");
		txt3 = new TextField("");
		p1.setBounds(MAXIMIZED_BOTH, ABORT, 200, 400);
		p2.setBounds(MAXIMIZED_BOTH, ABORT, 200, 400);
		p1.add(lbl1);
		p1.add(txt1);
		p1.add(lbl2);
		p1.add(txt2);
		p1.add(lbl3);
		p1.add(txt3);
		btn1 = new Button("First");
		btn2 = new Button("Previous");
		btn3 = new Button("Next");
		btn4 = new Button("Last");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);
		p2.add(btn4);
		add(p1);
		add(p2);
		setVisible(true);
	}
	private void readFirstData() {
        try {
            rs.first();
            displayCurrentData();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void readLastData() {
        try {
            rs.last();
            displayCurrentData();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void readNextData() {
        try {
            if (!rs.isLast()) {
                rs.next();
                displayCurrentData();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void readPreviousData() {
        try {
            if (!rs.isFirst()) {
                rs.previous();
                displayCurrentData();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void displayCurrentData() {
        try {
            String dept_no = rs.getString("dept_no");
            String dept_name = rs.getString("dept_name");
            String location = rs.getString("location");
            txt1.setText(dept_no);
            txt2.setText(dept_name);
            txt3.setText(location);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new DepartmentTable();
		Class.forName("com.mysql.cj.jdbc.Driver");
		cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
		st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		rs = st.executeQuery("select * from department_data");
	    System.out.println("\n-----------------------End of Program-------------------------\n");
		System.out.println("***************************************************************");
		System.out.println("Implemented By: Abhinav\t Class Roll No. 03\t CSE(G)");
		System.out.println("***************************************************************");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
            readFirstData();
        } else if (e.getSource() == btn2) {
            readPreviousData();
        } else if (e.getSource() == btn3) {
            readNextData();
        } else if (e.getSource() == btn4) {
            readLastData();
        }
	}

}
