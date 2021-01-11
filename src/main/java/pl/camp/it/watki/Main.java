package pl.camp.it.watki;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService singleExecutor = Executors.newSingleThreadExecutor();

        /*singleExecutor.submit(new LepszyWatek(1));
        singleExecutor.submit(new LepszyWatek(2));
        singleExecutor.submit(new LepszyWatek(3));*/

        ExecutorService multiExecutor = Executors.newFixedThreadPool(3);
        /*multiExecutor.submit(new LepszyWatek(4));
        multiExecutor.submit(new LepszyWatek(5));
        multiExecutor.submit(new LepszyWatek(6));
        multiExecutor.submit(new LepszyWatek(7));
        multiExecutor.submit(new LepszyWatek(8));*/

        ScheduledExecutorService scheduledExecutor = Executors.newScheduledThreadPool(3);
        /*scheduledExecutor.schedule(new LepszyWatek(9), 2, TimeUnit.SECONDS);
        scheduledExecutor.schedule(new LepszyWatek(10), 2, TimeUnit.SECONDS);
        scheduledExecutor.schedule(new LepszyWatek(11), 0, TimeUnit.SECONDS);
        scheduledExecutor.schedule(new LepszyWatek(12), 0, TimeUnit.SECONDS);
        scheduledExecutor.schedule(new LepszyWatek(13), 1, TimeUnit.SECONDS);
        scheduledExecutor.schedule(new LepszyWatek(13), 1, TimeUnit.MINUTES);*/

        singleExecutor.shutdown();
        multiExecutor.shutdown();
        scheduledExecutor.shutdown();

        Watek w1 = new Watek(1);
        w1.start();
        System.out.println("Przed join !!");
        w1.join();

        System.out.println("Main !!");
    }
}
