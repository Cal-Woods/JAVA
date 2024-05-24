import java.util.Scanner;

public class ScanNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	System.out.println("Please enter five numbers, each on a new line.");
		int input;
		int[] numbs = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("Number: ");
			input = sc.nextInt();
			numbs[i] = input;
		}
		int sum = numbs[0] + numbs[1] + numbs[2] + numbs[3]  + numbs[4];
		System.out.println("\nThe sum of our array is: " + sum + " and the average is: " + sum / numbs.length);
		sc.close();
	}
}