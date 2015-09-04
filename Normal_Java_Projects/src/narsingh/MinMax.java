package narsingh;
import java.util.*;
public class MinMax {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int min=0;
		int max=0;
		
		System.out.println("Enter the size of Array");

		int size=input.nextInt();
		
		System.out.println("Eknter the list of arrays");
		
		int[] array=new int[size];
		
		for(int i=0;i<=size-1;i++)
		{
			array[i]=input.nextInt();
		}
		min=array[0];
		max=array[0];
		
		for(int i=0;i<=size-1;i++)
		{
			if(array[i]<min)
			{
				min=array[i];
			}
			else
if(array[i]>max)
{
	max=array[i];
	}
}
		System.out.println("min" +min);
		System.out.println("max" +max);
	}

}
