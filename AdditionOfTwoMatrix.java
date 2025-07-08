package arrayPrograms;

import java.util.Arrays;

public class AdditionOfTwoMatrix {
	public static void main(String[] args) {
		int a[][] = {{5,1,3},{9,8,4},{6,2,9}};
		int b[][] = {{1,4,6},{8,5,7},{10,9,3}};
		
		int m[][] = new int[a.length][a[0].length];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				m[i][j] = a[i][j] + b[i][j]; 
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(m[i][j]+" "); 
			}
			System.out.println();
		}
		
		//for each loop using Arrays.toString(arrref)
		
		for(int[] x : m)
		{
			System.out.println(Arrays.toString(x));
		}
	}
}
