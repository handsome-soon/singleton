package com.homework.singletom.lazy;

/**
 * Created by 15995 on 2018/5/21.
 */
public class Lazy1 {

    private Lazy1(){};

    private static Lazy1 lazy = null;

    //不加锁
    public static Lazy1 getLazy(){
        if(null==lazy){
            return  new Lazy1();
        }
        return  lazy;
    }

}
