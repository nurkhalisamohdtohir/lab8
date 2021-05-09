package exercise3;

/**
 * This class demonstrate suspension of threads.
 */

public class MultiArrayThreadSleep {
	
public static void main(String[] args) throws InterruptedException {
		
	// Create objects of runnable
	Runnable text = new ArrayThread();
	Runnable word1 = new ArrayThread();
	
	// Create objects of thread and give names
	Thread wordThread1 = new Thread(text, "text");
	Thread wordThread2 = new Thread(word1, "word1");
	

	wordThread1.start();
	wordThread2.start();

	}


}
