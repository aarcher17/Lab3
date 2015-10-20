/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Alex
 */
class Lab06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("How big a world: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char[] newUniverse = generateUniverse(num);
    }

    public static char[] generateUniverse(int worldSize) throws IOException
    {
     int numBabies, numChildren, numAdults;
     char[] universe = new char[worldSize];
     boolean running = true;

      for(int worldChar = 0; worldChar < worldSize; worldChar ++)
     {
      if ((worldChar%7) == 0)
      {
          universe[worldChar] = '0';
      }
      else if((worldChar%5)== 0)
      {
          universe[worldChar] = '^';
      }
      else
      {
          universe[worldChar] = '.';
      }
     }

     while (running == true)
     {
     String option = "empty";
        while (option != "Q")
        {
      System.out.println(universe);
      System.out.println("\nQ-Quit, A-Advance, S-Save");
      Scanner sc = new Scanner(System.in);
      option = sc.next();
      

            if(option.equals("A"))
            {
                for(int worldChar = 0; worldChar < universe.length; worldChar++)
                {
                    if(universe[worldChar]=='0')
                    {
                        universe[worldChar] = '1';
                    }
                    else if(universe[worldChar]=='1')
                    {
                        universe[worldChar] ='2';
                    }
                    else if (universe[worldChar] == '2' &&
                            universe[worldChar + 1] == '^')
                    {
                        universe[worldChar] = '.';
                        universe[worldChar + 1] = '0';
                        worldChar++;
                    }
                    else if (universe[worldChar]== '2' 
                            && universe[worldChar+1]=='.')
                    {
                        universe[worldChar] = '.';
                        universe[worldChar+1] = '2';
                        worldChar++;
                    }

                }

            }
            if (option.equals("S"))
            {
             String filename = "universe";
             PrintWriter outputFile = new PrintWriter(filename);
             outputFile.println(universe);
             outputFile.close();
            }
            if(option.equals("Q")) {
            	running = false;
            	break;
            }
        }
        
        running = false;


    }
    return universe;

    }
}

