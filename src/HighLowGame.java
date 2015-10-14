import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(100);
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. do the following 10 times
		for (int i = 10; i > 0; i--) {
			JOptionPane.showMessageDialog(null, "You have " + i
					+ " guesses left!");
			if(i == 0){
				JOptionPane.showMessageDialog(null, "You lose!");
			}
			// 1. ask the user for a guess using a pop-up window, and save their
			// response
			String question = JOptionPane
					.showInputDialog("Give me a guess for a number 1-100");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int a = Integer.parseInt(question);
			// 5. if the guess is correct
			if (a == random) {
				JOptionPane.showMessageDialog(null, "You win!");
			} else {
				if (a > random) {
					JOptionPane.showMessageDialog(null, "Too high");
				}
				if (a < random) {
					JOptionPane.showMessageDialog(null, "Too low");

				}
			}
		}

		// 12. tell them they lose
	}

}
