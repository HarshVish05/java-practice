package ThreadDemo;

/* 
class Thread1 implements Runnable{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Thread one");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
*/
class Thread2 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread two");

        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}

public class threading {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Runnable r1 = () -> {
            for(int i=0;i<5;i++){       
                System.out.println("Thread one");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            
        };
        Thread2 th2 = new Thread2();

        Thread t1 = new Thread(r1);
      Thread t2 = new Thread(th2);

      t1.start();
      t2.start();

    /*
     * Thread1 th1 = new Thread1();
     * Thread2 th2 = new Thread2();
     * 
     * // Because we have implemented runnable we have to create thread objects
     * Thread t1 = new Thread(th1);
     * Thread t2 = new Thread(th2);
     * 
     * // th2.setPriority(Thread.MAX_PRIORITY);
     * // System.out.println(th2.getPriority());
     * t1.start();
     * // th1.interrupt();
     * t2.start();
     */
}

}
