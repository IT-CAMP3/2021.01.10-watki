package pl.camp.it.watki.join.test;

public class Incrementator implements Runnable {

    Counter counter;
    int threadNumber;

    Incrementator(Counter counter, int threadNumber) {
        this.counter = counter;
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            synchronized (Main.lock) {
                System.out.println("Watek: " + this.threadNumber);
                this.counter.i++;
            }
        }
    }
}
