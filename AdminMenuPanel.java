
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AdminMenuPanel extends JPanel {
	private int width = 600;
	private int height = 600;

	public AdminMenuPanel() {
		
		JFrame frame = new JFrame();
		frame.setSize(width, height);
		this.setLayout(null);
		
		JLabel welcome = new JLabel("Welcome to Admin interface of DMS");
		JButton checkStudents = new JButton("Check students");
		JButton checkStatus = new JButton("Check status of the rooms");
		JButton startAllocate = new JButton("Start allocation");
		JButton reAllocate = new JButton("Start reallocation");
		JButton delete = new JButton("Delete students");
		JButton logOff = new JButton("Log Off");
		
		welcome.setBounds(120, -10, 400, 100);
		welcome.setForeground(Color.blue);
		welcome.setFont(new Font("", Font.BOLD, 20));
		
		checkStudents.setBounds(200, 150, 200, 30);
		checkStatus.setBounds(200, 200, 200, 30);
		startAllocate.setBounds(200, 250, 200, 30);
		reAllocate.setBounds(200, 300, 200, 30);
		delete.setBounds(200, 350, 200, 30);
		
		logOff.setBounds(450, 520, 120, 30);
		logOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, " You safely logged off ");
				System.exit(0);
			}
		});
		
		this.add(welcome);
		this.add(checkStudents);
		this.add(checkStatus);
		this.add(startAllocate);
		this.add(reAllocate);
		this.add(delete);
		this.add(logOff);
		frame.add(this);
		
		frame.setVisible(true);
	}


}