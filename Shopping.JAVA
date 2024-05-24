import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

class Shopping {
	static ArrayList<Item> basket = new ArrayList<Item>();
	public static void main(String[] args) {
		String again = "y";
		final double vat = 0.23;
		boolean finished = false;
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		String choice = "";
		int secondchoice = 0;
		int qchoice = 0;
		ArrayList<Item> shopstock = new ArrayList<Item>();
		itemname[] itemnames = itemname.values();
		
		while(again.equals("y")) {
			finished = false;
			menu();
			choice = sc.next();
				
			if(choice.equals("1")) {
				for(int i = 0; i < itemnames.length; i++) {
				shopstock.add(new Item(itemnames[i]));
				}
				System.out.println("Presented is a list of our available stock.\nNumber  Name  Quantity    Price");
				for(int i = 0; i < shopstock.size(); i++) {
				System.out.print(i+1+"       "+shopstock.get(i).getName()+"       ");
				System.out.println(shopstock.get(i).getQuantity()+"     "+shopstock.get(i).getPrice()+"\n");
				}
				while(!finished) {
					System.out.print("Select an item by typing the item number here, type 0 to finish: ");
					secondchoice = sc.nextInt();
					
					if(secondchoice > shopstock.size()) {
						System.out.println("There is no number"+secondchoice+". Please try again.");
					}
					else if(secondchoice == 0) {
						finished = true;
					}
					else if(secondchoice < 0) {
						System.out.println("Positive numbers only!");
					}
					else {
					qchoice = sc.nextInt();
					basket.add(new Item(shopstock.get(secondchoice-1).getName(), qchoice, shopstock.get(secondchoice-1).getPrice()));
					viewBasket(basket);
			}
		}
	}
			else if(choice.equals("2")) {
				System.out.println("\ntest basket\n");
			}
			else if(choice.equals("3" )) {
				checkout();
			}
			else if(choice.equals("4")) {
				again = "n";
			}
			else {
				System.out.print("That is not a valid option. Would you like to try again? Y/N");
				again = sc.nextLine();
			}
		}
		System.out.println("Goodbye!");
	}
	public static void menu() {
		System.out.println("Please pick an item from the menu by typing the corresponding number.\n\n1) Create shopping list\n\n2) View Shopping list\n\n3)Checkout\n\n4) Exit");
}
public static void checkout() {
		if(basket.isEmpty()) {
			System.out.println("There is nothing in your basket. Add items before you checkout.");
		}
		else {
		viewBasket(basket);
		calcTotal(basket);
}
}
public static void viewBasket(ArrayList<Item> list) {
		System.out.println("Name        Quantity        Price        Subtotal");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName()+"         "+list.get(i).getQuantity()+"            "+list.get(i).getPrice()+"\n");
		}
}
public static double calcTotal(ArrayList<Item> list) {
	double total = 0.0;
	for(int i = 0;  i < basket.size(); i++) {
		total += list.get(i).getTotal();
		
	}
}
}
enum itemname {
	SHAMPOO,
	DOGFOOD, 
	PASTA,
	POTATO,
	SALAD,
	BEANS,
	TAMPONS,
	STEAK,
	SAUSAGE,
	BACON,
	PEAS,
	CHICKEN,
	BEEF,
	STIRFRY,
	MUTTON,
	CURRY,
	TOY,
	FISH,
	DOLL,
	PLAYHOUSE,
	AFTERSHAVE,
	PERFUME
}
class Item {
	private itemname iname;
	private int iquantity;
	private double iprice;
	Random rand = new Random();
	
	public Item(itemname n) {
		iname = n;
		setQuantity();
		setPrice();
	}
	public Item(itemname n, int q) {
		iname = n;
		iquantity = q;
		setPrice();
	}
	public Item(itemname n, int q, double p) {
		iname = n;
		iquantity = q;
		iprice = p;
	}
	public itemname getName() {
		return iname;
	}
	
	public int getQuantity() {
		return iquantity;
	}
	public double getPrice() {
			return Math.round(iprice * 100.0) / 100.0;
	}
	void setQuantity() {
		iquantity = rand.nextInt(50);
		while(iquantity <= 0) {
			iquantity = rand.nextInt(50);
		}
	}
	void setPrice() {
		iprice = Math.round(rand.nextDouble() * 100.0) / 100.0;
		while(iprice <= 0.0) {
			iprice = Math.round(rand.nextDouble()* 100.0)/100.0;
		}
}
public double getSubTotal() {
	return iprice * iquantity;
}
}