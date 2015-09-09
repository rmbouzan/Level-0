import javax.swing.JOptionPane;


public class Airline {
public static void main(String[] args) {
	// Copyright Wintriss Technical Schools 2013
	

	/**
	 * Airline registration 
	 * 
	 * You are writing a program for a new airline to take their registration information at the check-in counter
	 * and print their boarding pass. You need to collect the following information: 
	 * 		First name 
	 * 		Last name
	 * 		Destination airport 
	 * 		Birthday (for security purposes) 
	 * 		Male/female (for security purposes) 
	 * 
	 * Print the boarding pass in this format:
	 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
	 * Traveling to: DESTINATION
	 * 
	 * Toolbox: main() method, JOptionPane.showInputDialog, variables
	 * 
	 **/
	JOptionPane.showMessageDialog(null,"Welcome to Ryan Airlines! Please list the following information:");
	String firstname = JOptionPane.showInputDialog("What is your First name?");
	String lastname = JOptionPane.showInputDialog("What is your Last name?");
	String airport = JOptionPane.showInputDialog("What is your Destination?");
	String birthday = JOptionPane.showInputDialog("What is your Birthday Month?"); 
	String gender = JOptionPane.showInputDialog("What is your gender?");
	JOptionPane.showMessageDialog(null,"Your information should be: Name: "+firstname+" , "+lastname+"\nDestination: "+airport+"\nDate of Birth: "+birthday+" \nGender: "+gender+" \nThank you for completing your information!");
}
}
	
	
	