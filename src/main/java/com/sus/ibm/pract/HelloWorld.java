package com.sus.ibm.pract;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintHelloWorld printHelloWorld = new PrintHelloWorld();

		Thread helloThread = new Thread(new HelloThread(printHelloWorld));
		helloThread.setName("Hello");

		Thread worldThread = new Thread(new WorldThread(printHelloWorld));
		worldThread.setName("World");

		worldThread.start();
		helloThread.start();

	}

}



class PrintHelloWorld {

	int count = 0;

	public synchronized void printHello() {
		while (count == 1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.print("Hello");
		System.out.print(" ");
		count++;
		notifyAll();
	}

	public synchronized void printWorld() {
		while (count == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.print("World");
		System.out.print(" ");
		count--;
		notifyAll();

	}
}

 class WorldThread implements Runnable {
	PrintHelloWorld printHelloWorld = null;

	public WorldThread(PrintHelloWorld printHelloWorld) {
		this.printHelloWorld = printHelloWorld;
	}

	public void run() {

		int count = 0;
		while (count < 10) {
			printHelloWorld.printWorld();
			count++;
		}
	}
}
 class HelloThread implements Runnable {
		PrintHelloWorld printHelloWorld = null;

		public HelloThread(PrintHelloWorld printHelloWorld) {
			this.printHelloWorld = printHelloWorld;
		}

		public void run() {

			int count = 0;

			while (count < 10) {
				printHelloWorld.printHello();
				count++;
			}
		}
	}