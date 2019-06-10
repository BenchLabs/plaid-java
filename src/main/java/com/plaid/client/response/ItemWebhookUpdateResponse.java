package com.plaid.client.response;

/**
 * Response from /item/webhook/update endpoint.
 */
public final class ItemWebhookUpdateResponse extends BaseResponse {
  private Item item;

  public Item getItem() {
    return item;
  }
}
