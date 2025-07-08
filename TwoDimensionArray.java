package arrayPrograms;

public class TwoDimensionArray {
	public static void main(String[] args) {
		int[][] a = new int[3][4];
		System.out.println(a.length); // size of row
		System.out.println(a[0].length); //size of column
		
		a[1][2] = 100;
		
		System.out.println(a[1]); //address of an array
		
		for(int i=0;i<a.length;i++) //iterating over row
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("------------");
		
		int[][] b = {{1,2,3},{4,5,6}};
		
		for(int i=0;i<b.length;i++) //iterating over row
		{
			for(int j=0;j<b[0].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}
