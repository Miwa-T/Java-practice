
public class ArrayOperations2 {
	public int getSumArray(int[] array) {
		int sum = 0;
		for(int element : array) {
			sum += element;
		}
		return sum;
	}
	
	public double getAverage(int[] array) {
		int sum = 0;
		for(int element : array) {
			sum += element;
		}
		double average = (double) sum / array.length;
		return average;
	}

}
