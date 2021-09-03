
public class JavaPractice2 {

	public static void main(String[] args) {
		int i = 1;
		int j = 3;
		
		for(i = 1; i <= 3; i++) {
			for(j = 3; j > 0; j--) {
				if(i != j)
				System.out.print("(" + i + "," + j + ")");
			}
		}
	}

}