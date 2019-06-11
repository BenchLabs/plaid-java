package com.plaid.client.response;

public final class ItemStatusStatus {

  public static final class Transactions {
    private String lastFailedUpdate;
    private String lastSuccessfulUpdate;

    public String getLastFailedUpdate() {
      return lastFailedUpdate;
    }

    public String getLastSuccessfulUpdate() {
      return lastSuccessfulUpdate;
    }
  }

  private Transactions transactions;
  private String lastWebhook;

  public Transactions getTransactions() {
    return transactions;
  }

  public String getLastWebhook() {
    return lastWebhook;
  }
}
