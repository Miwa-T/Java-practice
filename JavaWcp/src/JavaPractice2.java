
public class JavaPractice2 {

	public static void main(String[] args) {
        int[] list1 = { 1, 2, 3, 4, 5};
        int[] list2 = { 6, 7, 8, 9, 10};
        int[] list3 = { 11, 12, 13, 14, 15};
        
        int sum1 = getSumArray(list1);
        int sum2 = getSumArray(list2);
        int sum3 = getSumArray(list3);
        
        System.out.println("配列1内の合計:" + sum1);
        System.out.println("配列2内の合計:" + sum2);
        System.out.println("配列3内の合計:" + sum3);
        
        int total = sum1 + sum2 + sum3;
        System.out.println("全配列内の総合計:" + total);
	}
	
	public static int getSumArray(int[] array) {
		int sum = 0;
		for(int element : array) {
			sum += element;
		}
		return sum;
		
	}

}