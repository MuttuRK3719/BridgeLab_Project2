package multithreading.threadvsprocess;

public class HeavyTasks {
    public static void preparingManu() throws InterruptedException{
        System.out.println("Preparing menu ");
        Thread.sleep(3000);
        System.out.println("Menu is prepared ");
    }
    public static  void calculatingDisconts() throws InterruptedException{
        System.out.println("Calculating the disconts");
        Thread.sleep(3000);
        System.out.println("U can is the Disconts");
    }
}
