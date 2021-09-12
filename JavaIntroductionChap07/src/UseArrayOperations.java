
public class UseArrayOperations {

	public static void main(String[] args) {
		int[] list1 = {4, 5, 84, 7, 1, 15};
		int[] list2 = {54, 47, 5, 358, 2};
		int[] list3 = {5, 87, 8, 11, 41};
		
		ArrayOperations arrayOpe = new ArrayOperations();
//		※クラス名 変数名
//		※クラスのインスタンスを生成: new クラス名
	
		
		
		int sum1 = arrayOpe.getSumArray(list1);
		int sum2 = arrayOpe.getSumArray(list2);
		int sum3 = arrayOpe.getSumArray(list3);
//		※クラス型変数名の呼び出し: 変数名.メソッド名(引数)
//		※()内に引数として渡すデータを記述することが出来る。不要な場合は特に書く必要がないが、その場合でも()は省略出来ない。
		
		
		System.out.println("配列1内の合計:" + sum1);
		System.out.println("配列2内の合計:" + sum2);
		System.out.println("配列3内の合計:" + sum3);
		
		int total = sum1 + sum2 + sum3;
		System.out.println("全配列の総合計:" + total);


	}

}
//Javaでは1クラス1ファイルという原則があるため、ファイルを分けて記述を行う。
//※今までは同一クラス内のメソッドはメソッド名を記述することで呼び出す事が出来た。
//では別クラスの場合は、メソッドが記述されたクラスを変数として利用できる状態にすること、
//その変数を通じてメソッドを呼び出すこと。
//クラスを変数として利用する方法は、今まで通り、変数宣言(データ型 変数名)→初期化
//クラスの場合は(クラス名 変数名)となる。呼び方は【クラス型変数】。今までのものは【プリミティブ型変数】
