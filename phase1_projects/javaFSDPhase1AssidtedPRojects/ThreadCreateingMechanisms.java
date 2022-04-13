package javaFSDPhase1AssidtedPRojects;

	public class ThreadCreateingMechanisms {

		public static void main(String[] args) {
			Runnable runnableObj = new ThreadRunnable();
			Thread t1 = new Thread(runnableObj);
			t1.start();
		}
	}
	class ThreadRunnable implements Runnable {
		public void run() {
			System.out.println("Thread is running....");
		}
	}

