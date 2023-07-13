package StringPrograms;

public class ReturnMultipleValues {

	public static void main(String[] args) {
		int[] values=ArrayElemennts();
		System.out.println(values[0]);
		System.out.println(values[1]);
	}
	
	/*
	 * Returning multiple values 
	 */
	public static int[] ArrayElemennts() {
		int arr[]=new int[2];
		arr[0]=16321;
	    arr[1]=3131;
		return arr ;
 		
	}
}
