package com.atxiaojie.pay.paychannel;

/**
 * @ClassName: WechatPay
 * @Description: 微信支付
 * @author: zhouxiaojie
 * @date: 2022/2/18 19:39
 * @Version: V1.0.0
 */
public class WechatPay extends PayChannel {
    @Override
    public void pay(String price) {
        System.out.println("调起微信SDK，价格：" + price);
    }
}
