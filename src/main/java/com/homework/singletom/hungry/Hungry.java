package com.homework.singletom.hungry;

/**
 * Created by 15995 on 2018/5/21.
 */
public class Hungry {

    private Hungry(){};

    private static Hungry hungry = new Hungry();

    public static Hungry getHungry(){
        return  hungry;
    }
}
