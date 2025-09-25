package multithreading.singleton;

public class Singleton {
    private static Singleton object;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (object == null) {
            synchronized (Singleton.class) {
                if (object == null) {
                    object = new Singleton();
                }
            }
        }
        return object;
    }

    public void greeting() {
        System.out.println("Single object is created");
    }
}
