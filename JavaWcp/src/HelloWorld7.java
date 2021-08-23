
public class HelloWorld7 {

	public static void main(String[] args) {
		int ans = 0;
		int i = 1;
		while(i <= 100) {
			ans += i;
			i ++;
		}
		System.out.println("答え" + ans);
		System.out.println("ループ終了後のiの値" + i);
		
	}

}

//while (繰り返しを続ける条件) {
//	繰り返す処理
//}
//今回の場合、、、
//numを宣言
//randを宣言
//while(繰り返す条件(ランダムに出現した数字であるrandがnumと等しくない時)) {
//	繰り返す処理
//}
