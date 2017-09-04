package com.zqh.pems.po;

import java.io.Serializable;

/**
 * @author 钟启辉
 * @description 资产信息表
 * @company www.jiweitech.com
 * @date 2017-08-31 11:47
 **/
public class AssetsInfo implements Serializable {

    /**
     * 主键sn
     */
    private Long sn;

    /**
     * 用户信息表的主键sn
     */
    private Long userSn;

    /**
     * 支付工具的主键sn
     */
    private Long paymentSn;

    /**
     * 支付工具中的剩余资产
     */
    private Double money;

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

    public Long getPaymentSn() {
        return paymentSn;
    }

    public void setPaymentSn(Long paymentSn) {
        this.paymentSn = paymentSn;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "AssetsInfo{" +
                "sn=" + sn +
                ", userSn=" + userSn +
                ", paymentSn=" + paymentSn +
                ", money=" + money +
                '}';
    }
}
