package arrayPrograms;

public class smallestInArray {
	public static void main(String[] args) {
		int a[] = {7,1,6,3,5};
		smallest(a);
		largest(a);
		largest2nd(a);
		smallest2nd(a);
	}
	public static void smallest(int[] arr)
	{
		int min = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Smallest element is: " + min);
	}
	public static void largest(int[] arr)
	{
		int max = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element is: " + max);
	}
	public static void largest2nd(int[] arr)
	{
		int firstlargest = -1;
		int secondlargest = -1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>firstlargest) {
				firstlargest = arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>secondlargest && arr[i] !=firstlargest)
			{
				secondlargest = arr[i];
			}
		}
		System.out.println("2nd Largest :"+secondlargest);
	}
	public static void smallest2nd(int[] arr)
	{
		int firstsmall = arr[0];
		int secondsmall = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<firstsmall) {
				firstsmall = arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<secondsmall && arr[i] !=firstsmall)
			{
				secondsmall = arr[i];
			}
		}
		System.out.println("2nd smallest :"+secondsmall);
	}
}
