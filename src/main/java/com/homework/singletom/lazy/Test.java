package com.homework.singletom.lazy;

import java.util.concurrent.CountDownLatch;

/**
 * Created by 15995 on 2018/5/21.
 */
public class Test {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int count = 200;

        final CountDownLatch latch = new CountDownLatch(count);

        for (int i=0;i<count;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //所有子线程等待
                        // 当count=0的时候万箭齐发
                        latch.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Lazy2 objects = Lazy2.getLazy();
                    System.out.println(Thread.currentThread()+":"+objects);
                }
            });
            latch.countDown();
        }
        System.out.println("总耗时："+(System.currentTimeMillis()-start));



    }


}
