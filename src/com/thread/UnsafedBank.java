package com.thread;

import org.omg.PortableServer.THREAD_POLICY_ID;

import static java.lang.Thread.*;

/**
 * @Author: yfzhang
 * @Description:不安全的取钱
 * @Date: Created in 8:56 AM 2020/5/25
 * @Modified By:
 */
public class UnsafedBank {

    public static void main(String[] args) {
        Account account = new Account(120, "工行");
        Drawing you = new Drawing(account, 50, "You");
        Drawing wife = new Drawing(account, 100, "Wife");
        you.start();
        wife.start();
    }
}

//账户
class Account {
    int money;
    String name;

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}

//取钱
class Drawing extends Thread {

    Account account;
    int drawingMoney;
    int nowMoney;

    Drawing(Account account, int drawingMoney, String name) {
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    @Override
    public void run() {
        if (account.money - drawingMoney <= 0) {
            System.out.println(this.getName() + " cannot draw because the money is not enough");
            return;
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        account.money = account.money - drawingMoney;
        nowMoney = nowMoney + drawingMoney;
        System.out.println(account.name + " left " + account.money);
        System.out.println(this.getName() + " has " + nowMoney);
    }
}

