package com.atxiaojie.pay.paychannel;

/**
 * @ClassName: UnionPay
 * @Description: 银联支付
 * @author: zhouxiaojie
 * @date: 2022/2/18 19:38
 * @Version: V1.0.0
 */
public class UnionPay extends PayChannel {
    @Override
    public void pay(String price) {
        System.out.println("调起银联SDK，价格：" + price);
    }
}
