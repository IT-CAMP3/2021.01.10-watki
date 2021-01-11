package pl.camp.it.watki;

public class Watek extends Thread {

    int threadNumber;

    Watek(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("Wątek " + this.threadNumber + " liczba: " + i);
        }
    }
}
