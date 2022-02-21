package com.atxiaojie.pay.paychannel;

/**
 * @ClassName: AliyPay
 * @Description: 支付宝支付
 * @author: zhouxiaojie
 * @date: 2022/2/18 19:36
 * @Version: V1.0.0
 */
public class AliyPay extends PayChannel {
    @Override
    public void pay(String price) {
        System.out.println("调起支付宝SDK，价格：" + price);
    }
}
