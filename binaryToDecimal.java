import java.util.Scanner;

public class binConvert {
	public static int Convert(String bin) {
	int total = 0;
	
	for(int i = 0; i < bin.length(); i++) {
		total = (total * 2) + Character.getNumericValue(bin.charAt(i));
	}
	return total;
}
}
class binaryToDecimal {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String value;
		boolean run = true;
		boolean unlocked = true;
		
		while(run) {
		value = getValue();
		if(value != "" || value != " ") {
		unlocked = Check(value);
		}
		while(!unlocked) {
			value = getValue();
			unlocked = Check(value);
		}
		
		if(unlocked) {
		System.out.println(value + " is equal to " + binConvert.Convert(value) + ".\n\nWould you like to quit?Y/N");
		
		String answer = sc.nextLine();
		answer.toLowerCase();
		if(answer.equals("n")) {
			System.out.println("\n");
			run = true;
		}
		else if(answer.equals("y")) {
			System.out.println("Sorry to hear it, next time.");
			run = false;
		}
		else {
			System.out.println("Only Y or N may be entered here! Please try again.");
			}
		}
	}
}
	public static boolean Check(String v) {
		boolean istrue = false;
		for(int i = 0; i < v.length(); i++) {
			if(!Character.isDigit(v.charAt(i))|| Character.getNumericValue(v.charAt(i)) < 0 || Character.getNumericValue(v.charAt(i)) > 1) {
				System.out.println("A binary digit can only be 0 or 1. Eg. 01000101\n");
				istrue = false;
				break;
		}
		else {
			istrue = true;
			}
		}
		return istrue;
	}
	public static String getValue() {
		String v;
		System.out.print("Enter a binary value: ");
		v = sc.nextLine();
		return v;
	}
}