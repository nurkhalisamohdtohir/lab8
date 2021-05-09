package exercise1;

import java.time.LocalTime;

/**
 * This class demonstrate definition of task to be run simultaneously using 
 * extends Thread.
 *
 */

public class CurrentTime extends Thread {
	
	/**
	 * This method prints name of thread and current time for ten times
	 */
	public void printTime(String currentThreadName) {

		for (int counter = 0; counter < 10; counter++) {

			LocalTime current = LocalTime.now();

	        System.out.println(currentThreadName + "-> Current time is: " + current);
		}
	}
	
	@Override
	public void run() {
		
		// Get current thread name
		Thread currentThreadName = Thread.currentThread();

		// Execute task
		printTime( currentThreadName.getName());

	}

}
