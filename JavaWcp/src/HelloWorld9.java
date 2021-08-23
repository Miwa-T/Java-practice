
public class HelloWorld9 {

	public static void main(String[] args) {
		int num = 8;
		System.out.println("ループを開始します");
		for(int rand = (int)(10 * Math.random()) + 1; rand != num; rand = (int) (10 * Math.random()) + 1 ) {
			System.out.println("randの値" + rand);
		}
		System.out.println("ループが終了しました");

	}

}
//for(ループ開始前の処理; ループの繰り返しの条件; ループ1回ごとの末尾で行う処理)
