package com.atxiaojie.pay.paychannel;

/**
 * @ClassName: PayChannel
 * @Description: 支付通道接口
 * @author: zhouxiaojie
 * @date: 2022/2/18 19:36
 * @Version: V1.0.0
 */
public abstract class PayChannel {
    public abstract void pay(String price);
}
