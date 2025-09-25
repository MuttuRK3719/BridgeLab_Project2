package multithreading.singleton;

public class MainClass {
    public static void main(String[] args) {
        Singleton object = Singleton.getInstance();
        Thread thread1=new Thread(()->object.greeting());
        Thread thread2=new Thread(()->object.greeting());
        thread1.start();
        thread2.start();
    }
}
