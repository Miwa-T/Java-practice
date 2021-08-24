
public class WithoutArray {

	public static void main(String[] args) {
//		※配列無しの書き方
		int num1 = 8;
		int num2 = 9;
		int num3 = 17;
		int num4 = 26;
		int num5 = 43;
		
		System.out.println("num1:" + num1);
		System.out.println("num2:" + num2);
		System.out.println("num3:" + num3);
		System.out.println("num4:" + num4);
		System.out.println("num5:" + num5);
		
		
		
		
		
//		※配列有りの書き方
		int [] nums = new int[5];
//		配列変数の書き方：データ型[]配列変数名 = new データ型[データ個数];
//		個数の事は要素数という
		
		nums[0] = 8;
		nums[1] = 9;
		nums[2] = 17;
		nums[3] = 26;
		nums[4] = 43;
//		配列で一つ一つの要素を指定するためには、変数名[インデックス]と記述]
//		注意すべき点としては、インデックスは0から始まる事
		
		System.out.println("1個目:" + nums[0]);
		System.out.println("2個目:" + nums[1]);
		System.out.println("3個目:" + nums[2]);
		System.out.println("4個目:" + nums[3]);
		System.out.println("5個目:" + nums[4]);
		
		
		
		
//		※配列の宣言と代入を一度で行う書き方
		int [] nums2 = {8, 9, 17, 26, 43};
		
//		上で書いた配列有りの書き方では、まず変数を宣言し、その配列の中に何個入れるかを書いていた。
//		その後、一つ一つの箱の中に対応するように数字を代入している。今回の書き方では宣言と代入を一度で行うことが可能。
		
		System.out.println("1個目:" + nums2[0]);
		System.out.println("2個目:" + nums2[1]);
		System.out.println("3個目:" + nums2[2]);
		System.out.println("4個目:" + nums2[3]);
		System.out.println("5個目:" + nums2[4]);
		
		
		
		
//		※配列とループの組み合わせ
		int [] nums3 = {8, 9, 17, 26, 43};
		for(int i = 0; i <= 4; i++) {
			System.out.println((i + 1) + "個目:" + nums3[i]);
		}
		
		
		
//		※後から配列の要素数を変更するなどの場合、配列の要素数を取得する方法がある。
		int [] nums4 = {8, 9, 17, 26, 43};
		for(int i = 0; i < nums4.length; i++) {
			System.out.println((i + 1) + "個目:" + nums4[i]);
		}
//		※配列の要素数を取得する事で、配列が何個になっても対応出来る、、、という事？
		
		
		
		
//		※一つ上で記述したfor(int i = 0; i < 配列変数.length; i++)は配列をループさせる定型文のようなもの。
//		これを簡単に記述出来る【拡張for文】というものがあるのでそれが以下。
		int [] nums5 = {8, 9, 17, 26, 43};
		for(int num : nums5) {
			System.out.println(num);
		}
//		配列変数を示す文は普通に記述して、、、
//		for(配列の各要素のデータ型 配列の各要素を格納する変数名:配列変数)
//		:から右側と左側に分かれ、右側はループさせる配列変数を記述。左側は変数宣言で変数名はなんでもいい。データ型は配列変数と同じもの。
//		ここで宣言した変数に1ループごとで配列の各要素を取り出し、格納される。

	}

}
