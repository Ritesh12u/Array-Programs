package arrayPrograms;

import java.util.Arrays;

public class sort0and1InArray {
	public static void main(String[] args) {
		int a[] = {1,0,1,0,1,1,0,0,1,0};
		segregate0and1(a);
		
	}
	public static void segregate0and1(int[] arr)
	{
		int k =0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				arr[k] = arr[i];
				k++;
			}
		}
		for(int i=k;i<arr.length;i++)
		{
			arr[i] = 0;
		}
		System.out.println(Arrays.toString(arr));
	}
}
