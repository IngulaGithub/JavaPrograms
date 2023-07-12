package StringPrograms;

public class PrintNum1to100 {
	
	public static void printNum(int num) {
        
        //If numbers is less than or equal to 100
        if(num <= 100) {
           System.out.print(num + " ");
           
            //Increment and call printNum recursively
            printNum(num+1);
        }
    }

	public static void main(String[] args) {
		
		//Declare variable and assign a value 1
        int n = 1;
        
        //call printNum method
        printNum(n);
	}

}
