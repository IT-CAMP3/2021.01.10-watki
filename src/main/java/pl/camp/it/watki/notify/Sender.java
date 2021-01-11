package pl.camp.it.watki.notify;

public class Sender implements Runnable {
    @Override
    public void run() {
        try {
            synchronized (Main.lock) {
                System.out.println("Wysyłacz coś robi !!");
                Thread.sleep(1000);
                System.out.println("Wysyłacz nadal cos robi !!");
                Thread.sleep(1000);
                System.out.println("Wysyłacz dalej robi !!");
                Thread.sleep(1000);
                System.out.println("Wysyłącz wysyła !!!!");
                Main.notifyFlag = true;
                Main.message = "Moja wiadomość do watku !!";
                Main.lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
