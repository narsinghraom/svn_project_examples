package st;

import java.util.Scanner;

public class RevArray {

	int[] a=new int[5];
	Scanner s=new Scanner(System.in);
	public void details()
	{
		System.out.println("enter values");
		for(int i=0;i<=5-1;i++)
		{
			a[i]=s.nextInt();
		}
		print(a);
		
	}
	public void print(int[] a)
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
	}
	
	public static void main(String args[])
	{
		RevArray r=new RevArray();
		r.details();
	}
	
}
