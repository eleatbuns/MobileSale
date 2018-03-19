package com.sdu.mobilesale.model;

public class SellerStaff {
    private Integer sellerId;

    private String sellerAccount;

    private String sellerName;

    private String sellerPassword;

    private Long sellerPhone;

    private Integer areaId;

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerAccount() {
        return sellerAccount;
    }

    public void setSellerAccount(String sellerAccount) {
        this.sellerAccount = sellerAccount == null ? null : sellerAccount.trim();
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    public String getSellerPassword() {
        return sellerPassword;
    }

    public void setSellerPassword(String sellerPassword) {
        this.sellerPassword = sellerPassword == null ? null : sellerPassword.trim();
    }

    public Long getSellerPhone() {
        return sellerPhone;
    }

    public void setSellerPhone(Long sellerPhone) {
        this.sellerPhone = sellerPhone;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }
}