package pack1;
	// Define a class that implements Runnable
class SquarePrinter implements Runnable {
	    //Array of numbers for square calculation
	   int[] arr={2,3,4,5};
	    public void run() {
	        System.out.print("Squares of numbers in array: ");
	        for (int num : arr) {
	            System.out.print(num * num + " ");
	        }
	        System.out.println();
	    }
}
	    class AverageCalculator implements Runnable {
	   	 public void run() {
	   	        int sum = 0;
	   	        for (int i = 1; i <= 50; i++) {
	   	            sum += i;
	   	        }
	   	        int average =  sum / 50;
	   	        System.out.println("Average of first 50 numbers: " + average);
	   	    }	
 public static void main(String[] args) {
	        
	        // Create instances of the Runnable classes
	 		AverageCalculator obj= new AverageCalculator();
	        SquarePrinter obj1= new SquarePrinter();
	        
	        // Create threads for each task
	        Thread t=new Thread(obj);
	        Thread t1=new Thread(obj1);
	     
	        // Start both threads
	        t.start();
	        t1.start(); 
	    }

}
	
//output:
//Average of first 50 numbers: 25
//Squares of numbers in array: 4 9 16 25 

