import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AdminLogin extends JFrame {


	private JTextField loginName;
	private JPasswordField loginPassWord;

	public AdminLogin() {
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(600, 280);
		this.setLocation(250, 40);
		this.setVisible(true);
		this.setTitle("Admin Login");
		this.setLayout(null);

		JLabel label1 = new JLabel("Administrator Name: ");
		label1.setBounds(50, 54, 120, 120);
		this.add(label1);

		JLabel label2 = new JLabel("PassWord: ");
		label2.setBounds(100, 85, 120, 120);
		this.add(label2);

		// Administrator Log Name
		loginName = new JTextField();
		loginName.setBounds(180, 100, 290, 25);
		this.add(loginName);

		// Administrator Log PassWord
		loginPassWord = new JPasswordField();
		loginPassWord.setBounds(180, 131, 290, 25);
		this.add(loginPassWord);

		JButton BtnLogin = new JButton("Login");
		BtnLogin.setBounds(380, 190, 90, 25);
		this.add(BtnLogin);
		repaint();
		
		 JButton btnClose = new JButton("Close");
		btnClose.setBounds(480, 190, 90, 25);
		this.add(btnClose);
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}

}
