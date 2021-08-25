
public class ArrayOperations {
	public int getSumArray(int[] array) {
		int sum = 0;
		for(int element : array) {
			sum += element;
		}
		return sum;

	}

}
//※main()メソッドを含まないクラスにメソッドを記述する事は可能。その際staticは不要。
