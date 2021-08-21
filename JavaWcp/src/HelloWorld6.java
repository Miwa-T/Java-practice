
public class HelloWorld6 {

	public static void main(String[] args) {
		int num = (int) (100 * Math.random()) + 1;
		if((num % 2 == 0) && (num % 3 == 0)){
			System.out.println(num + "は2の倍数で、しかも3の倍数です");
		}else{
			System.out.println("残念ながら" + num + "は2の倍数ではありません");
		}

	}

}
//numが15だったらelseを処理
//numが16だったらif(num % 2 == 0)を処理し、そのあとのifには当てはまらないのでスルー
//numが42だったらif(num % 2 == 0)を処理し、そのあとのifに当てはまるのでそれも処理
