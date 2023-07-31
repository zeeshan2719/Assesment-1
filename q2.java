package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		//Array[] arr1= new Array[20];
		int[] arr= new int[20];
		System.out.println("enter the no of days : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> li = new ArrayList<>();
		int c=0,pro=0,loss=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>0) {
				pro +=arr[i];
				c++;
			}
			else {
				li.add(arr[i]);
			}
		}
		Collections.sort(li, Collections.reverseOrder());
		
//		ArrayList<Integer> li = new ArrayList<>();
//		for(int i=0;i<n;i++) {
//			li.add(arr[i]);
//		}
//		Collections.sort(li);
		System.out.println(li);
		for(int i=0;i<c-1;i++) {
			loss += li.get(i);
		}
		System.out.println(pro+loss);

	}

}
