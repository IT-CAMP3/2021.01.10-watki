package pl.camp.it.watki;

public class LepszyWatek implements Runnable {

    int threadNumber;

    LepszyWatek(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10000; i++) {
            System.out.println("Wątek " + this.threadNumber + " liczba: " + i);
        }
    }
}
