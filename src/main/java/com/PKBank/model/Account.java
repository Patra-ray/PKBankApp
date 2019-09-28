package com.PKBank.model;

public class Account {
    private long accountId;
    private String accountName;
    private long accountNumber;

    public Account(long accountId, String accountName, long accountNumber) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", accountName='" + accountName + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }
}