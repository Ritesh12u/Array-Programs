package arrayPrograms;

import java.util.Arrays;

public class mergeTwoArray {
	public static void main(String[] args) {
		int a[] = {1,2,3};
		int b[] = {7,2,4};
		merge(a,b);
	}
	public static void merge(int[] arr,int[] arr2)
	{
		int k =0;
		int n = arr.length+arr2.length;
		int b[] = new int[n];
		for(int i=0;i<b.length;i++)
		{
			if(i<arr.length)
			{
				b[i] = arr[i];
			}
			else
			{
				b[i] = arr2[k];
				k++;
			}
		}
		
		System.out.println("New copy array :"+Arrays.toString(b));
	}
}
