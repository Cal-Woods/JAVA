public class Main {
	public static void main(String[] args) {
		String out = "";
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				out += "fizz";
			}
			else if(i % 5 == 0) {
				out += "buzz";
			}
			else if(i % 7 == 0) {
				out += "bazz";
			}
			else {
		System.out.println(i);
	}
}
	System.out.println(out);
}
}