package com.sdu.mobilesale.model;

public class salerStaff {
    private Integer salerId;

    private String salerAccount;

    private String salerName;

    private String salerPassword;

    private Long salerPhone;

    private Integer areaId;

    public Integer getSalerId() {
        return salerId;
    }

    public void setSalerId(Integer salerId) {
        this.salerId = salerId;
    }

    public String getSalerAccount() {
        return salerAccount;
    }

    public void setSalerAccount(String salerAccount) {
        this.salerAccount = salerAccount == null ? null : salerAccount.trim();
    }

    public String getSalerName() {
        return salerName;
    }

    public void setSalerName(String salerName) {
        this.salerName = salerName == null ? null : salerName.trim();
    }

    public String getSalerPassword() {
        return salerPassword;
    }

    public void setSalerPassword(String salerPassword) {
        this.salerPassword = salerPassword == null ? null : salerPassword.trim();
    }

    public Long getSalerPhone() {
        return salerPhone;
    }

    public void setSalerPhone(Long salerPhone) {
        this.salerPhone = salerPhone;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }
}