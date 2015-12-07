/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab13;
import java.util.*;

public class CoogieException extends Exception {
    private int numCats;
    
    public CoogieException()
    {
        super("Error: CoogieException");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of cats: ");
        numCats = sc.nextInt();
        
    }
    
    public String toString()
    {
        return numCats + " is too many cats!";
    }
    
}
