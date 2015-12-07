
package lab13;
import java.io.*;
import java.util.*;


public class Lab13 {

    private int value;
    private final int min = 4;
    
    public static void main(String[] args) {
        
        try{
            File file = new File("file");
            Scanner scan = new Scanner(file);
            
        }
        
        catch(FileNotFoundException xx)
        {
            System.out.println(xx.toString());
        }
        
        try
        {
            int[] arr = new int[2];
            arr[4] = 9;
        }
        catch(ArrayIndexOutOfBoundsException x)
        {
         System.out.println(x.toString()); 
        }
        
        try
        {
            String[] str = new String[-4];
        }
        catch(NegativeArraySizeException x1)
        {
            System.out.println(x1.toString());
        }
        
        try
        {
         int x = 0;
         int y = 10;
         int z = y/x;
        }
        catch(ArithmeticException x2)
                {
                    System.out.println(x2.toString());
                }
        
        try
        {
            String s = "number";
            int t = Integer.parseInt(s);
        }
        catch(NumberFormatException x3)
        {
            System.out.println(x3.toString());
        }
        
        try
        {
         Object str[] = new String[3];
         str[0] = new Integer(0);
        }
        catch(ArrayStoreException x4)
        {
            System.out.println(x4.toString());
        }
        
        try{
            throw new NoogieException();
        }
        catch(NoogieException x5)
        {
            System.out.println(x5.toString());
        }
       
    
    
    try{
     throw new CoogieException();
    
}
    catch(CoogieException x6)
    {
     System.out.println(x6.toString());   
    }
    
    }
}

    

