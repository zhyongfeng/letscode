package com.thread;

/**
 * @Author: yfzhang
 * @Description:
 * @Date: Created in 8:31 AM 2020/5/25
 * @Modified By:
 */
public class UnsafedBuyTicket {

    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();
        new Thread(buyTicket, "11").start();
        new Thread(buyTicket, "22").start();
        new Thread(buyTicket, "33").start();

    }

}

class BuyTicket implements Runnable {

    private int ticketNumber = 10;

    boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            try {
                buyTicket();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private void buyTicket() throws InterruptedException {
        if (ticketNumber <= 0) {
            this.flag = false;
            return;
        }
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " get " + ticketNumber--);
    }
}
