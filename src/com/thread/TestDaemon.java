package com.thread;

/**
 * @Author: yfzhang
 * @Description:
 * @Date: Created in 8:11 AM 2020/5/25
 * @Modified By:
 */
public class TestDaemon {
    public static void main(String[] args) {
        God god = new God();
        You you = new You();

        Thread tGod = new Thread(god);
        //daemon thread is going to stop when the user thread has been done.
        tGod.setDaemon(true);
        tGod.start();

        new Thread(you).start();
    }

}

class You implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 36; i++) {
            System.out.println("You");
        }
    }
}

class God implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("God");
        }
    }
}
