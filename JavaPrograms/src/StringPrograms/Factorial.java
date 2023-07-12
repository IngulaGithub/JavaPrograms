package StringPrograms;

public class Factorial          	//print the factorial of number 10

{
        public static void main(String[] args) 
        {
                int i=1,fact=1;
                do
                {
                        fact=fact*i;
                        i++;
                }
                while (i<=10);
                        
                System.out.println("The factorial of number 10 is "+fact);
        }
}



