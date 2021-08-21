
public class HelloWolrd5 {

	public static void main(String[] args) {
//		以下のように書くことで1901～2000までの数字を乱数として出現させることが可能
//		0.0～1.0までの小数をランダムで出現→×100→1～100の小数が出現→1901(始めたい数)に足す
		int year = (int)(100 * Math.random()) + 1901;
		if(year < 1912) {
			System.out.println(year + "年は明治時代");
		}else if(year < 1926) {
			System.out.println(year + "年は大正時代");
		}else if(year < 1989){
			System.out.println(year + "年は昭和時代");
		}else {
			System.out.println(year + "年は平成時代");
		}
//		上の条件式から順に実行され、条件と合わなければ次の条件式が実行される。
//		書く順番は注意が必要。

	}

}
