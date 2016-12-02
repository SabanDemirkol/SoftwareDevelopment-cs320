import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class StudentLogin extends JFrame {

	private JLabel lblStudentName, lblPassWord;
	private JTextField txtStudentName;
	private JPasswordField passWord;
	private JButton btnLogin, btnClose;
	private String pwd, user;

	public StudentLogin() {

		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle("Customer Login");
		this.setLayout(null);
		this.setLocation(250, 40);

		lblStudentName = new JLabel();
		lblStudentName.setText("Username:");
		lblStudentName.setBounds(170, 40, 70, 30);

		lblPassWord = new JLabel();
		lblPassWord.setText("Password:");
		lblPassWord.setBounds(170, 100, 70, 30);

		txtStudentName = new JTextField(20);
		txtStudentName.setBounds(240, 40, 200, 30);

		passWord = new JPasswordField(20);
		passWord.setBounds(240, 100, 200, 30);

		btnLogin = new JButton("Login");
		btnLogin.setBounds(230, 160, 75, 30);

		btnClose = new JButton("Close");
		btnClose.setBounds(340, 160, 75, 30);
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		this.add(lblStudentName);
		this.add(txtStudentName);
		this.add(lblPassWord);
		this.add(passWord);
		this.add(btnLogin);
		this.add(btnClose);
		this.setResizable(false);
		this.setSize(600, 280);
		this.setVisible(true);
		repaint();
	}
}
