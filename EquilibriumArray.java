package arrayPrograms;

public class EquilibriumArray {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,6}; 
		int res = equilibrium(a);
		if(res!=-1)
		{
			System.out.println(res);
		}
		else
		{
			System.out.println("position not found");
		}
	}
	public static int equilibrium(int arr[])
	{
		int totalsum = 0;
		int leftsum = 0;
		int n = arr.length;
		for(int i=0;i<n;i++) {
			totalsum = totalsum + arr[i];
		}
		for(int i=0;i<n;i++) {
			
			totalsum -=arr[i];
			if(totalsum==leftsum) {
				return i;
			}
			leftsum += arr[i];
		}
		return -1;
		
		
	}
}
