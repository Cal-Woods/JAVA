import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String answer = "4";
		final String answertwo = "3";
		final String answerthree = "2";
		final String answerfour = "1";
		final String answerfive = "1";
		int score = 0;
		
		System.out.println("In the book and film: Hitchhikers Guide To The Galaxy, What number is the secret to unlocking the universe?\n(1) 27\n(2) 89\n(3) 10420\n(4) 42. ");
		String inputanswer = sc.nextLine();
		String inputanswertwo;
		String inputanswerthree;
		String inputanswerfour;
		String inputanswerfive;
		if(inputanswer.equals(answer)) {
		System.out.println("Correct!\n\n\n");
		score++;
		System.out.println("What is Ariel's best friend's name in The Little Mermaid?\n (1) Sebastian\n(2)King Triton\n(3) Flounder\n(4) Ursula");
		inputanswertwo = sc.nextLine();
		if(inputanswertwo.equals(answertwo)) {
			System.out.println("Correct again!\n\n\n");
							score++;
							System.out.println("In the movie: Die Hard, starring Bruce Willis, What is main character John McClane's catch phrase? (1) Nut up or shut up\n(2) Yippee-kai-yay motherfuckers\n(3) I live my life one quarter mile at a time\n(4) Are you feeling lucky, punk!");
							inputanswerthree = sc.nextLine();
							if(inputanswerthree.equals(answerthree)) {
								score++;
						System.out.println("Right! you're good at this!\n\n\n");
						System.out.println("In the Lion King, who is Mufasa's royal advisor:\n(1) Zazu\n(2) Scar\n(3) Nala");
						System.out.print("Answer: ");
						inputanswerfour = sc.nextLine();
						if(inputanswerfour.equals(answerfour)) {
							score++;
							System.out.println("Correct! You are doing well with a score of "+score+"!");
							System.out.println("\nWho played the emperor in Gladiator?\n'1' Joaquin Pheonix\n'2' Scarlett Johannson\n'3' Robert De Niro\n'4' River Pheonix");
							inputanswerfive = sc.nextLine();
							if(inputanswerfive.equals(answerfive)) {
								System.out.println("Correct!");
								score++;
							}
							else {
								System.out.println("Incorrect!");
							}
			}
			else {
				System.out.println("I am afraid that is incorrect! Your score is "+score+" points.");
			}
			}
			else {
				System.out.println("I am sorry, that is wrong!");		
			}
		}
		else {
			System.out.println("Incorrect! You are the weakest link... goodbye!");
		}
	}
	else
	{
		System.out.println("Answer is incorrect! Please restart program to try again.");
		return;
	}
	if(score > 0) {
	System.out.println("Quiz finished! You scored " +score+" out of 5!");
	return;
	}
	else {
		System.out.println("That was terrible! HAHA! Restart program to try again loser!");
	}
}
}