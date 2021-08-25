
public class SumArrayWithMethod {

	public static void main(String[] args) {
//		※メソッド有り
		int[] list1 = {4, 5, 84, 7, 1, 15};
		int[] list2 = {54, 47, 5, 358, 2};
		int[] list3 = {5, 87, 8, 11, 41};
		
		showSumArray(list1);
		showSumArray(list2);
		showSumArray(list3);
	}
	
	public static void showSumArray(int[] array) {
		int sum = 0;
		for(int element : array) {
			sum += element;
		}
		System.out.println("配列内の合計:" + sum);
	}
	
//	クラスの中に①mainと②showSumArrayの2つのブロックがある状態。
//	showSumArrayブロックの中に部品化したい処理を記述する。ここでは[配列の合計を計算して、それを表示する]という処理
//	このブロックの頭にそのメソッドがどのようなものかを表す記述=メソッドシグネチャを書く。

}
