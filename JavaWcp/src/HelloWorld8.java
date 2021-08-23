
public class HelloWorld8 {

	public static void main(String[] args) {
		int ans = 0;
		for(int i = 1; i <= 100; i++) {
			ans += i;
		}
		System.out.println("答え:" + ans);
//		System.out.println("ループ終了後のiの値:" + i); ←これが書けない理由:変数は宣言した所からその{ブロック}までしか存在が出来ないから。

	}

}

//for(ループ開始前の処理;繰り返しを続ける条件;ループ一回ごとの末尾で行う処理) {
//	繰り返す処理
//}
//※場合によってはループ開始前の処理やループ1回ごとの末尾で行う処理が無い場合もある。その場合も[;]は必要。
//例えば for(;num != 50;)のような形。