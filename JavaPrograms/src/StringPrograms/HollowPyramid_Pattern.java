package StringPrograms;

import java.util.Scanner;

public class HollowPyramid_Pattern {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the size of the pyramid: ");
	    int size = sc.nextInt();
	    hollowStarPyramid(size);

	    sc.close();
	  }

	  // function to print hollow star pyramid
	  static void hollowStarPyramid(int size) {
	    // Outer loop for the number of rows
	    for (int i = 1; i <= size; i++) {
	      // first inner loop for spaces
	      for (int j = 1; j <= size - i; j++) {
	        System.out.print(" ");
	      }
	      // second inner loop for stars and intermediate spaces
	      for (int k = 1; k <= 2*i -1; k++) {
	        // check  if its first and last column or last row
	        // print star otherwise print space
	        if(k == 1 || k == 2*i -1 || i == size)
	          System.out.print("*");
	        else
	          System.out.print(" ");
	      }
	      System.out.println();
	    }


	}

}
