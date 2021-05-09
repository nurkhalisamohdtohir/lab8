package exercise2;

/**
 * This class demonstrate a class definition of a thread using 
 * implements Runnable.
 */

public class ArrayThread implements Runnable {
	
	String wordsArray [] = {"It", "is", "recommended", "to", "use", "Calendar", "class"};
	
	/**
	 * This method prints words based on the counter
	 */
	public void printWords (String currentThreadName) {

		for (int counter = 0; counter < 10; counter++) {
			
			
			for (String word: wordsArray) {
				System.out.println(currentThreadName + "-> " + word);
			}
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
