package test;

import java.util.Scanner;

public class q3 {
	static boolean hel(int arr[], int n, int start, int lsum, int rsum)
	{
		if (start == n)
			return lsum == rsum;

		if (arr[start] % 5 == 0)
			lsum += arr[start];

		else if (arr[start] % 3 == 0)
			rsum += arr[start];

		else
			return hel(arr, n, start + 1, lsum + arr[start], rsum)
			|| hel(arr, n, start + 1, lsum, rsum + arr[start]);

		return hel(arr, n, start + 1, lsum, rsum);
	}

	static boolean split(int arr[], int n)
	{
		return hel(arr, n, 0, 0, 0);
	}


	public static void main(String[] args) {
		int n;  
        Scanner sc=new Scanner(System.in); 
        n=sc.nextInt();  
        int[] arr = new int[n];  
        for(int i=0; i<n; i++)
            arr[i]=sc.nextInt();  
	    if (split(arr, n))
            System.out.println( "True");
        else
            System.out.println( "False");
		

	}

}
