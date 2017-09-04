package com.zqh.pems.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 钟启辉
 * @description 支付工具表
 * @company www.jiweitech.com
 * @date 2017-08-31 13:30
 **/
public class PaymentTool implements Serializable {

    /**
     * 支付工具主键sn
     */
    private Long sn;

    /**
     * 支付工具的名称，如：微信，支付宝
     */
    private String paymentName;

    /**
     * 状态，0系统默认；1用户添加
     */
    private Byte status;

    /**
     * 插入时间
     */
    private Date insertTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 支付工具说明
     */
    private String note;

    public Long getSn() {
        return sn;
    }

    public void setSn(Long sn) {
        this.sn = sn;
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "PaymentTool{" +
                "sn=" + sn +
                ", paymentName='" + paymentName + '\'' +
                ", status=" + status +
                ", insertTime=" + insertTime +
                ", updateTime=" + updateTime +
                ", note='" + note + '\'' +
                '}';
    }
}
