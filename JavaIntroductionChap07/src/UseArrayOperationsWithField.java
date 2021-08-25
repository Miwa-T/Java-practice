
public class UseArrayOperationsWithField {

	public static void main(String[] args) {
		int[] list = {4, 5, 84, 7, 1, 15};
		
		ArrayOperationsWithField arrayOpe = new ArrayOperationsWithField();
		int sum = arrayOpe.getSumArray(list);
		double ave = arrayOpe.getAverage();
		System.out.println("配列内の合計:" + sum + "平均:" + ave);

	}

}
