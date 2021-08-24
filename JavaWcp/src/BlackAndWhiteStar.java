
public class BlackAndWhiteStar {

	public static void main(String[] args) {
		for(int count = 1; count <= 13; count++) {
			if(count % 2 == 0) {
				System.out.println("☆");
			}
			else {
				System.out.println("★");
			}
		}
		
		
		
		
		
		
		int[] nums = new int [30];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int) (100 * Math.random()) + 1;
//			↑ここが分からない
				System.out.println((i + 1) + "番目の値=" + nums[i]);
		}
		
		int max = 0;
		int min = 100;
		int sum = 0;
		
		for(int num : nums) {
			if(num > max) {
				max = num;
			}
			
			if(num < min) {
				min = num;
			}
			
			sum += num;
		}
		
		double ave = (double) sum / nums.length;
		
		System.out.println("\n最大値=" + max);
		System.out.println("最小値=" + min);
		System.out.println("合計値" + sum);
		System.out.println("平均値" + ave);
		
		
		
		
		int[] numes = new int[5];
		int[] denomis = new int[5];
		for(int i = 0; i < 5; i++) {
			numes[i] = (int) (10 * Math.random());
			denomis[i] = (int) (10 * Math.random());
		}
		
		for(int denomi : denomis) {
			System.out.println("\n--分母の値:" + denomi);
			if(denomi == 0) {
				System.out.println("0で割り算は出来ません。処理を中止します");
				break;
			}
			for(int nume : numes) {
				System.out.println("分子の値:" + nume);
				if(nume == 0) {
					System.out.println("\t分子0は答え0ですので処理を飛ばします");
					continue;
				}
				double ans = (double) nume / denomi;
				System.out.println("\t割り算の答え:" + ans);
			}
		}
		
	}

}
