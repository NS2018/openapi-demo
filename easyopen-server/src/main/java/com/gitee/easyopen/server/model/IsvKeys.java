package com.gitee.easyopen.server.model;


import java.util.Date;

public class IsvKeys {
    /**  数据库字段：id */
    private Long id;

    /**  数据库字段：app_key */
    private String appKey;

    /** 1:RSA2,2:MD5, 数据库字段：sign_type */
    private Byte signType;

    /** isv_info.sign_type=2时使用, 数据库字段：secret */
    private String secret;

    /** 秘钥格式，1：PKCS8(JAVA适用)，2：PKCS1(非JAVA适用), 数据库字段：key_format */
    private Byte keyFormat;

    /** 开发者生成的公钥, 数据库字段：public_key_isv */
    private String publicKeyIsv;

    /** 开发者生成的私钥（交给开发者）, 数据库字段：private_key_isv */
    private String privateKeyIsv;

    /** 平台生成的公钥（交给开发者）, 数据库字段：public_key_platform */
    private String publicKeyPlatform;

    /** 平台生成的私钥, 数据库字段：private_key_platform */
    private String privateKeyPlatform;

    /**  数据库字段：gmt_create */
    private Date gmtCreate;

    /**  数据库字段：gmt_modified */
    private Date gmtModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public Byte getSignType() {
        return signType;
    }

    public void setSignType(Byte signType) {
        this.signType = signType;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public Byte getKeyFormat() {
        return keyFormat;
    }

    public void setKeyFormat(Byte keyFormat) {
        this.keyFormat = keyFormat;
    }

    public String getPublicKeyIsv() {
        return publicKeyIsv;
    }

    public void setPublicKeyIsv(String publicKeyIsv) {
        this.publicKeyIsv = publicKeyIsv;
    }

    public String getPrivateKeyIsv() {
        return privateKeyIsv;
    }

    public void setPrivateKeyIsv(String privateKeyIsv) {
        this.privateKeyIsv = privateKeyIsv;
    }

    public String getPublicKeyPlatform() {
        return publicKeyPlatform;
    }

    public void setPublicKeyPlatform(String publicKeyPlatform) {
        this.publicKeyPlatform = publicKeyPlatform;
    }

    public String getPrivateKeyPlatform() {
        return privateKeyPlatform;
    }

    public void setPrivateKeyPlatform(String privateKeyPlatform) {
        this.privateKeyPlatform = privateKeyPlatform;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}