package thread;

class ExampleThread extends Thread {
	public void run() {
		try {
			System.out.println("Thread is in RUNNING state");

			// Simulating timed waiting (sleep for 2 seconds)
			System.out.println("Thread is going to sleep for 2 seconds");
			Thread.sleep(2000); // Thread enters Timed Waiting state
			System.out.println("Thread woke up after 2 seconds");

			// Simulating blocked state by acquiring a lock
			synchronized (this) {
				System.out.println("Thread is in synchronized block (Blocked state)");
				Thread.sleep(1000); // Thread enters Timed Waiting state again
				System.out.println("Thread is exiting synchronized block");
			}

		} catch (InterruptedException e) {
			System.out.println("Thread interrupted");
		}
	}
}

public class ThreadLifecycleDemo {
	public static void main(String[] args) throws InterruptedException {
		ExampleThread thread = new ExampleThread();

		// New state
		System.out.println("Thread is in NEW state");

		// Start the thread (it enters the Runnable state)
		thread.start();

		// Main thread waiting for the example thread to finish (joined)
		thread.join(); // Main thread waits for the ExampleThread to terminate

		// Main thread is now in TERMINATED state (since the ExampleThread is finished)
		System.out.println("Main thread finished");
	}
}
