package com.wjj.reggie.common;
//用于保存和获取当前用户登录的id
public class BaseContext {
    private static ThreadLocal<Long> threadLocal=new ThreadLocal<>();
    //设置id
    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }
    //获取id
    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
