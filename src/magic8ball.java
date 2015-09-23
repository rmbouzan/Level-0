import java.util.Random;

import javax.swing.JOptionPane;

public class magic8ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int random = new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(new Random().nextInt(4));
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("Give me a question");
	// 5. If the random number is 0
if(random == 0)		{
JOptionPane.showMessageDialog(null, "yes");
}
if(random == 1){
	
JOptionPane.showMessageDialog(null, "NO");
}
	// -- tell the user "No"
if(random == 2){
	// 7. If the random number is 2
JOptionPane.showMessageDialog(null, "ASK GOOGLE");
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer
}
if(random == 4){
JOptionPane.showMessageDialog(null, "NO ONE KNOWS");	
}	
	
}
}



