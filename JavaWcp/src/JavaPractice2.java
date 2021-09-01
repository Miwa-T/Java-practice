
public class JavaPractice2 {

	public static void main(String[] args) {
		int i = 1;
		int count = 0;
		int sum = 0;
		
		for(i= 1; i <= 10; i++) {
			if(i % 2 == 0) {
				count++;
				sum += i;
			}
		}
		System.out.println("偶数の個数は" + count + "です");
		System.out.println("偶数の合計は" + sum + "です");
	}

}