/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
import java.util.Scanner;

public class Lab3b {
    public static void main(String[] args)
    {
     
        int numBottles = 0;
        boolean keepAsking = true;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter int num of bottles of root beer on wall: ");
        
            while(keepAsking == true)
            {

            
            
          
            if(sc.hasNextInt())
            {
        
                numBottles = sc.nextInt();
                if ((numBottles > 0 && numBottles < 100))
                        {
                            keepAsking = false;
                        }
                else
                {
                    System.out.println("Not in range!");
                }
                        
                
            }
                else{
                    System.out.println("Enter an integer");
                    sc.next();
                    
                    
                        }
                
            }
            
            
        
        for (numBottles = numBottles; numBottles > 0; numBottles--)
        {
            System.out.println();
            
            int numRs = numBottles;
            while (numRs > 0){
            System.out.print("R");
            numRs --;
        }
        
        
    }
        System.out.println("\nNo more bottles of root beer on the wall!");
    }
}


