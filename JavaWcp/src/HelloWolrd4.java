
public class HelloWolrd4 {

	public static void main(String[] args) {
		/*Javaでの乱数発生のためにMath.randomと記載。
		 * ただしここでは0以上1未満の小数値が発生するため、それを100倍する。
		 * このままだと小数値になってしまうので文頭にintをつけて整数型に。
		 * 最後に+1する事で1以上100未満の整数型の乱数を得ることが出来る。
		 */
		int num = (int)(100 * Math.random()) +1;
		System.out.println("現在の値:" + num);
//		boolean型のcondという変数に条件式を代入して、if(cond(=条件式))という風に置き換えている
		boolean cond = (num <= 40);
		if(cond) {
			System.out.println("数値は40以下です");
		}
		else {
			System.out.println("数値は40より大きいです。");
		}
		System.out.println("処理完了！");
		
		/* if(条件式){
		 * 条件に合致した時に行う処理
		 * }
		 * else{
		 * それ以外の時に行う処理
		 * }
		 */
		
		
		int num2 = (int)(100 * Math.random()) + 1;
		System.out.println("現在の数値は、、、" + num2);
		int rem = num2 % 2;
		if (rem == 0) {
			System.out.println("偶数です");
		}else {
			System.out.println("奇数です");
		}
//		※等しい時は==。=としないことを気を付ける
//		また、remは上のboolean型ではなく、num2を2で割ったものが1か0かを判断しているので、整数型で宣言する必要がある。

	}

}
