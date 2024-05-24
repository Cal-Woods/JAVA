import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class RockPaperScissors{
	public static void main(String[] args) {
		play();
	}
public static void play() {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	boolean endgame = false;
	String playerchoice;
	String aichoice = "";
	String name;
	int playerscore = 0;
	int aiscore = 0;
	
	System.out.print("What is your name: ");
	name = sc.nextLine();
	System.out.println("Welcome "+name+", to Rock, Paper, Scissors!\n\nYou make a move by choosing rock, paper or scissors on your turn!");
ArrayList<String> aichoices = new ArrayList<String>();
	aichoices.add("rock");
	aichoices.add("paper");
	aichoices.add("scissors");
	aichoices.add("Buffer");

	while(!endgame) {
	System.out.print("Type either '1' for rock, '2' for paper or '3' for scissors: ");
	playerchoice = sc.nextLine();
	playerchoice.toLowerCase();
	
	if(playerchoice.equals("1")|| playerchoice.equals("2") || playerchoice.equals("3"))
	{
		aichoice = aichoices.get(rand.nextInt(3));
	System.out.println("You chose "+aichoices.get(Character.getNumericValue(playerchoice.charAt(0) - 1)) +" and you're opponent chose "+aichoice+".");
	}
	if(playerchoice.equals("1"))
	{
		if(aichoice.equals("rock"))
		{
			System.out.println("It's a tie! keep trying.");
		}
		else if(aichoice.equals("paper"))
		{
			aiscore++;
			System.out.println("You lose! Your opponent now has "+aiscore+" points.");
		}
		else if(aichoice.equals("scissors"))
		{
			playerscore++;
			System.out.println("You win! You now have "+playerscore+" points.");
		}
	}
	else if(playerchoice.equals("2"))
	{
		if(aichoice.equals("rock"))
		{
			playerscore++;
			System.out.println("You win! you now have "+playerscore+" points.");
		}
		else if(aichoice.equals("paper"))
		{
			System.out.println("You tied! Keep trying.");
		}
		else if(aichoice.equals("scissors"))
		{
			aiscore++;
			System.out.println("You lose! your opponent now has "+aiscore+" points.");
		}
	}
	else if(playerchoice.equals("3"))
	{
		if(aichoice.equals("rock"))
		{
			aiscore++;
			System.out.println("You lose! Your opponent now has "+aiscore+" points.");
		}
		else if(aichoice.equals("paper"))
		{
			playerscore++;
			System.out.println("You win! you now have "+playerscore+" points.");
		}
		else if(aichoice.equals("scissors"))
		{
			System.out.println("You tied! Keep going.");
	}
	}
	else if(playerchoice.equals("0")) 
	{
		System.out.println("Goodbye.");
		endgame = true;
	}
	else {
		System.out.println("Invalid choice! Please type either 'rock', 'paper' or 'scissors'.");
	}
	if(playerscore == 3 || aiscore == 3)
	{
		endgame = true;
		System.out.println("Your final score is "+playerscore+" and you're opponents final score is: "+aiscore+".");
		if (playerscore == 3)
		{
			System.out.println("You Won!");
		}
		else if (aiscore == 3)
		{
			System.out.println("You Lose! Better luck next time.");
		}
	}
}
}
}