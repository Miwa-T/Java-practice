
public class Ready04 {
	public static void main(String[] args) {
		int number = 1;
		printNum(number);
	}
	
	public static int printNum(int number) {
		if (number < 100) {
			number *= 2;
			System.out.println("A=" + number);
			printNum(number);
		}
		return number;
	}

}
