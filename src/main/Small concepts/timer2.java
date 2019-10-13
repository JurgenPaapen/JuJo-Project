import java.util.Timer;
import java.util.TimerTask;

class MyTask extends TimerTask {
    int counter;

    public MyTask() {
        counter = 0;
    }
    public void run() {
        counter++;
        System.out.println("Ring " + counter);
    }
    public int getCount() {
        return counter;
    }
}

class Main {
    private boolean running;
    private MyTask task;
    private Timer timer;
    public Main() {
        timer = new Timer(true);
    }

    public boolean isRinging() {
        return running;
    }

    public void startRinging() {
        running = true;
        task = new MyTask();
        timer.scheduleAtFixedRate(task, 0, 3000);
    }

    public void doIt() {
        running = false;
        System.out.println(task.getCount() + " times");
        task.cancel();
    }

    public static void main(String[] args) {
        Main phone = new Main();
        phone.startRinging();
        try {
            System.out.println("started running...");
            Thread.sleep(20000);
        } catch (InterruptedException e) {
        }
        phone.doIt();
    }
}
