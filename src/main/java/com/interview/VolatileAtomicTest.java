package com.interview;

/**
 * @Author: yfzhang
 * @Description:
 * @Date: Created in 7:08 PM 2020/3/15
 * @Modified By:
 */
public class VolatileAtomicTest {
    private static volatile int num = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        increase();
                    }
                }
            });
            threads[i].start();
        }
        for (Thread t : threads
        ) {
            t.join();
        }
        System.out.println(num);
    }

    private static  void increase() {
        num++;
    }
}
