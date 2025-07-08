package arrayPrograms;

public class ArrayExample {
	public static void main(String[] args) {
		int[][] b = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		for(int i=0;i<b.length;i++) //iterating over row
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		//Sum the element of the array
		
		int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		int sum = 0;
		
		for(int i=0;i<a.length;i++) //iterating over row
		{
			for(int j=0;j<a[i].length;j++)
			{
				sum = sum + a[i][j];
			}
		}
		System.out.println(sum);
	}
}
