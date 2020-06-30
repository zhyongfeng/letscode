package com.thread;

/**
 * @Author: yfzhang
 * @Description: 写一个类实现Runnable接口，实现run方法。用new Thread(Runnable target).start()方法来启动
 * @Date: Created in 9:17 AM 2020/5/21
 * @Modified By:
 */
public class ThreadTest2 implements Runnable {

    private String url;
    private String name;

    public ThreadTest2(String url, String name){
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownloader downloader = new WebDownloader();
        downloader.download(url,name);
        System.out.println("downloaded " + name);
    }

    public static void main(String[] args) {
        ThreadTest2 threadTest2 = new ThreadTest2("","");
        new Thread(threadTest2).start();

    }
}

class WebDownloader{

    public void download(String url, String name){
        System.out.println("downloader -- " + name);

    }
}
