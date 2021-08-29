
public class ArrayOperationsWithSetter {
	public int[] _array;
//	※配列データそのものをフィールドとして保持する
	
	public void setArray(int[] array) {
		_array = array;
	}
//	※上記で設定したフィールドに配列データを格納するだけのメソッド
//	引数として配列データを受け取り、その引数をそのままフィールドに格納している
//	このようにフィールドに格納する値を引数で受け取り、それをそのままフィールドに格納する(セットする)メソッドを【セッター】という
	
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
//	※このメソッドの中で上のメソッドのgetSumArrayを呼び出している

}
