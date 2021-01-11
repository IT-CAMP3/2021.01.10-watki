package pl.camp.it.watki.notify;

public class Receiver implements Runnable {
    @Override
    public void run() {
        try {
            synchronized (Main.lock) {
                System.out.println("Odbieracz czeka !!");

                while(!Main.notifyFlag) {
                    Main.lock.wait();
                }
                System.out.println("Odebrałem wiadomość !!");
                System.out.println(Main.message);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
