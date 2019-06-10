package com.plaid.client.response;

public final class ItemGetResponse extends BaseResponse {
  private Item item;
  private ItemStatus status;

  public Item getItem() {
    return item;
  }

  public ItemStatus getStatus() {
    return status;
  }
}
