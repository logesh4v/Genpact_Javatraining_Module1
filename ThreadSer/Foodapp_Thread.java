package ThreadSer;

class TakeOrder extends Thread {
    public void run() {
        System.out.println("Taking order");
        System.out.println("Your cart is finalized");
        try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       
        
        try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Order taken");
    }
}

class ProcessPayment extends Thread {
    public void run() {
        System.out.println("Processing payment");
        try {
            Thread.sleep(8000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Payment done.");
    }
}

class AssignDeliveryAgent extends Thread {
    public void run() {
        System.out.println("Assigning delivery agent");
        try {
            Thread.sleep(8000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("DA assigned");
    }
}

/*public class Foodapp_Thread {
    public static void main(String[] args) {
        TakeOrder takeOrder = new TakeOrder();
        ProcessPayment processPayment = new ProcessPayment();
        AssignDeliveryAgent assignDeliveryAgent = new AssignDeliveryAgent();

        takeOrder.start();
        try {
            takeOrder.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        processPayment.start();
        try {
            processPayment.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assignDeliveryAgent.start();
        try {
            assignDeliveryAgent.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Order processing completed,You Will recieve the Order ,Thank you");
    }
}*/




public class Foodapp_Thread {
    public static void main(String[] args) {
        TakeOrder takeOrder = new TakeOrder();
        ProcessPayment processPayment = new ProcessPayment();
        AssignDeliveryAgent assignDeliveryAgent = new AssignDeliveryAgent();

        takeOrder.start();
        processPayment.start();
        assignDeliveryAgent.start();

        
        try {
            takeOrder.join();
            processPayment.join();
            assignDeliveryAgent.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Order processing completed.");
    }
}