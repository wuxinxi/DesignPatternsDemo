package com.wxx.design.design_18_proxy;

/**
 * 作者：wuxinxi on 2019/11/1
 * 包名：com.wxx.design.design_18_proxy
 * TODO:律师
 */
class Lawyer implements ILawsuit {
    private ILawsuit lawsuit;

    public Lawyer(ILawsuit lawsuit) {
        this.lawsuit = lawsuit;
    }

    @Override
    public void submit() {
        lawsuit.submit();
    }

    @Override
    public void burden() {
        lawsuit.burden();
    }

    @Override
    public void defend() {
        lawsuit.defend();
    }

    @Override
    public void finish(boolean isSuccess) {
        lawsuit.finish(isSuccess);
    }
}
