package st;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=1;i<=b;i++)
		{
			a++;
		}
		System.out.println("Addition is " +a);

	}

}
