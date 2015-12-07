/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Alex
 */
public class Lab3a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double distanceApart = 10.0;
        int numSteps = 0;
        
        while (distanceApart > 0)
        {
            distanceApart /= 2;
            numSteps ++;
        }
        
        System.out.println("The number of steps taken to disprove Zeno was " +
                numSteps);
    }
    
}
