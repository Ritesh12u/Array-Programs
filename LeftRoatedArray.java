package arrayPrograms;

import java.util.Arrays;

public class LeftRoatedArray {
	public static void main(String[] args) {
		int a[] = {7,1,6,3,5};
//		RotedArray(a);
		RotedArray1(a,5);
	}

	/*
	 * public static void RotedArray(int[] arr) { int temp = arr[0]; int n =
	 * arr.length; for(int i =1;i<n;i++) { arr[i-1]=arr[i]; } arr[n-1]=temp;
	 * System.out.println(Arrays.toString(arr)); }
	 */
	public static void RotedArray1(int[] arr,int k)
	{
		int n = arr.length;
		k=k%n;
		
		while(k!=0) {
			for(int i =1;i<n;i++) {
				arr[i] = arr[i] + arr[i-1];
				arr[i-1] = arr[i]-arr[i-1];
				arr[i] = arr[i] - arr[i-1];
			}
			k--;
		}
		System.out.println(Arrays.toString(arr));
	}
}
