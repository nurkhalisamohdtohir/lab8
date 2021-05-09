package exercise2;

/**
 * This class demonstrate creation of thread objects from class 
 * that implements Runnable
 */

public class MultiArrayThread {
	
	public static void main(String[] args) {

		// Create objects of runnable
		Runnable text = new ArrayThread();
		Runnable word1 = new ArrayThread();
		
		// Create objects of thread
		Thread wordThread1 = new Thread(text, "text");
		Thread wordThread2 = new Thread(word1, "word1");
		

		wordThread2.start();
		wordThread1.start();

	}

}
