package com.wxx.design.design_04_factory.simple;

/**
 * 作者: Tangren on 2019-07-24
 * 包名：com.wxx.design.design_04_factory.simple
 * 邮箱：996489865@qq.com
 * TODO:微信支付
 */

class WeChatPay implements IPay {
    @Override
    public void pay(int amount) {
        System.out.println(String.format("通过微信支付了%d元", amount));
    }
}
