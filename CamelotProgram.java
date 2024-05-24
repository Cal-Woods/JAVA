import java.util.Scanner;

public class CamelotProgram {
  
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("What is your name, good sir?!");
   String name = sc.nextLine();
   name = name.toLowerCase();
   String pass;
   
   if(name.equals("arthur")) {
     System.out.println("Oh! My King! Welcome home sire!");
   }
   else if(name.equals("vengeance")) {
     System.out.println("Quick! It's the bat!");
   }
   else if(name.equals("the force")) {
     System.out.println("May the force be with you!");
    }
    else if(name.equals("clown prince")) {
     System.out.println("*Bang*! heheha! I think you told it wrong!");
    }
    else if(name.equals("spy")) {
    	System.out.print("Password: ");
    	pass = sc.nextLine();
    	if(pass.equals("password")) {
    		System.out.println("*Quietly* What news do you bring?");
    	}
    	
    	else {
    		System.out.println("Guards! Arrest the traitor!");
    	}
    }
    else {
   System.out.println("Hello, " + name
    + ". Welcome to Camelot!");
    return;
  }
  sc.close();
  }
}