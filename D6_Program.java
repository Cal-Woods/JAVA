import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class D6_Program {
	public static void main(String[] args) {
		strt();
}
public static void strt() {
	try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the roleplaying dice simulator! \n Please enter the amount of sides on the dice you wish to use? Enter '0' to exit program! \n Only numbers can be entered in this program!");
		int sides = sc.nextInt();
		if (sides == 0) {
			return;
		}
		Random rand = new Random();
		int num = rand.nextInt(sides + 1);
		while(num <= 0) {
			num = rand.nextInt(sides + 1);
		}
		System.out.println(num);
		strt();
	}
	catch(InputMismatchException e) {
		System.out.println("All values must be numbers only.");
		System.out.println("\n \n \n \n");
		strt();
		
	}
}
}