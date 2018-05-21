package com.homework.singletom.register;

import org.springframework.ui.ConcurrentModel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by 15995 on 2018/5/21.
 */
public class BeanFactory {

    //利用java多线程并发相关类处理
    private  static Map<String,Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String name){
        if(ioc.containsKey(name)){
            return ioc.get(name);
        }
        Object obj=null;
        try {
            obj = Class.forName(name);
            ioc.put(name,obj);
            return  obj;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return  null;
        }
    }
}
