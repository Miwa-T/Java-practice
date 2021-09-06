
public class JavaPractice2 {

	public static void main(String[] args) {
        int i = (int)(6 * Math.random()) + 1;
        if(i != 6) {
        	System.out.println("サイコロの目は" + i + "なのでサイコロが6になるまでもう一度振ります");
        	i = (int)(6 * Math.random()) + 1;
        }
        System.out.println("サイコロの目が" + i + "になりました");
    }

}