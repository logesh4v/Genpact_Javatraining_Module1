package ThreadSer;

public class TestThread implements Runnable{
 
	@Override

	public void run() {
		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated method stub

		System.out.println("Thread is running(Inter)"+Thread.currentThread().getName());	

	}
 
}

 