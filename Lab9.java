import java.util.*;

public class Lab9 {
    

    /**
     * Helper method for printing out arrays.
     * @param int[] arr Array of integers to print
     */
   
    
    public static void printArray(int[] arr) {
	System.out.print("[ ");
	for (int j=0; j < (arr.length - 1); j++) {
	    System.out.print(arr[j] + ", ");
	}
	if (arr.length > 0) {
	    System.out.print(arr[arr.length - 1]);
	}
	System.out.println(" ]");
	    
    }

    /**
     * Swap two elements in an array
     * @param int[] arr - the array
     * @param int index1 - the index of first element to swap
     * @param int index2 - the index of the second element to swap
     */

    public static void swap(int[] arr, int index1, int index2) {
        if (index1 == index2) {
	    // Do nothing!
	} else {
	    
            int tmp = arr[index1];
	    arr[index1] = arr[index2];
	    arr[index2] = tmp;
                      
	}
    }
    

    
    
    public static void selectionSort(int[] arr) {
	
	if (arr.length < 2) {
	    return;
	}
	
	int minIndex = 0;
	int minVal = 0;
        int swaps = 0;
        

	for (int j = 0; j < (arr.length-1); j++) {

	    
	    minIndex = j;
	    minVal = arr[j];
	    for(int k = j + 1; k < arr.length; k++) {

		if (arr[k] < minVal) {

		    minVal = arr[k];
		    minIndex = k;
		}
	    }
	    swap(arr, j, minIndex);
            if(minIndex != j)
            {
                swaps++;
            }
            
	}
        System.out.print("Selection Sort: ");
        printArray(arr);
        System.out.println("Swaps = "+swaps);

    }
    
    public static void bubbleSort(int[] arr)
    {
        if (arr.length < 2) {
	    return;
	}

        int bubSwaps = 0;
        boolean done_sorting = false;
        int iteration;
        
        while (done_sorting == false)
        {
            iteration = 1;
	for (int j = 0; j < (arr.length-1); j++) {
            int k = j +1;
            if (arr[j] > arr[k])
            {
                swap(arr, j, k);
                bubSwaps++;
                iteration = 0;
                
            }   
            }
            if(iteration == 1)
            {
                done_sorting = true;
            }
            
        
        }
        
        
        System.out.print("Bubble Sort: ");
        printArray(arr);
        System.out.println("Swaps = "+bubSwaps);

    
        
    
    }
    
    public static int[][] deepCopy(int[][]arr)
    {
        int[][] newA1 = new int[arr.length][arr[0].length];
        for(int i =0; i < arr.length; i ++)
                {
                    newA1[i] = Arrays.copyOf(arr[i], arr[i].length);
                }
        return newA1;
    }

    public static void main(String[] args) {
	int[][] a1 = { {8, 9, 5, 6, 4, 3},
		       {9, 0, 14, 13, 10, 8, 2, 1, 17, 18, 19, 201, 220, 235, 2},
		       {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200 },
		       {22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 1},
		       {20, 18, 13, 12, 11, 9, 6, 5, 4, 3, 2, 1, -87, -900, -9, -909, -911, -80, -44, -32, -1000} };
        
                       int[][] newA1 = deepCopy(a1);
                       
                       
                       int[][] a2 = new int[newA1.length][];
                       a2[0] = new int[6];
                       a2[1] = new int [15];
                       a2[2] = new int[12];
                       a2[3] = new int[11];
                       a2[4] = new int[21];
                       
                       a2[0] = newA1[0];
                       a2[1] = newA1[1];
                       a2[2] = newA1[2];
                       a2[3] = newA1[3];
                       a2[4] = newA1[4];
                       
                       
                       int[][] newA2 = deepCopy(a2);
                       
                       for(int row = 0; row < newA1.length; row++ )
                       {
                           selectionSort(newA1[row]);
                           
                       }
                       
                       for (int row = 0; row < newA2.length; row++)
                       {
                           
                           bubbleSort(newA2[row]);
                           
                       }
                       
                       

    }

    
}

