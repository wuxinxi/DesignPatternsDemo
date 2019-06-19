package com.wxx.design.design_02_builder;

/**
 * @author TangRen
 * @create 2019-06-19 21:54
 * @TODO: builder模式
 * 适用于：相同的方法，不同的执行顺序产生不同的结果；对象比较复杂，存在可选并且有默认值的属性参数
 */
public class FTPParams {
    /**
     * IP
     */
    private String ip;
    /**
     * 端口
     */
    private int port;
    /**
     * 服务器文件路径
     */
    private String servicePath;
    /**
     * 文件本地保存路径
     */
    private String localPath;
    /**
     * 是否是主动模式
     */
    private boolean isMainModel;
    /**
     * 下载重试次数
     */
    private int retryCnt;

    static class Builder {
        private String ip;
        private int port = 20;
        private String localPath;
        private String servicePath = "/";
        private boolean isMainModel = true;
        private int retryCnt = 0;

        public Builder(String ip, String localPath) {
            this.ip = ip;
            this.localPath = localPath;
        }

        public Builder setServicePath(String servicePath) {
            this.servicePath = servicePath;
            return this;
        }

        public Builder setPort(int port) {
            this.port = port;
            return this;
        }

        public Builder setMainModel(boolean mainModel) {
            isMainModel = mainModel;
            return this;
        }

        public Builder setRetryCnt(int retryCnt) {
            this.retryCnt = retryCnt;
            return this;
        }

        public FTPParams build() {
            return new FTPParams(this);
        }

    }

    private FTPParams(Builder builder) {
        ip = builder.ip;
        port = builder.port;
        localPath = builder.localPath;
        servicePath = builder.servicePath;
        isMainModel = builder.isMainModel;
        retryCnt = builder.retryCnt;
    }

    @Override
    public String toString() {
        return "FTPParams{" +
                "ip='" + ip + '\'' +
                ", port=" + port +
                ", servicePath='" + servicePath + '\'' +
                ", localPath='" + localPath + '\'' +
                ", isMainModel=" + isMainModel +
                ", retryCnt=" + retryCnt +
                '}';
    }
}
