package arrayPrograms;

import java.util.Arrays;

public class RightRotedArray {
	 public static void main(String[] args) {
		 int a[] = {7,1,6,3,5};
			RoatedArray(a,1);
	}
	 public static void RoatedArray(int[] arr, int k) {
		 int n = arr.length;
			k=k%n;
			
			while(k!=0) {
				for(int i =n-1;i>=1;i--) {
					arr[i] = arr[i] + arr[i-1];
					arr[i-1] = arr[i]-arr[i-1];
					arr[i] = arr[i] - arr[i-1];
				}
				k--;
			}
			System.out.println(Arrays.toString(arr));
	 }
}
