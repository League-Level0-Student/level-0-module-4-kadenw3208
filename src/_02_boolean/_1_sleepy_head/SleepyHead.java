package _02_boolean._1_sleepy_head;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		// Write code to ask the user what day it is.
        String input=JOptionPane.showInputDialog("What day is it?");
        boolean isWeekendOrNot=false;
        if(input.equals("Saturday")||(input.equals("Sunday"))) {
        	isWeekendOrNot=true;
        }
		// Set the boolean isWeekend based on the value they enter
		if(isWeekendOrNot==true) {
			JOptionPane.showMessageDialog(null, "Congrats! You get to sleep in!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Get out of bed and go to school!");
		}
		// If it is the weekend, tell the user they get to sleep in.
		
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		
		// Write code to ask the user what percentage they scored in their last exam
String percentage=JOptionPane.showInputDialog("Enter the percentage you scored in your last exam.");
double dou=Double.parseDouble(percentage);
if (dou>=70) {
JOptionPane.showMessageDialog(null, "Congrats! you passed the exam!");
}else {
JOptionPane.showMessageDialog(null, "Better luck next time!");
}
//}
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		
		// If the user passed the exam, congratulate them
		
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes")) {
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true

		JOptionPane.showMessageDialog(null, "The game is over.");}
		// Tell the user "game is over" 
		}
		
		/***********************   RED SQUARE  ********************/
		
		
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String input2=JOptionPane.showInputDialog("What color would you like to draw with?");
		boolean isRedOrNot=false;
		
			if(input2.equals("Red")) {
				isRedOrNot=true;
			}
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		String input3=JOptionPane.showInputDialog("What shape do you want to draw with?");
		boolean isSquareOrNot=false;
		if(input3.equals("Square")) {
			isSquareOrNot=true;
		}
		 //Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		 //otherwise, tell the user you don't know how to draw that shape
		
if (isRedOrNot==true&&isSquareOrNot==true) {
	drawRedSquare();
}

}
	
static void drawRedSquare() {
		Robot rob = new Robot();
		// Complete the rest of this method
		rob.penDown();
		rob.setPenColor(Color.red);
		for(int i=0; i<4; i++) {
			
		
		rob.move(100);
		rob.turn(90);
		}}	
}
