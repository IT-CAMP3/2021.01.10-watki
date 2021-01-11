package pl.camp.it.watki.notify;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static final Object lock = new Object();
    public static boolean notifyFlag = false;
    public static String message = "";

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(4);
        scheduledExecutorService.schedule(new Receiver(), 0, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Sender(), 10, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();
    }
}
