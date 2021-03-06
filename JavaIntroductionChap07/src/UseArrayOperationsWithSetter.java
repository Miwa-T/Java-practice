
public class UseArrayOperationsWithSetter {

	public static void main(String[] args) {
		int[] list = { 4, 5, 84, 7, 1, 15 };
		
		ArrayOperationsWithSetter arrayOpe = new ArrayOperationsWithSetter();
//		arrayOpe.setArray(list);
//		※確実に配列データをセットする必要があるため書き方を変える必要がある。
		int sum = arrayOpe.getSumArray();
		double ave = arrayOpe.getAverage();
		System.out.println("配列内の合計" + sum + "平均" + ave);

	}

}
//※getSumArray()で渡していた配列データを、先にセッターを使用して渡しておく。
//※それがこの箇所　arrayOpe.setArray(list);　その代わり　getSumArray();　での引数は不要となる。
//※この方法であれば合計値→平均値、平均値→合計値でも計算することが可能となり、正しい結果を得ることが可能となる