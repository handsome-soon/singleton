package com.homework.singletom.lazy;

/**
 * Created by 15995 on 2018/5/21.
 */
public class Lazy2 {

    private Lazy2(){};

    private static Lazy2 lazy = null;

    //整个方法加锁
    public synchronized static Lazy2 getLazy(){
        if(null==lazy){
            return  new Lazy2();
        }
        return  lazy;
    }

}
