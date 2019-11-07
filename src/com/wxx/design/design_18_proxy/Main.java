package com.wxx.design.design_18_proxy;

import java.lang.reflect.Proxy;

/**
 * 作者：wuxinxi on 2019/11/1
 * 包名：com.wxx.design.design_18_proxy
 * TODO:一句话描述
 */
class Main {
    public static void main(String[] args) {
        TangRen tangRen = new TangRen();
        //静态代理
        Lawyer lawyer = new Lawyer(tangRen);
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish(true);

        DynamicProxy<TangRen> dynamicProxy = new DynamicProxy<>(tangRen);
        ClassLoader loader = tangRen.getClass().getClassLoader();
        ILawsuit iLawsuit = (ILawsuit) Proxy.newProxyInstance(loader, new Class[]{ILawsuit.class}, dynamicProxy);
        iLawsuit.submit();
        iLawsuit.burden();
        iLawsuit.defend();
        iLawsuit.finish(true);
    }
}
