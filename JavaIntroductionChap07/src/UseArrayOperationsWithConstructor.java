
public class UseArrayOperationsWithConstructor {
	public static void main(String[] args) {
		int[] list = { 4, 5, 84, 7, 1, 15 };
		
		ArrayOperationsWithConstructor arrayOpe = new ArrayOperationsWithConstructor (list);
		int sum = arrayOpe.getSumArray();
		double ave = arrayOpe.getAverage();
		System.out.println("配列内の合計" + sum + "平均" + ave);
	}

}
