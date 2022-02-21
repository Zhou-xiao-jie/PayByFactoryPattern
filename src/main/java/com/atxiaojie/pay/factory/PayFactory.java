package com.atxiaojie.pay.factory;

import com.atxiaojie.pay.paychannel.PayChannel;

public enum PayFactory {

    INSTANCE;

    /**
     * @MethodsName: getPayChannel
     * @Description 利用反射创建对象
     * @Author zhouxiaojie
     * @Date 19:56 2022/2/18
     * @Param [clazz]
     * @return T
     **/
    public <T extends PayChannel> T getPayChannel(Class<? extends T> clazz){
        T t = null;
        try {
            t = (T) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return t;
    }
}
