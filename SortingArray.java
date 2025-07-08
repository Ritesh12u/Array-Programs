package arrayPrograms;

import java.util.Arrays;

public class SortingArray {
	public static void main(String[] args) {
		int a[] = {7,1,6,3,5};
		sortInAscending(a);
		sortInDescending(a);
	}
	public static void sortInAscending(int arr[])
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void sortInDescending(int arr[])
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
