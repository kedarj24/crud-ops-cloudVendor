package com.rest.api.crud_ops.model;


public class CloudVendor {

    private String vedorId;
    private String vedorName;
    private String vedorAddress;
    private String vedorPhone;

    public String getVedorId() {
        return vedorId;
    }

    public void setVedorId(String vedorId) {
        this.vedorId = vedorId;
    }

    public String getVedorName() {
        return vedorName;
    }

    public void setVedorName(String vedorName) {
        this.vedorName = vedorName;
    }

    public String getVedorAddress() {
        return vedorAddress;
    }

    public void setVedorAddress(String vedorAddress) {
        this.vedorAddress = vedorAddress;
    }

    public String getVedorPhone() {
        return vedorPhone;
    }

    public void setVedorPhone(String vedorPhone) {
        this.vedorPhone = vedorPhone;
    }

    public CloudVendor() {
    }

    public CloudVendor(String vedorId, String vedorName, String vedorAddress, String vedorPhone) {
        this.vedorId = vedorId;
        this.vedorName = vedorName;
        this.vedorAddress = vedorAddress;
        this.vedorPhone = vedorPhone;
    }
}
