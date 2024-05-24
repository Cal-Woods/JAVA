import java.util.Scanner;
import java.util.Random;
// imports two classes from the java.util package: Scanner(reads files and listens for keyboard input) and Random number generator(provides functions for generating random numbers).

public class calHigherLower {
	
	public static int getRandomNumber()
	//A method, created by me, called getRandomNumber which is static, meaning that it is always accessible from anywhere in this application, and int refers to the return value of this method, it means the method will perform its function and will return an Integer; that is a whole number and not a half-number like 10.4
	{

		Random rand = new Random();
		//A Random class reference variable that I named rand, this will allow me to use the Random class method and it's variants.

		return rand.nextInt(100);
		//Returns the value of variable rand in int (numbers) out of 100
	}

	public static void main(String[] args)
	// Declaring start of application
	{

		Scanner scanner = new Scanner(System.in);
		// Creating a Scanner reference variable, this will setup a class instance called Scanner which in turn will allow me to use methods for reading user input.
		
		System.out.println("This is a game of higher or lower... you must guess if the next number will be HIGHER... OR LOWER than the last one");
		//Prints a message, everything in the parenthesis qoute marks, to screen

		boolean gameover = false;
		//Creates a true or false variable called a boolean, which is like a switch that can only ever be true or false, and sets it to false, indicated by the equals sign and the false keyword.

		int firstnumber = getRandomNumber();
		//Creates an int variable called firstnumber; the equals signs assigns a specified value, in this case, the getRandomNumber method

		System.out.println("The first number is: " + firstnumber);
		//Prints message in the bracketed qoutes; the plus sign followed by a name means that it will print the value of that variable, if it exists


		while (!gameover)
			//Creates a while loop. A while loop checks if a variable is a certain value every millisecond, and if the variable remains the same, the code inside the while loop will execute over and over until the specified value changes
		{

			System.out.println("Is the next number HIGHER, or LOWER?");
			//Prints a message to screen; inside qoutes and brackets

			String answer = scanner.next();
			//Creates variable with a String value called answer; (Scanner.next()), means that the value must be input by user

			answer = answer.toLowerCase();
			//converts value of answer variable to lower case

			int secondnumber = getRandomNumber();
			//Creates a number (int) value variable and sets it to the getRandomNumber() method.

			if (answer.equals("lower"))

			{

				System.out.println("The number was " + secondnumber + "");
				//Print a message to screen; inside parenthesis and qoutes

				if (secondnumber < firstnumber)
					//Creates an if condition (statement); specified within brackets
				{

					System.out.println("YOU WIN!!");
					//Print message to screen; inside brackets and qoutes

					firstnumber = secondnumber;
					//firstNumber's value is being changed to secondNumber's value
				}

				else

				{

					System.out.println("YOU LOSE!!");
					//Prints a message to screen; inside brackets and qoute

					gameover = true;
					//Changes boolean variable, gameOver, value to be true
				}

			}

			else if (answer.equals("higher"))
				//Adds an else statement to the other else statement
			{

				System.out.println("The number was " + secondnumber);
				//Prints a message to screen; inside brackets and qoutes

				if (secondnumber > firstnumber)
					//An if statement; checking if secondNumber variable value is greater than firstNumber value then do this
				{
					System.out.println("YOU WIN!!");
					//Prints a message to screen; inside brackets and qoutes

					firstnumber = secondnumber;
					//Changing value of firstNumber variable to equal secondNumber value
				} else //An else statement for the if statement; if condition is not true
				{

					System.out.println("YOU LOSE!!");
					//Prints a message to screen; inside brackets and qoutes

					gameover = true;
				}	//Changes value of gameOver boolean variable to equal true

			} else
				//An else statement; if condition is false, do this
			{
				System.out.println("Please type either 'higher'' or 'lower'. Try again");
				//Print a message to screen; inside brac;kets and qoutes
			}

		}

	}

}