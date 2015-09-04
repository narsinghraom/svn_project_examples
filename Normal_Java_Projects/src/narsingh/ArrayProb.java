package narsingh;

public class ArrayProb {
	
	
	public ArrayProb() {
		
	}
	public void arrayMethod(int[] b)
	{
		int len=b.length;
		for(int i=len-1;i>=0;i--)
		{
			System.out.println(b[i]);
			
		}
		
	}

	public static void main(String[] args) {
		
		ArrayProb ap=new ArrayProb();
		int[] a=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		ap.arrayMethod(a);

	}

}
