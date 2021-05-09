package exercise3;

/**
 * This class demonstrate a class definition of a thread using 
 * implements Runnable.
 */

public class ArrayThread implements Runnable {
	
	String wordsArray [] = {"It", "is", "recommended", "to", "use", "Calendar", "class"};
	
	/**
	 * This method prints words in array based on the counter and suspend the current thread
	 */
	public void printWords (String currentThreadName) {
		
		try { 
			for (int counter = 0; counter < 10; counter++) {
				
				
				for (String word: wordsArray) {
					System.out.println(currentThreadName + "-> " + word);
				}
				
				// Suspend the current thread for 5 seconds
				Thread.sleep(5000);
				System.out.println("Thread is suspended for 5 seconds");
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void run() {
		
		// Get current thread name
		Thread currentThreadName = Thread.currentThread();
		
		// Execute task
		printWords(currentThreadName.getName() );
		
	}

}

