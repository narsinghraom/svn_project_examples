package narsingh;
import java.io.*;

public class SerializationExample implements Serializable 
{
	String eName,eId;
	transient double eSal;
	void serialization()
	{
		SerializationExample s=new SerializationExample();
		s.eId="1140";
		s.eName="narsingh";
		s.eSal=19800.00;
		try
		{
		FileOutputStream f=new FileOutputStream("D:/Normal_Java_Projects/src/narsingh/se.txt");
		ObjectOutputStream out=new ObjectOutputStream(f);
		out.writeObject(s);
		
		out.close();
		f.close();
		System.out.println("serialization is done");
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("file not found");
		}
		finally
		{
			
	
		}
		
	}
	void deserialization()
	{
		try
		{
		FileInputStream f=new FileInputStream("D:/Normal_Java_Projects/src/narsingh/se.txt");
		ObjectInputStream out=new ObjectInputStream(f);
		Object o=out.readObject();
		SerializationExample se=(SerializationExample)o;
		System.out.println("details are" );
		System.out.println("eid " +se.eId + "\t" + "ename " +se.eName + "\t" + "esal " +se.eSal);
		out.close();
		f.close();
		}
		catch(Exception e)
		{
			System.out.println("file not found");
		}
	}

	public static void main(String[] args) 
	{
		SerializationExample se=new SerializationExample();
		//se.serialization();

		se.deserialization();
	}

}

