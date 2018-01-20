/*
  
  READS INTEGERS
  
 import java.util.Scanner;

public class ReadingIntegers 

  {

	//MAIN METHOD 
	public static void main(String[] args) 

  {
		//SCANNER DECLARATION 
		Scanner input = new Scanner(System.in);
		
		//PROMPTS USER FOR INPUT 
		System.out.println("Please enter the numbers: ");
		
		//GETS VALUES FOR LINE INPUT 
		String values = input.nextLine();
		
		//CREATES MAX INTEGER
		int max = 0;
		
		//CREATES COUNT INTEGER 
		int count = 0; 
		
		
	//FOR LOOP
        for (int i = 0; i < values.length(); i++)
        {
        	//CREATES CHARACTER C
        	char c = values.charAt(i);
        	//SETS CHARACTER EQUAL TO USER INPUT 
        	if (c == ' ')  continue; 
        	
        	//IF STATEMENT TO MAKE CHARACTER A DIGIT 
        	if (Character.isDigit(c))
        	{
        		      		
        		//INT VALUE TO MAKE 'C' A NUMBER VALUE 
        		int value = Character.getNumericValue(c); 
        		//IF STATEMENT: VALUE GREATER THAN MAX
        		if (value > max)
        		{
        			//SET COUNT TO 1
        			count = 1; 
        			//SET MAX EQUAL TO VALUE 
        			max = value; 
        			
        		}

        		//ELSE IF STATEMENT: VALUE EQUAL TO MAX
        		else if (value == max)
        		{
        			//INCREMENT COUNT 
        			count++;       			
        		}
        		        		
        		//CHECK CURRENT DIGIT TO SEE IF IT IS GREATER THAN MAX, 
        		//IF IT IS - SET NEW MAX VALUE TO THAT CHARACTER - SET COUNT TO 1. 
        		//CHECK TO SEE IF CURRENT DIGIT IS EQUAL TO MAX (ELSE) THEN INCREMENT COUNT BY 1. 
        		//OUTPUT COUNT AND MAX AFTER LOOP 
        	}

         }
		 //PRINT STATEMENT: FINDS LARGEST NUMBER 
                System.out.println("The Largest Number of List: " + max);
                
                //PRINT STATEMENT: LARGEST NUMBER OCCURANCE 
                System.out.println("The Occurance of List Count: " + count);
		}
     } 

   

