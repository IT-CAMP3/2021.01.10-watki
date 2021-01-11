package pl.camp.it.watki.join.test;

public class Main {

    public static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Incrementator i1 = new Incrementator(counter, 1);
        Incrementator i2 = new Incrementator(counter, 2);

        Thread t1 = new Thread(i1);
        Thread t2 = new Thread(i2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.i);
    }
}
