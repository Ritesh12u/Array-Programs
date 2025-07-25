package arrayPrograms;

public class PrimeNumberInArray {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9};
		prime(a);
	}
	public static void prime(int[] arr)
	{
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])) {
				System.out.println(arr[i]);
			}
		}
	}
	public static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;

        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
