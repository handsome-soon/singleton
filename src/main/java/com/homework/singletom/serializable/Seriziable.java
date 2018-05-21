package com.homework.singletom.serializable;

import java.io.Serializable;

/**
 * Created by 15995 on 2018/5/21.
 */
public class Seriziable implements Serializable {

    public static final Seriziable SERIALIABLE = new Seriziable();

    private Seriziable(){}

    public static  Seriziable getInstance() {
        return SERIALIABLE;
    }

    public Object readSolve() {
        return SERIALIABLE;
    }


}
