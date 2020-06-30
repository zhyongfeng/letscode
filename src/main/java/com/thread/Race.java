package com.thread;

/**
 * @Author: yfzhang
 * @Description: 龟兔赛跑
 * @Date: Created in 9:15 PM 2020/5/22
 * @Modified By:
 */
public class Race implements Runnable {

    public static String winner = null;

    public static void main(String[] args) {
        Race race = new Race();
        new Thread(race, "兔子").start();
        new Thread(race, "乌龟").start();

    }

    public boolean gameover(int steps) {
        if (null != winner) {
            return true;
        }
        if (steps >= 100) {
            winner = Thread.currentThread().getName();
            System.out.println("winner is " + winner);
            return true;
        }
        return false;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            //模拟兔子睡觉
            if (Thread.currentThread().getName().equals("兔子") && i % 10 == 0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (gameover(i)) {
                break;
            }
            System.out.println(Thread.currentThread().getName() + "runs " + i + " steps");
        }

    }
}
