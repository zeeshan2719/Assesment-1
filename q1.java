package test;

import java.util.Scanner;

public class q1 {
	public static int accept() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the starting destination (btw 5 to 8):  ");  
		int n= sc.nextInt();
		if(n<5 || n>8) {
			System.out.println("Chose between 5 to 8");
			return accept();
		}
		else {
			return n;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = accept();
		
		System.out.println(n);
		for(int i=n;i>=0;i--) {
			System.out.println("Distance to run : "+i);
			if(i==n-1)
				System.out.println("Good start,keep it up!");
			if(i==2||i==1)
				System.out.println("Almost there");
			if (i==0)
				System.out.println("Done for the day");
		}

	}

}
