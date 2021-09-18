package helloworld;

import java.lang.*;

public class EvenOdd {
	int counter = 1; 

	static int N; 

	public void odd() {
		synchronized (this) 
		{ 
			while (counter < N) { 
				while (counter % 2 == 0) { 
					try { 
						wait(); 
					} 
					catch ( 
						InterruptedException e) { 
						e.printStackTrace(); 
					} 
				} 
				System.out.print(counter + " "); 
				counter++; 
				notify(); 
			} 
		} 
	}

	public void even() {
		synchronized (this) {

			while (counter < N) {

				while (counter % 2 == 1) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace(); 
					}
					System.out.println(counter);
					counter++;
					notify();
				}
			}
		}
	}

	public static void main(String args[]) {
		N = 10;
		EvenOdd e1 = new EvenOdd();

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				e1.even();
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				e1.odd();
			}
		});

		t1.start();
		t2.start();
	}

}
