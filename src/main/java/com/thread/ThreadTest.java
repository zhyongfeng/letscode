package com.thread;

/**
 * @Author: yfzhang
 * @Description: 写一个类继承自Thread类，重写run方法。用start方法启动线程
 * @Date: Created in 8:48 AM 2020/5/21
 * @Modified By:
 */
public class ThreadTest extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("I'm running in ThreadTest -- " + i);
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 2000; i++) {
            System.out.println("I'm running in main thread -- " + i);
        }

        ThreadTest t = new ThreadTest();
        t.start();

    }
}
