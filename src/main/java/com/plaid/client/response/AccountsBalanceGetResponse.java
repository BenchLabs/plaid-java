package com.plaid.client.response;

import java.util.List;

/**
 * Response for /accounts/balance/get api call.
 */
public final class AccountsBalanceGetResponse extends BaseResponse {
  private Item item;
  private List<Account> accounts;

  public Item getItem() {
    return item;
  }

  public List<Account> getAccounts() {
    if (accounts == null) {
      return null;
    }
    return accounts;
  }

}
