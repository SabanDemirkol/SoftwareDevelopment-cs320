import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserLogInPanel extends JPanel {
	 private int width = 600;
	 private int height = 600;
	
	public UserLogInPanel() {
		JFrame frame = new JFrame();
		frame.setSize(width, height);
		createUserPanel(frame);
	 }
	
	public void createUserPanel() {
		this.setLayout(null);
		this.setSize(width, height);
		
		JLabel label1 = new JLabel("Welcome to User interface of DMS");
		JButton applyFormButton = new JButton("Fill up a Form");
		JButton checkRoomButton = new JButton("Check Room");
		JButton checkAllocationButton = new JButton("Check Allocation");
		JButton payButton = new JButton("Pay Fee");
		JButton logOff = new JButton("Log Off");
		
		label1.setBounds(120, -10, 400, 100);
		label1.setForeground(Color.blue);
		label1.setFont(new Font("", Font.BOLD, 20));
		
		applyFormButton.setBounds(200, 150, 200, 30);
		applyFormButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fillForm();
			}
		});
		
		checkRoomButton.setBounds(200, 200, 200, 30);
		checkAllocationButton.setBounds(200, 250, 200, 30);
		
		payButton.setBounds(200, 300, 200, 30);
		payButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				paymentWindow();
			}
		});
		
		logOff.setBounds(450, 520, 120, 30);
		logOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, " You safely logged off ");
				System.exit(0);
			}
		});
		
		this.add(applyFormButton);
		this.add(checkRoomButton);
		this.add(checkAllocationButton);
		this.add(payButton);
		this.add(logOff);
		
		frame.setVisible(true);
	}
	
	public void paymentWindow() {
		int width = 500;
		int height = 300;
		
		JFrame paymentFrame = new JFrame();
		paymentFrame.setSize(width, height);
		paymentFrame.setLayout(null);
		
		JLabel amount = new JLabel(" Dormitory fee is 7500 TL. ");
		amount.setBounds(180, 10, 250, 50);
		
		JLabel explanation = new JLabel("The payment will be withdrawed from your registered account in the system. ");
		explanation.setBounds(25, 40, 500, 50);
		
		JButton approve = new JButton(" Approve payment ");
		approve.setBounds(150, 150, 200, 30);
		approve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, " Payment is successfull ");
				System.exit(0);
			}
		});
		
		
		paymentFrame.add(amount);
		paymentFrame.add(approve);
		paymentFrame.add(explanation);
		paymentFrame.setVisible(true);
	}
	
	public void fillForm() {
		
		JFrame formFrame = new JFrame();
		formFrame.setSize(width, height);
		formFrame.setLayout(null);
		
		String[] priorityOptions = new String[] {"Scholarship", "Disabled"};
		String[] genderOptions = new String[] {"Male", "Female"};
		
		JLabel label1 = new JLabel(" Application Form ");
		JLabel explanation = new JLabel( " Please fill the following questions: ");
		JTextField name = new JTextField("Enter your name: ");
		JTextField surname = new JTextField("Enter your surname: ");
		JComboBox<String> gender = new JComboBox<>(genderOptions);
		JComboBox<String> priority = new JComboBox<>(priorityOptions);	
		JButton apply = new JButton("Apply");
		
		label1.setBounds(220, -10, 400, 100);
		label1.setForeground(Color.blue);
		label1.setFont(new Font("", Font.BOLD, 20));
		
		explanation.setBounds(10, 50, 400, 100);
		name.setBounds(50, 150, 300, 30);
		surname.setBounds(50, 200, 300, 30);
		gender.setBounds(50, 250, 100, 30);
		priority.setBounds(50, 300, 100, 30);
		
		apply.setBounds(250, 500, 100, 30);
		apply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, " Application is successfull. ");
				System.exit(0);
			}
		});
		
		formFrame.add(label1);
		formFrame.add(explanation);
		formFrame.add(name);
		formFrame.add(surname);
		formFrame.add(gender);
		formFrame.add(priority);
		formFrame.add(apply);
		
		formFrame.setVisible(true);
		
	}
}
