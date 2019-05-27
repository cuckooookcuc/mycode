package Practice;

class ThreadTest extends Thread {
    int i=0;
    @Override
    public void run() {
        for (; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + "**" + i);
        }
    }
}

public class FirstThread0315 {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + "==" + i);
            if (i == 20) {
                new ThreadTest().start();
                new ThreadTest().start();
            }
        }
    }
}
