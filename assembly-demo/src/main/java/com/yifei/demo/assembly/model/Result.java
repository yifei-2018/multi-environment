package com.yifei.demo.assembly.model;

import java.io.Serializable;

/**
 * @author yifei
 * @date 2018/12/7
 */
public class Result implements Serializable {

    private static final long serialVersionUID = -4963266899668807475L;

    /**
     * 结果码
     */
    private String code;
    /**
     * 信息
     */
    private String msg;
    /**
     * 数据
     */
    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
