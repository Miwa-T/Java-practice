
public class HelloWorld10 {

	public static void main(String[] args) {
		System.out.println("whlieループの開始");
		int i = 1;
		while(i < 0) {
			System.out.println("i = " + i);
		}
		System.out.println("whileループ終了");
		
		System.out.println("do-whileループの開始");
		int j = 1;
		do {
			System.out.println("j = " + j);
		}
		while(j < 0);
		System.out.println("do-whileループ終了");
	}

}
////do{
//繰り返す処理
//}
//while(繰り返しを続ける条件);

//while:条件判定→処理
//do-while:処理→条件判定
