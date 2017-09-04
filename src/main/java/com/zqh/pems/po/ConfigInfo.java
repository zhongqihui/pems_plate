package com.zqh.pems.po;

import java.io.Serializable;

/**
 * @author 钟启辉
 * @description 配置信息表
 * @company www.jiweitech.com
 * @date 2017-08-31 13:27
 **/
public class ConfigInfo implements Serializable {

    /**
     * 配置表主键sn
     */
    private Long sn;

    /**
     * 用户信息表主键sn
     */
    private Long userSn;

    /**
     * 支付方式sns，中间用"," 隔开
     */
    private Long paymentSns;

    public Long getSn() {
        return sn;
    }

    public void setSn(Long sn) {
        this.sn = sn;
    }

    public Long getUserSn() {
        return userSn;
    }

    public void setUserSn(Long userSn) {
        this.userSn = userSn;
    }

    public Long getPaymentSns() {
        return paymentSns;
    }

    public void setPaymentSns(Long paymentSns) {
        this.paymentSns = paymentSns;
    }

    @Override
    public String toString() {
        return "ConfigInfo{" +
                "sn=" + sn +
                ", userSn=" + userSn +
                ", paymentSns=" + paymentSns +
                '}';
    }
}
