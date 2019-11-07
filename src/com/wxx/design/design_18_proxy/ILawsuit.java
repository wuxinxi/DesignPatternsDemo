package com.wxx.design.design_18_proxy;

/**
 * 作者：wuxinxi on 2019/11/1
 * 包名：com.wxx.design.design_18_proxy
 * TODO:诉讼接口
 */
interface ILawsuit {
    /**
     * 提出诉讼
     */
    void submit();

    /**
     * 进行举证
     */
    void burden();

    /**
     * 开始辩护
     */
    void defend();

    /**
     * 结束
     * @param isSuccess 诉讼是否胜利
     */
    void finish(boolean isSuccess);
}
