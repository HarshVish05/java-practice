package DeadlockDemo;

class DataInitializer{
    int initialVal;
    public void increase(){
        initialVal++;
    }
}

public class DeadLockDemo {
    public static void main(String[] args) {

        DataInitializer di = new DataInitializer();
        

        Runnable ch1 = () -> {
            for(int i =0;i<=10;i++) {
                // System.out.println("harsh");
                System.out.println(di.initialVal);
            
               di.increase();
            }
        };
        Runnable ch2 = () -> {
            for(int i =0;i<=10;i++) {
                di.increase();
            }
        };
        Thread t1 = new Thread(ch1);
        Thread t2 = new Thread(ch2);

        t1.start();
        // t2.start();
        System.out.println(di.initialVal);
    }
    
}
