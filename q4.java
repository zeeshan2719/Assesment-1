package test;

import java.io.*;
import java.util.*;

public class q4 {
	static int Jump(int arr[], int l, int h)
	{
		if (h == l)
			return 0;
		if (arr[l] == 0)
			return Integer.MAX_VALUE;

		int min = Integer.MAX_VALUE;
		for (int i = l + 1; i <= h && i <= l + arr[l];i++) {
			int jumps = Jump(arr, i, h);
			if (jumps != Integer.MAX_VALUE && jumps + 1 < min)
				min = jumps + 1;
		}
		return min;
	}
	public static void main(String args[])
	{
		int n;  
        Scanner sc=new Scanner(System.in); 
        n=sc.nextInt();  
        int[] arr = new int[n];  
        for(int i=0; i<n; i++)
            arr[i]=sc.nextInt(); 
	    System.out.println(Jump(arr, 0, n - 1));
	}
}

