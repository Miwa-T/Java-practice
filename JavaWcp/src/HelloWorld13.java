
public class HelloWorld13 {

	public static void main(String[] args) {
		int height = (int)(10 * Math.random()) + 1;
		int width = (int)(10 * Math.random()) + 1;
		System.out.println("一辺は" + width + "です");
		System.out.println("もう一辺は" + height + "です\n");
		if(width > height) {
			int tmp = height;
			height = width;
			width = tmp;
		}
		for(int i = 1; i <= height; i++) {
			for(int j = 1; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
