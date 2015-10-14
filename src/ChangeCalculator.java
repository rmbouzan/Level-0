// Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String answer = JOptionPane.showInputDialog("How many nickeles do you have in your pocket????");
		// Convert their answer to an int using Integer.parseInt()
int one = Integer.parseInt(answer);
		// Ask the user how many dimes they have, and convert their answer
String answer2 = JOptionPane.showInputDialog("How many dimes do you have???");
int two = Integer.parseInt(answer2);
		// Ask the user how many quarters they have, and convert their answer
String answer3 = JOptionPane.showInputDialog("How many quarters do you have?");
int three = Integer.parseInt(answer3);
		// Calculate how much money the user has and save it in a double variable 
one=one*5;
two=two*10;
three=three*25;

		// Tell the user how much money they have
double money = one+two+three;
money=money/100;
JOptionPane.showMessageDialog(null,"You have $"+money+" on yourself!");
	}
}

