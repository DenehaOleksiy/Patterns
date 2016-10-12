package Singleton;

/**
 * Created by Администратор on 12.10.2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException{
        Thread[] thread = new Thread[100];
        for (int i = 0; i < thread.length ; i++) {
            thread[i] = new Thread(new NewInstance());
            thread[i].start();
        }
        for (int i = 0; i <thread.length ; i++) {
            thread[i].join();
        }
        System.out.println(Singleton.countInstances);
    }
}
class NewInstance implements Runnable{
    public void run() {
        Singleton.getInstance();
    }
}

class Singleton{
    private static volatile Singleton instance;
    static int countInstances;

    private Singleton(){
        countInstances++;
    }
    public static Singleton getInstance(){
        if (instance == null)
            synchronized (Singleton.class){
                if (instance == null)
                    instance = new Singleton();
            }return instance;
    }
}
