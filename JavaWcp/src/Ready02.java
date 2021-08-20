public class Ready02 {
	public static void main(String[] args) {
		int num1 = 6;
		int num2 = 4;
		
		int ans1 = num1 + num2;
		int ans2 = num1 - num2;
		int ans3 = num1 * num2;
		double ans4 = (double) num1 / num2;
		int ans5 = num1 % num2;
		
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);
		System.out.println(ans4);
		System.out.println(ans5);
		
		int num3 = 346;
		num3 = num3 + 4;
		System.out.println("numの値" + num3);
		
		num3 += 5;
//		num3 = num3 + 5と同じ意味
		System.out.println("numの値" + num3);
		
		int num4 = 100;
//		num4 = num4 + 1という意味
		num4++;
		System.out.println("numの値" + num4);
		
//		num4 = num4 - 1という意味
		num4--;
		System.out.println("numの値" + num4);
		
	}

}
