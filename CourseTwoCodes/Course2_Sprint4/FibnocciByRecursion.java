package Course2_Sprint4;
public class FibnocciByRecursion {
	
		public int fibonacci(int number) {
			
			if(number <=1){
				return number;
			}
			
		    return fibonacci(number - 1) + fibonacci(number - 2);
			
	    }
		
	    // Print the series inside the method
	    public void printFibonacciSeries(int number){
         for(int i=0;i<=number;i++) {
        	 System.out.print(fibonacci(i) + " ");
         }
          
	    }
	    
	    public static void main( String[] args )
	    {
	        FibnocciByRecursion fib = new FibnocciByRecursion();
	        // Call the  printFibonacciSeries() method and pass the value.
	    //  int num= fib.fibonacci(9);
	        fib.printFibonacciSeries(9);
	    }

	}

