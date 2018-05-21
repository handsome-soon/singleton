package com.homework.singletom.lazy;

/**
 * Created by 15995 on 2018/5/21.
 */
public class Lazy4 {

    private Lazy4(){};

    //内部类实现（在访问外部类的时候需要先初始化内部类）
    public static Lazy4 getLazy(){
        return Inner.lazy4;
    }

     static class Inner{
        private static Lazy4  lazy4 = new Lazy4();
    }


}
