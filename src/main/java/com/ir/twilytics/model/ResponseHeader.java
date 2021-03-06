
package com.ir.twilytics.model;

import org.springframework.stereotype.Service;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Service
public class ResponseHeader {

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("QTime")
    @Expose
    private Integer qTime;
    @SerializedName("params")
    @Expose
    private Params params;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getQTime() {
        return qTime;
    }

    public void setQTime(Integer qTime) {
        this.qTime = qTime;
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

}
