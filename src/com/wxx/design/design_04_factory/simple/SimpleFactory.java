package com.wxx.design.design_04_factory.simple;

/**
 * 作者: Tangren on 2019-07-24
 * 包名：com.wxx.design.design_04_factory.simple
 * 邮箱：996489865@qq.com
 * TODO:简单工厂类
 */

class SimpleFactory {
    /**
     * 简单工厂实现方式
     *
     * @param type 类型
     * @return 具体产品
     */
    public static IPay cratePay(String type) {
        switch (type) {
            case "ALI":
                new AliPay();
            case "WCHAR":
                return new WeChatPay();
            default:
                throw new RuntimeException(String.format("抱歉,暂不支持 %s 支付方式", type));
        }
    }

    /**
     *
     * @param type 类
     * @param <T>
     * @return
     */
    public static <T extends IPay> T createPay(Class<T> type) {
        IPay pay = null;
        try {
            pay = (IPay) Class.forName(type.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) pay;
    }
}
