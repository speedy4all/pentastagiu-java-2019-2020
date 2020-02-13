package com.pentalog.pentastagiu.web.controller;

public class RequestParamBox {
    private String startsWith;
    private Integer intParam;

    public String getStartsWith() {
        return startsWith;
    }

    public RequestParamBox setStartsWith(String startsWith) {
        this.startsWith = startsWith;
        return this;
    }

    public Integer getIntParam() {
        return intParam;
    }

    public RequestParamBox setIntParam(Integer intParam) {
        this.intParam = intParam;
        return this;
    }
}
