import java.util.Scanner;

 public class cubeNumber {
	public static void main(String[] args) {
		double num;
		double power;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number on first line and power on second:");
		num = scan.nextDouble();
		power = scan.nextDouble();
		scan.close();
		double ans = Math.pow(num,power);
		System.out.println("The answer is " +ans+ ".");
}
 }