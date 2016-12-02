import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainMenu extends JPanel {
 public MainMenu() {
 }

 public static void main(String[] args) {
	try {
		new MainMenu();
	}catch (IOException e){
		e.printStackTrace();
	}
 }

 public void createMainPanel() {
  this.setLayout(null);
  JLabel label1 = new JLabel("Welcome to Dorm Management System");
  JLabel label2 = new JLabel("Log in as : ");
  
  
  
  
  JButton logButton = new JButton("Sign In");
  JButton infoButton = new JButton("Information");
  JButton exit = new JButton("Exit");
//
  JButton aboutButton = new JButton("About");
  aboutButton.addActionListener(new MyAboutButtonListerener());
 //Bu aralık
  logButton.setBackground(Color.orange);
  infoButton.setBackground(Color.orange);
  exit.setBackground(Color.orange);
  
  logButton.setBounds(100, 50,(getX()/2-150), getY()-100);
  
  this.add(aboutButton);
  this.add(logButton);
  this.add(infoButton);
  this.add(exit);

 }	
 
 
 
}
//
class MyAboutButtonListerener implements ActionListener {
	private JTextField textField;
	private JLabel label;
	
	public void actionPerformed(ActionEvent e){
		label.setText(textField.getText());
		JOptionPane.showMessageDialog(null, "DMS is a software which provides us how many rooms are empty, full and how many room is available to people.");
	}	
}

//Bu aralık