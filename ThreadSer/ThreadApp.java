package ThreadSer;

public class ThreadApp {

	public static void main (String args[])
	{
		Counter objC=new Counter();
		
		TestThread2 t1=new TestThread2();
		
		TestThread runnable=new TestThread();
		Thread t2=new Thread(runnable);
		
		Thread t3=new Thread(()->{
			for(int i=0;i<5;i++)
			{
				objC.increamentCount();
			}
		}
		
);
	
		
		Thread t4=new Thread(()->{
			for(int i=0;i<4;i++)
			{
				objC.increamentCount();
			}
		}
		
);
		
		
		
//		t1.start();
//		t2.start();
		
		
		t3.start();
		t4.start();
		
		try {
//			t1.join();
//			t2.join();
			t3.join();
			t4.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println(objC.getCount());
		
		System.out.print("The Process has been completed");
	}
}


//sync
//shared Bank account-user 2
//balance-1000
//user 1-t1-withdraw
//user 2-pall another thread--t2--deposit--200--1200
//inconsistent balance