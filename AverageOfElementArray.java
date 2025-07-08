package arrayPrograms;

public class AverageOfElementArray {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9};
		average(a);
	}
	public static void average(int[] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		float avg = sum/arr.length;
		System.out.println(avg);
	}
}
