package com.wxx.design.design_04_factory.simple;

/**
 * 作者: Tangren on 2019-07-24
 * 包名：com.wxx.design.design_04_factory.simple
 * 邮箱：996489865@qq.com
 * TODO:一句话描述
 */

class Client {
    public static void main(String[] args) {
        IPay wchar = SimpleFactory.cratePay("WCHAR");
        wchar.pay(10);

        IPay ali = SimpleFactory.cratePay("ALI");
        ali.pay(10);

        IPay error = SimpleFactory.cratePay("error");
        error.pay(10);


    }
}
