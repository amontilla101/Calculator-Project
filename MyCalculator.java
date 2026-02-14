// @author Alexa Montilla 
// Copyright © Montilla 2025. All rights reserved. 

// MyCalculator Project by Alexa Montilla (10/30/25)
// In this project I will create a basic console calculator program.

// Sources: AI Dev Workshop from Prof.Madramootoo (10/18/25) 
// Self ChatGPT Study & learn feature only. No code generation! 
// CS LAB Tutoring center - 10/25/25
// CS LAB Tutoring center - 10/27/25 (For revision) 
// Mentor help: Daniel Lunamiranda (crear futuros @ LC)
import java.util.Scanner;

public class MyCalculator {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		String operations = ""; // stores the operation (+, -, *, /, sin x, cos x, tan x)
		String calculatorMode = ""; // store standard or scientific
		boolean userPick = true; // this is restart option 
		String userAnswer;  // This is for Y/N  
	
		// 1. User will be asked for calculator mode while using the do-while loop 
		do {
			System.out.println("Enter the calculator mode: Standard/Scientific?"); // First, create a system.out.println for the user input
			calculatorMode = input.next();
			
			if(calculatorMode.equals("Standard")) {
				System.out.println("The calculator will operate in standard mode."); 
				System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division"); 
			} 
			else { 
				System.out.println("The calculator will operate in scientific mode."); // If user picks scientific 
				 System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, "
			 				+ "'sin' for sin x, 'cos' for cos x, 'tan' for tan x:"); 
			} 
			operations = input.next();  // outside the read next user 
			
			while(calculatorMode.equals("Standard") && !operations.equals("+") && !operations.equals("-") && !operations.equals("*") && !operations.equals("/")) {
				System.out.println("Invalid operator " + operations);
				System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division"); 
				operations = input.next(); 
			} 
			while(calculatorMode.equals("Scientific") && !operations.equals("+") && !operations.equals("-") && !operations.equals("*") && !operations.equals("/") &&
					!operations.equals("sin") && !operations.equals("tan") && !operations.equals("cos")) {
				System.out.println("Invalid operator " + operations);
				System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, "
		 				+ "'sin' for sin x, 'cos' for cos x, 'tan' for tan x:"); 
				operations = input.next(); 
			}
			// 2. The program should then ask the user for the operation to execute (+, -, *, /, sin x, cos x, tan x)
			
			 // I picked switch statement because it is easy to read and to code, compared to if-else statements 
		 	switch(operations) {
		 	case"+": 
		 		double sum = 0; // I need to create a variable for all numbers. So, I initialize the sum with a double
		 		
		 		System.out.println("How many numbers do you want to add?");
		 		int addNum = input.nextInt(); 	// used for loop to run 'addNum' to collect all numbers from user
		 		System.out.println("Enter " + addNum + " numbers");
		 		for(int i = 0; i < addNum; i++) {		// I initialize the sum with a double
					double num = input.nextDouble();
					
					sum += num;	// Reminder: shortcut, sum = sum + number;
		 		}
		 		System.out.println("Result: " + sum); 
		 		break; // stops for each condition 
		 		
		 	case"-": 
		 		
		 		System.out.println("How many numbers do you want to subtract?");
		 		int addSub = input.nextInt(); 
		 		System.out.println("Enter " + addSub + " numbers");
		 		double sub = input.nextDouble(); 
		 		for(int i = 0; i < addSub - 1; i++) {
		 			double num1 = input.nextDouble(); 
		 			
		 			sub -= num1; 
		 		}
		 		System.out.println("Result: " + sub); 
		 		break; 
		 		
		 	case"*": 	
		 		double times = 1; // Reminder: I need to start at 1 for multiplication, not zero
		 		
		 		System.out.println("How many numbers do you want to multiply?"); 
		 		int addNum2 = input.nextInt();  
		 		System.out.println("Enter " + addNum2 + " numbers");
		 		for(int i = 0; i < addNum2; i++) {
		 			double num2 = input.nextDouble(); 
		 			
		 			times *= num2; 
		 		}
		 		System.out.println("Result: " + times); 
		 		break; 
		 	
		 	case"/": 	// now division is tricky because there is no way to divide 0 or 1 here.
		 	// Instead, I added user read, input.nextDouble(); 
		 		System.out.println("How many numbers do you want to divide?"); 
		 		int addNum3 = input.nextInt(); 
		 		
		 		System.out.println("Enter " + addNum3 + " numbers");
		 		double div = input.nextDouble();
		 		for(int i = 0; i < addNum3 - 1; i++) {
		 			double num3 = input.nextDouble(); 
		 			
		 			div /= num3; 
		 		
		 		}
		 		System.out.println("Result: " + div); 
		 		break; 
// |-------------------------------For sin, cos, & tan I need to use Math.cos, Math.sin. & Math.tan-------------------------------|
		 	case"sin": 
		 		System.out.println("Enter a number in radians to find the sine"); 
		 		double sinNumber = input.nextDouble(); 
		 		double result = Math.sin(sinNumber);  // Add the variable inside the Math.sin(); <---- ex: (sinNumber); Same for the rest. 
		 		
		 		// shows off result 
		 		System.out.println("Result: " + result); 
		 		break; 
		 		
		 	case"cos": 
		 		System.out.println("Enter a number in radians to find the cosine"); 
		 		double cosNumber = input.nextDouble(); 
		 		double result2 = Math.cos(cosNumber); 
		 		
		 		System.out.println("Result: " + result2); 
		 		break; 
		 	
		 	case"tan": 
		 		System.out.println("Enter a number in radians to find the tangent");
		 		double tanNumber = input.nextDouble(); 
		 		double result3 = Math.tan(tanNumber); 
		 		
		 		System.out.println("Result: " + result3); // shows off result 
		 		break; 
		 	default: 
		 		System.out.println("Invalid operator"); 
		 		System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, "
		 				+ "'sin' for sin x, 'cos' for cos x, 'tan' for tan x:"); 
		 // Reminder: I can add the standard and Scientific together in switch statements. Don't do if-else for scientific  
		 	} // end switch 
		 
		 	// Asking to restart for user 
		 System.out.println("Do you want to start over? (Y/N)"); 
		 userAnswer = input.next(); 
		
		 if(userAnswer.equals("N")) {
			 userPick = false;
		 }  // Not sure to use a while loop after if? 
		 
		} while(userPick);	 
			System.out.println("Goodbye"); // This is where the program ends 
			
			// (\ ʕ •ᴥ•ʔ Fin ʕ•ᴥ• ʔ/)
	}
	
}
