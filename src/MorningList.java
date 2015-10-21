import javax.swing.JOptionPane;


public class MorningList {
public static void main(String[] args) {

JOptionPane.showMessageDialog(null, "Morning things to get done:");	
JOptionPane.showMessageDialog(null, "Get out of bed!");
JOptionPane.showMessageDialog(null, "Take a shower.");
JOptionPane.showMessageDialog(null,	"Go downstairs, and eat breakfast");
JOptionPane.showMessageDialog(null, "Brush your teeth");
JOptionPane.showMessageDialog(null, "Prepare your lunch and backpack.");
JOptionPane.showMessageDialog(null, "Head on out the door for school!");
String answer = JOptionPane.showInputDialog("Your welcome! (Say thank you)");
	if(answer.equals("Thank You")){
		JOptionPane.showMessageDialog(null, "Your welcome");
		for (int i = 0; i < args.length; i++) {
			
		}
	}
	else{
		JOptionPane.showMessageDialog(null, "YOU SUCK.");
	}
}
	
	
	
	
	
}

