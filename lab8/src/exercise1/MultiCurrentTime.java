package exercise1;

/**
 * This class demonstrate implementation of multiple threads
 * from the same definition of class Thread.
 */

public class MultiCurrentTime {
	
	public static void main(String[] args) {
		
		// Create objects of thread
		Thread timeThread1 = new CurrentTime();
		Thread timeThread2 = new CurrentTime();
		timeThread1.setName("Thread1");
		timeThread2.setName("Thread2");

		// Execute threads
		timeThread2.start();
		timeThread1.start();

	}

}
