package annotation.multithread;

import java.util.concurrent.Callable;

/**
 * @Author: yfzhang
 * @Description:
 * @Date: Created in 7:19 PM 2020/7/3
 * @Modified By:
 */
public class ThreadTest1 extends Thread {
}

class demo1 implements Runnable{

    @Override
    public void run() {
    }
}

class demo2 implements Callable<String>{

    @Override
    public String call() throws Exception {
        return null;
    }
}