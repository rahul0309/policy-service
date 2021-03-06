package com.acc.training.policyservice.model;

public class Policy {

    private String policyId;
    private String policyType;
    private Customer customer;

    public Policy() {
    }

    public Policy(String policyId, String policyType, Customer customer) {
        this.policyId = policyId;
        this.policyType = policyType;
        this.customer = customer;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
