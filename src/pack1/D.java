package pack1;

public class D implements Runnable{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println("Some one distrub my sleep");
			}
			
		}
	}
	D() {
		System.out.println("constuctor");
	}
	
	public static void main(String[] args) throws InterruptedException {
		D d = new D();
		Thread t = new Thread(d);
		t.start();
		t.join();
		t.interrupt();
	    Thread.yield();
		for (int i = 0; i < 5; i++) {
		System.out.println("Completion of Thread");
		
	}

	}

}
