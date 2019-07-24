package com.wxx.design.design_02_builder;

/**
 * @author TangRen
 * @create 2019-06-19 22:03
 * @TODO: 测试主函数
 */
public class Main {
    public static void main(String[] args) {
        FTPParams params = new FTPParams.Builder("192.168.0.1", "sdcard/apk")
                .setServicePath("/bus")
                .setRetryCnt(3).build();
        System.out.println("params = " + params);
    }
}
