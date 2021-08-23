
public class Helloworld11 {

	public static void main(String[] args) {
		for(int i = 1; i <= 3; i ++) {
			for(int j = 1; j <= 3; j++) {
				System.out.println("i: j=" + i + ":" + j);
			}
		}

	}

}

//最初のiのループが外側。
//jのループは内側。内側のループの条件が一通り終了した段階で外側のループが再度行われる。