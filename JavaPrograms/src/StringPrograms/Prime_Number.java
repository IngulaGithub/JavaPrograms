package StringPrograms;

public class Prime_Number {

	public static void main(String[] args) {

	       int i =0; 
	       int num =0; 
	       //Empty String 
	       String  primeNumbers = ""; 
	 
	       for (i = 1; i <= 1000; i++)          
	       { 		  	   
	          int counter=0; 	   
	          for(num =i-1; num>=2; num--) 
		  { 
	             if(i%num==0) 
		     { 
	 		counter = counter + 1; 
		     } 
		  } 
		  if (counter == 0) 
		  { 
		     //Appended the Prime number to the String 
		     primeNumbers = primeNumbers + i + " "; 
		  }	 
	       }	 
	       System.out.println("Prime numbers from 1 to 100 are :"); 
	       System.out.println(primeNumbers); 

	}

}
