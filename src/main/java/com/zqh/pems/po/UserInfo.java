package com.zqh.pems.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 钟启辉
 * @description 用户信息表
 * @company www.jiweitech.com
 * @date 2017-08-31 11:40
 **/
public class UserInfo implements Serializable {

    /**
     * 主键sn
     */
    private Long sn;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * 用户状态：0正常；1禁用；2锁定
     */
    private Byte status;

    /**
     * 用户插入时间
     */
    private Date insertTime;

    /**
     * 用户修改时间
     */
    private Date updateTime;

    public Long getSn() {
        return sn;
    }

    public void setSn(Long sn) {
        this.sn = sn;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @Override
    public String toString() {
        return "UserInfo{" +
                "sn=" + sn +
                ", realName='" + realName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", insertTime=" + insertTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
