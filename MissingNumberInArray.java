package arrayPrograms;

public class MissingNumberInArray {
	public static void main(String[] args) {
		int a[] = {3,0,1,2,5};
		missing(a);
	}
	public static void missing(int[] arr) {
		int n = arr.length;
		int expectedSum = (n*(n+1))/2;
		int actualSum = 0;
		for(int i=0;i<n;i++) {
			actualSum = actualSum+arr[i];
		}
		System.out.println(expectedSum-actualSum);
	}
}
