package com.atxiaojie.pay.test;

import com.atxiaojie.pay.paychannel.AliyPay;
import com.atxiaojie.pay.factory.PayFactory;

/**
 * @ClassName: Test
 * @Description: 测试类，利用工厂模式去整合很多种支付模式，并且利用反射创建对象
 * 利用了两种设计模式，工厂模式和单例模式
 * @author: zhouxiaojie
 * @date: 2022/2/18 19:52
 * @Version: V1.0.0
 */
public class Test {
    public static void main(String[] args) {
        AliyPay payChannel = PayFactory.INSTANCE.getPayChannel(AliyPay.class);
        payChannel.pay("200元");
    }
}
