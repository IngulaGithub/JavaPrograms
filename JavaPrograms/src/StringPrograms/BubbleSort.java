package StringPrograms;

public class BubbleSort {
	
	    static void bubblesort(int a[])
	    {
	        int len = a.length; // calculating the length of array
	        for (int i = 0; i < len-1; i++) {

	            // for optimization when array is already sorted & no swapping happens
	            boolean swapped = false;
	            for (int j = 0; j < len - i - 1; j++) 
	            { 
	                if (a[j] > a[j + 1]) //comparing the pair of elements
	                {
	                    // swapping a[j+1] and a[i]
	                    int temp = a[j];
	                    a[j] = a[j + 1];
	                    a[j + 1] = temp;
	                    // swapping happened so change to true
	                    swapped = true;
	                }
	            }

	            // if no swaps happened in any of the iteration
	            // array has become sorted so stop with the passes
	            if(swapped == false)
	                break;

	        }
	    }

	    /* Prints the array */
	    static void printArray(int a1[])
	    {
	        int len = a1.length;
	        for (int i = 0; i < len; i++)
	            System.out.print(a1[i] + " "); //printing the sorted array

	        System.out.println();
	    }

	    // Main method to test above
	    public static void main(String args[])
	    {
	        int arr[] = {21,45,19,18,6,8,9};

	        bubblesort(arr);//calling the bubbleSort function

	        System.out.println("Sorted array");

	        printArray(arr); //calling the printArray function
	    }
	

}
