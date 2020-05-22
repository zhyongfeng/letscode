package com.thread;

/**
 * @Author: yfzhang
 * @Description:
 * @Date: Created in 9:01 PM 2020/5/22
 * @Modified By:
 */
public class ThreadTest3 implements Runnable {
    private int num = 10;

    @Override
    public void run() {
        while (true) {
            if (num <= 0) {
                break;
            }
            System.out.println(Thread.currentThread().getName() + "--> get ticket with number " + num--);

        }
    }

    public static void main(String[] args) {
        ThreadTest3 ticket = new ThreadTest3();

        new Thread(ticket,"x").start();
        new Thread(ticket,"y").start();
        new Thread(ticket,"z").start();
    }
}
