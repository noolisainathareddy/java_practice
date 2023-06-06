public class DeadLock {
   public  String Lock1 = "Hema";
   public String Lock2 = "Sai";

   public class Thread1 extends Thread{
     public void run(){
        Thread.currentThread().setName("Thread 1");
         synchronized (Lock1){

            System.out.println("Lock1 completed " + Thread.currentThread().getName());
             try{Thread.sleep(100);} catch(Exception e){}
             synchronized (Lock2){
                 System.out.println("Waiting for Lock2 " + Thread.currentThread().getName());
             }
         }

      }
   }
   public class Thread2 extends Thread{
      public void run(){
         Thread.currentThread().setName("Thread 2");
         synchronized (Lock2){
            System.out.println("Lock2 completed " + Thread.currentThread().getName());
             try{Thread.sleep(100);} catch(Exception e){}
             synchronized (Lock1){
                 System.out.println("Waiting for Lock1 " + Thread.currentThread().getName());
             }
         }

      }
   }
   public static void main(String args[]) {
      TestThread testThread = new TestThread();
      TestThread.Thread1 thread1 = testThread.new Thread1();
      TestThread.Thread2 thread2 = testThread.new Thread2();
      thread1.start();
      thread2.start();
   }

}