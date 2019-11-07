package com.wxx.design.design_18_proxy;

/**
 * 作者：wuxinxi on 2019/11/1
 * 包名：com.wxx.design.design_18_proxy
 * TODO:诉讼者
 */
class TangRen implements ILawsuit{

    @Override
    public void submit() {
        System.out.println("我要开始打官司啦。。。");
    }

    @Override
    public void burden() {
        System.out.println("这是我的证据。。。");
    }

    @Override
    public void defend() {
        System.out.println("你还有啥好说的、、、");
    }

    @Override
    public void finish(boolean isSuccess) {
        System.out.println("胜利必然属于我？"+isSuccess);
    }
}
