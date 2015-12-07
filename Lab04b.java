/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Lab04b {

    /**
     * 
     */
    public static void main(String[] args) {
        byte num = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Level: ");
        num = sc.nextByte();
        
        switch(num)
        {
            case 1:
                System.out.println("Physiological");
                break;
                
            case 2:
                System.out.println("Physiological \nSafety");
                
            case 3:
                System.out.println("Physiological \nSafety \nLove");
                
            case 4:
                System.out.println("Physiological \nSafety \nLove and Belonging"
                        + " \nEsteem");
                
            case 5:
                System.out.println("Physiological \nSafety \nLove and Belonging"
                        + " \nEsteem \nSelf-Actualization");
                
                
               
        }
        
    }
    
}
