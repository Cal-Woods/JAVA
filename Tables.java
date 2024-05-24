import java.util.Scanner;

public class Tables {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter number for desired multiplication tables: ");
		int input = scan.nextInt();
		System.out.println("The following tables are:");
		
		for (int i = 1; i <= 12; i++) {
			System.out.println(input +" * " + i +" = " +input * i);
		}
	}
}