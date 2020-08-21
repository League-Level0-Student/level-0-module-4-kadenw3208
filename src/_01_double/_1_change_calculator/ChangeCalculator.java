package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {
String input=JOptionPane.showInputDialog("How many nickels do you have?");
		// Ask the user how many nickels they have
int nickels=Integer.parseInt(input);

		// Convert their answer to an int.   Hint: Integer.parseInt()  
String input2=JOptionPane.showInputDialog("How many dimes do you have?");
int dimes=Integer.parseInt(input2);

		// Ask the user how many dimes they have, and convert their answer
String input3=JOptionPane.showInputDialog("How many quarters do you have?");
		// Ask the user how many quarters they have, and convert their answer
int quarters=Integer.parseInt(input3);
		// Calculate how much money the user has.  Hint: Use a double variable 
double quarter=0.25*quarters;
double nickel=0.05*nickels;
double dime=0.1*dimes;

JOptionPane.showMessageDialog(null, "You have $"+(nickel+dime+quarter)+" dollars.");
		// Tell the user how much money tshey have in dollars and cents format (e.g. $6.75)

	}
}

