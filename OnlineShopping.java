package pack1;

public class OnlineShopping {
	boolean orderConfirmed=false;
	public synchronized void confirmOrder() {
		System.out.println("placing the order.....");	
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Order placed successfully...");
		orderConfirmed=true;
		notify();
	}
	public synchronized void completePayment() {
		while(!orderConfirmed) {
			try {
				System.out.println("waiting for order conformation");
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("completing payment");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("payment completed.order confirmed");
	}

	public static void main(String[] args) {
		OnlineShopping obj=new OnlineShopping();
		Thread t=new Thread(() ->{
			obj.confirmOrder();
		});
		Thread t1=new Thread(()->{
			obj.completePayment();
		});
		t.start();
		t1.start();
		
	}

}

//output:
//placing the order....
//order placed successfully
//completing payment
//payment completed.order confirmed
