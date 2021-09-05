
public class ArrayOperationsWithConstructor {
	public int[] _array;
	
	public ArrayOperationsWithConstructor(int[] array) {
		_array = array;
	}
	
	public int getSumArray() {
		int sum = 0;
		for(int element : _array) {
			sum += element;
		}
		return sum;
		
	}
	
	public double getAverage() {
		int sum = getSumArray();
		double average = (double) sum / _array.length;
		return average;
		
	}

}
