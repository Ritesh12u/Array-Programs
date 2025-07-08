package arrayPrograms;

public class SumOfPrimaryAndSecondaryDiangonal {
	public static void main(String[] args) {
int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		int sum = 0;
		int sum2 = 0;
		
		for(int i=0;i<a.length;i++) //iterating over row
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==j)
				{
					sum = sum + a[i][j];
				}
				
				if(i+j==a.length-1)
				{
					sum2 = sum2 + a[i][j];
				}
			}
		}
		System.out.println("PrimarySum :"+sum);
		System.out.println("SecondarySum :"+sum);
	}
}
