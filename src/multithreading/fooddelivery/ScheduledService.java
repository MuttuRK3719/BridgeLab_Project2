package multithreading.fooddelivery;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledService {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler= Executors.newScheduledThreadPool(1);
        Runnable run=()->{
            System.out.println("Thread is executed with time : "+System.currentTimeMillis());
        };
        scheduler.schedule(run,5 ,TimeUnit.SECONDS);//for wait 5 sec than execute
        scheduler.scheduleAtFixedRate(run,0,5,TimeUnit.SECONDS);//execute every 5 secs irrespective of thread completed
        scheduler.scheduleWithFixedDelay(run,0,5,TimeUnit.SECONDS);//execute every 5 secs After of thread completed
        try{
            Thread.sleep(20000);
        }catch (Exception e ){}
        scheduler.shutdown();

    }
}
