/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author laddu
 */
import java.util.*;
public class Repeated {
    void repeated(String str)
    {
        
        int size=str.length();
        int count=0;
        for(int j=0;j<=size-1;j++)
        {
            
        char repeat=str.charAt(j);
        count=0;
        for(int i=0;i<=size-1;i++)
        {
            if(repeat==str.charAt(i))
            {
                count++;
                repeat=str.charAt(i);
                                
            }
        }
        System.out.println(repeat +" repeated " +count +" times in " +str);
        }
       
       
    }
    public static void main(String[] args) {
        Repeated r= new Repeated();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the String to find repeated alphabts");
        String string=input.nextLine();
        r.repeated(string);

    }
    
}
