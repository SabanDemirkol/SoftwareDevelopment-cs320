import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
}
