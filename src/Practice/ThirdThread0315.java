package Practice;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class ThirdThreads0315 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int i = 0;
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "***" + i);
        }
        return i;
    }
}

public class ThirdThread0315 {
    public static void main(String[] args) throws Exception{
        ThirdThreads0315 tt = new ThirdThreads0315();
        FutureTask<Integer> ft = new FutureTask<>(tt);
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "==" + i);
            if (i == 20) {
                new Thread(ft, "第二线程");
                new Thread(ft, "第三线程");
            }
        }
        System.out.println(ft.get());
    }
}
