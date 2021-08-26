
public class JavaPractice1 {

	public static void main(String[] args) {
		int score = (int)(3 * Math.random()) + 1;
		System.out.println("順位は" + score+ "位");
		switch(score) {
		case 1:
			System.out.println("金メダル！");
			break;
		case 2:
			System.out.println("銀メダル！");
			break;
		default:
			System.out.println("銅メダル！");
			break;
		
		}
				

	}

}
