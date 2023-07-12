package StringPrograms;

import java.util.Scanner;

public class Strong_Number {

	public static void main(String[] args) {
		int num,sum=0,rem,temp;
	     Scanner scanner=new Scanner(System.in);
	     System.out.println("Enter the number ");
	     num=scanner.nextInt();
	     temp=num;
	     
	     while(num>0)
	     {
	    	 rem=num%10;
	    	 int fact=1;
	    	 for(int i=1;i<=rem;i++)
	    	 {
	    		 fact=fact*i;
	    	 }
	    	 num=num/10;
	    	 sum=sum+fact;
	     }
	     if(temp==sum)
	     {
	    	 System.out.println(sum+"Number is Strong Number ");
	     }
	     else {
			System.out.println(sum +"number is not strong Number");
		}

	}

}
