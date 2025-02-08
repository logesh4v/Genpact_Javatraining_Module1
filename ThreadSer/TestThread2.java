package ThreadSer;

public class TestThread2 extends Thread{

	@Override

	public void run() {
		try {
		Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Thread is running(Class) : " + Thread.currentThread().getName());

	}

}
 