
public class JavaPractice2 {

	public static void main(String[] args) {
        int[] list1 = { 1, 2, 3, 4, 5};
        int[] list2 = { 6, 7, 8, 9, 10};
        int[] list3 = { 11, 12, 13, 14, 15};
        
        showSumArray(list1);
        showSumArray(list2);
        showSumArray(list3);
        
    }
	
	public static void showSumArray(int[] list) {
		int a = 0;
		for(int element : list) {
			a += element;
		}
		System.out.print("配列内の合計:" + a);
	}

}