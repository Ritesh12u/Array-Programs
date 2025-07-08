package arrayPrograms;

public class factorOfanNumberInArray {
	public static void main(String[] args) {
		int a[] = {2,5,10,15,19,30,35,60,120};
		int k = 30;
		factor(a,k);
	}
	public static void factor(int[] arr, int k)
	{
		for(int i=0; i<arr.length;i++)
		{
			if(k%arr[i]==0 && arr[i] !=k)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
