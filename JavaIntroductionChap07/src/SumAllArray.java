
public class SumAllArray {

	public static void main(String[] args) {
		int[] list1 = {4, 5, 84, 7, 1, 15};
		int[] list2 = {54, 47, 5, 358, 2};
		int[] list3 = {5, 87, 8, 11, 41};
		
		int sum1 = getSumArray(list1);
		int sum2 = getSumArray(list2);
		int sum3 = getSumArray(list3);
		
		System.out.println("配列1内の合計:" + sum1);
		System.out.println("配列2内の合計:" + sum2);
		System.out.println("配列3内の合計:" + sum3);
		
		int total = sum1 + sum2 + sum3;
		System.out.println("全配列の総合計:" + total);

	}
	public static int getSumArray(int[] array) {
		int sum = 0;
		for(int element : array) {
			sum += element;
		}
		return sum;
	}
	
//	※配列の合計値を計算するというメソッドを作成
//	public static 【int】 getSumArray(int[] array) {　←いつものvoidではなくint?? 
//	先ほどのプログラムはメソッド内で処理が完結していたが、今回はまたmainブロックの方でメソッドの値を利用して計算を行う必要がある。
//	そのため戻り値が必要。(戻り値:このメソッドを呼び出している元の処理に値を渡すための仕組み)
//	メソッドシグネチャではpublic static の間にint(=戻り値のデータ型を書く) getSumArray(int[] array) {
//	戻り値がない場合はvoidと書く
//	また、戻り値を指定するために最後にreturnと書く

}
