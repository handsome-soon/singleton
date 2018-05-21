package com.homework.singletom.lazy;

/**
 * Created by 15995 on 2018/5/21.
 */
public class Lazy3 {

    private Lazy3(){};

    private static Lazy3 lazy = null;

    //双重锁
    public static Lazy3 getLazy(){
        if(null==lazy){
            synchronized (Lazy3.class){
                if(null == lazy){
                    return  new Lazy3();
                }
            }
        }
        return  lazy;
    }

}
