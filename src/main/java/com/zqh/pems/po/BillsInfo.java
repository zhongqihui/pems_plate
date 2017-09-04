package com.zqh.pems.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 钟启辉
 * @description 账单表信息
 * @company www.jiweitech.com
 * @date 2017-08-31 11:51
 **/
public class BillsInfo implements Serializable {

    /**
     * 账单主键sn
     */
    private Long sn;

    /**
     * 账单id，唯一标识
     */
    private String billsId;

    /**
     * 账单归属用户sn
     */
    private Long userSn;

    /**
     * 账单的支付工具sn
     */
    private Long paymentSn;

    /**
     * 账单支付的方式，0表示支入，1表示支出
     */
    private Byte payMethod;

    /**
     * 账单金额
     */
    private Double amount;

    /**
     * 账单发生的地点
     */
    private String address;

    /**
     * 账单说明
     */
    private String note;

    /**
     *
     */
    private Date happenTime;

    /**
     * 账单插入时间
     */
    private Date insertTime;

    /**
     * 账单修改时间
     */
    private Date updateTime;

    public Long getSn() {
        return sn;
    }

    public void setSn(Long sn) {
        this.sn = sn;
    }

    public String getBillsId() {
        return billsId;
    }

    public void setBillsId(String billsId) {
        this.billsId = billsId;
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

    public Byte getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Byte payMethod) {
        this.payMethod = payMethod;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getHappenTime() {
        return happenTime;
    }

    public void setHappenTime(Date happenTime) {
        this.happenTime = happenTime;
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

    @Override
    public String toString() {
        return "BillsInfo{" +
                "sn=" + sn +
                ", billsId='" + billsId + '\'' +
                ", userSn=" + userSn +
                ", paymentSn=" + paymentSn +
                ", payMethod=" + payMethod +
                ", amount=" + amount +
                ", address='" + address + '\'' +
                ", note='" + note + '\'' +
                ", insertTime=" + insertTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
