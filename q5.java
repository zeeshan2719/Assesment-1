package test;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        String temp;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        String names[] = new String[n];
        Scanner s1 = new Scanner(System.in);
        for(int i = 0; i < n; i++)
        {
            names[i] = s1.nextLine();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (names[i].compareTo(names[j])>0) 
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(names[i] + ",");
        }
        System.out.print(names[n - 1]);

	}

}
