import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserLogInPanel extends JPanel {
	 private int width = 600;
	 private int height = 600;
	
	public void createUserPanel() {
		this.setLayout(null);
		this.setSize(width, height);
		
		JLabel label1 = new JLabel("Welcome to User interface of DMS");
		JButton applyFormButton = new JButton("Fill up a Form");
		JButton checkRoomButton = new JButton("Check Room");
		JButton checkAllocationButton = new JButton("Check Allocation");
		JButton payButton = new JButton("Pay Fee");
		JButton logOff = new JButton("Log Off");
		
		this.add(applyFormButton);
		this.add(checkRoomButton);
		this.add(checkAllocationButton);
		this.add(payButton);
		this.add(logOff);
	}
}
