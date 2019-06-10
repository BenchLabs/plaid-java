package com.plaid.client.response;

import java.util.List;

public final class AccountsGetResponse extends BaseResponse {
  private Item item;
  private List<Account> accounts;

  public Item getItem() {
    return item;
  }

  public List<Account> getAccounts() {
    return accounts;
  }

}
