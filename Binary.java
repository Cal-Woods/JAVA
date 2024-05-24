import java.util.Scanner;

public class Converter {
    public static String toBinary(int num) {
    String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }
        return binary;
    }
}


class Binary {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        String again = "y";
        while(again.equals("y")) {
        System.out.print("Enter a number: ");
        String x = sc.nextLine();
        while(x.equals("")) {
        	System.out.print("No spaces! Try again: ");
        	x = sc.nextLine();
        }
        boolean unlocked = Check(x);
        while(!unlocked) {
        	System.out.print("Please enter a new decimal number: ");
        	x = sc.nextLine();
        	unlocked = Check(x);
        }
        if(unlocked) {
        System.out.print(x + " is equal to " + Converter.toBinary(Integer.parseInt(x)) + " in binary.\n\nWould you like to enter another number? Type Y or N.");
        again = sc.nextLine();
    	if(again.equals("n")) {
    		System.out.println("Thanks for using the decimal to binary calculator! See you next time.");
    		sc.close();
    	}
    	else if(again.equals("y")) {
    		again = "y";
    	}
    	else {
    		System.out.print("Not a valid option!\n\nDo you want to enter another number? Type Y or N");
    		again = sc.nextLine();
    	}
    	}
	}
    }
	static boolean Check(String dec) {
		boolean pass = true;
		
		for(int i = 0; i < dec.length(); i++) {
			if(!Character.isDigit(dec.charAt(i))) {
				System.out.println("Only numbers may be entered. Try again.");
				pass = false;
				break;
			}
		}
		return pass;
	}
}