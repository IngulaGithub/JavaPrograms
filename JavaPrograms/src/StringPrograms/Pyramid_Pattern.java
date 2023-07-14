package StringPrograms;

import java.util.Scanner;

public class Pyramid_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the size of the pyramid: ");
	    int size = sc.nextInt();
	    starPyramid(size);

	    sc.close();
	  }

	  // function to print star pyramid
	  static void starPyramid(int size) {
	    // Outer loop for the number of rows
	    for (int i = 1; i <= size; i++) {
	      // first inner loop for spaces
	      for (int j = 1; j <= size - i; j++) {
	        System.out.print(" ");
	      }
	      // second inner loop for stars
	      for (int k = 1; k <= 2*i -1; k++) {
	        System.out.print("*");
	      }
	      System.out.println();
	    }



	}

}
