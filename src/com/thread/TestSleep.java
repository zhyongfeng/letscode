package com.thread;

import javax.sound.midi.Soundbank;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: yfzhang
 * @Description:
 * @Date: Created in 10:45 PM 2020/5/24
 * @Modified By:
 */
public class TestSleep {

    public static void main(String[] args) throws InterruptedException {
        Date date = new Date(System.currentTimeMillis());

        while (true){
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(date));
            Thread.sleep(1000);
            date = new Date(System.currentTimeMillis());

        }

//        try {
//            countdown(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    public static void countdown(int num) throws InterruptedException {
        while (true) {
            Thread.sleep(1000);
            System.out.println(num--);
            if (num <= 0) {
                break;
            }
        }
    }

}
