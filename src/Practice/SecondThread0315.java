package Practice;

class SecondThreads0315 implements Runnable {
    private int i;
    @Override
    public void run() {
//        for (; i < 10; i++) {
//            System.out.println(Thread.currentThread().getName() + "==" + i);
//        }
        for (; i < 25; i++) {
            System.out.println(Thread.currentThread().getName() + "--" + i);
        }
    }
}

public class SecondThread0315 {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + "**" + i);
            if (i == 10) {
                SecondThreads0315 secondTh = new SecondThreads0315();
                new Thread(secondTh, "第二线").start();
                new Thread(secondTh,"第三线").start();
            }
        }
    }
}
