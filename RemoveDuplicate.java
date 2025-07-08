package arrayPrograms;

import java.util.Arrays;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int a[] = {1,2,4,2,7,4,5,3,7,8};
		Remove(a);
	}
	public static void Remove(int arr[])
	{
		int n = arr.length;
		int count = 0;
		for(int i=0;i<n;i++)
		{
			if(arr[i] !=-1)
			{
				for(int j=i+1;j<n;j++)
				{
					if(arr[j] != -1 && arr[i]==arr[j])
					{
						arr[j] = -1;
						count++;
					}
				}
			}
		}
		int k = 0;
		int res[] = new int[n-count];
		for(int i=0;i<n;i++)
		{
			if(arr[i] !=-1)
			{
				res[k++] = arr[i];
			}
		}
		System.out.println(Arrays.toString(res));
	}
}
