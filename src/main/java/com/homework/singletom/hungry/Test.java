package com.homework.singletom.hungry;

import com.homework.singletom.lazy.Lazy1;
import org.springframework.context.annotation.Lazy;

import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/**
 * Created by 15995 on 2018/5/21.
 */
public class Test {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int count = 200;

        final CountDownLatch latch = new CountDownLatch(100);

        for (int i=0;i<count;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        latch.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Hungry objects = Hungry.getHungry();
                    System.out.println(System.currentTimeMillis()+":"+objects);
//                    latch.countDown();
                }
            });
            latch.countDown();
        }
        System.out.println("总耗时："+(System.currentTimeMillis()-start));



    }


}
