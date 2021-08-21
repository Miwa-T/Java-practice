
public class HelloWolrd4 {

	public static void main(String[] args) {
		/*Javaでの乱数発生のためにMath.randomと記載。
		 * ただしここでは0以上1未満の小数値が発生するため、それを100倍する。
		 * このままだと小数値になってしまうので文頭にintをつけて整数型に。
		 * 最後に+1する事で1以上100未満の整数型の乱数を得ることが出来る。
		 */
		int num = (int)(100 * Math.random()) +1;
		System.out.println("現在の値:" + num);
		if(num <= 40) {
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
		if (num2 % 2 == 0) {
			System.out.println("偶数です");
		}else {
			System.out.println("奇数です");
		}

	}

}
