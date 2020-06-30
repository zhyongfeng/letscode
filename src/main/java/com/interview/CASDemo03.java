package com.interview;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @Author: yfzhang
 * @Description:
 * @Date: Created in 5:48 PM 2020/3/24
 * @Modified By:
 */
public class CASDemo03 {

    //总访问量
    static volatile int count = 0;

    public static void request() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(5);
        //count++;
        int expectedCount;
        while (!compareAndSwap(expectedCount = getCount(), expectedCount + 1)){

        }

    }

    /**
     *
     * @param expectedCount 期望值count
     * @param newCount 需要给count赋值的新值
     * @return
     */
    public static synchronized boolean compareAndSwap(int expectedCount, int newCount) {
        if (getCount() == expectedCount) {
            count = newCount;
            return true;
        }
        return false;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        //模拟100个用户并发，每个用户访问10次
        int threadSize = 100;
        CountDownLatch countDownLatch = new CountDownLatch(threadSize);
        for (int i = 0; i < threadSize; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        for (int j = 0; j < 10; j++) {
                            request();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        countDownLatch.countDown();
                    }

                }
            });
            thread.start();
        }
        countDownLatch.await();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + ":" + count);
    }
}
