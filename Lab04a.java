/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab04a;
import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class Lab04a {

    /**
     * 
     */
    public static void main(String[] args) {
        String name;
        int utils = 0;
        byte choice = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.next();
        
        while(choice != 4)
        {
        System.out.println("(1) Buy people ice cream");
        System.out.println("(2) Steal ice cream from people");
        System.out.println("(3) Dream about people eating ice cream");
        System.out.println("(4) Die");
        
        choice = sc.nextByte();
        
        switch(choice)
        {
            case 1: utils += 3;
                break;
                
            case 2: utils -= 5;
                break;
                
            case 3: utils += 0;
                break;
                
            case 4: break;
                
                
        }
        }
        
        System.out.format(name + " caused %d units of happiness", utils);
        
        if (utils < 0)
        {
            System.out.println("\nThis was not a morally good life");
          
        }
        
        if (utils == 0)
        {
            System.out.println("\nThis was a morally neutral life");
        }
        
        if (utils > 0)
        {
            System.out.println("\nThis was a morally good life");
        }
        
    }
    
}
