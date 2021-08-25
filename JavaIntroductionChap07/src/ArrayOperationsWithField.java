
public class ArrayOperationsWithField {
	public int _sum;
	public int _arrayLength;
	
	public int getSumArray(int[] array) {
		_arrayLength = array.length;
		int sum = 0;
		for(int element : array) {
			sum += element;
		}
		_sum = sum;
		return sum;
	}
	public double getAverage() {
		double average = (double) _sum / _arrayLength;
		return average;
	}

}

//※フィールドの作成について フィールドとはクラスブロック直下に宣言された変数のこと。
//変数はブロック内でしか使えないので、クラスブロック直下で宣言すれば、そのクラス内のどこでも使える！
//_sum:合計値を格納するフィールド(変数)
//_arrayLength:配列の要素数を格納するフィールド(変数)

