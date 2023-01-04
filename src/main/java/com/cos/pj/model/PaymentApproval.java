package com.cos.pj.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//2. 결재승인요청vo -> 결재승인요청할 때 담아서 보냄.

@Getter
@Setter
@ToString
public class PaymentApproval {
	private String aid;
	private String tid;
	private String cid;
	private String sid;
	private String partner_order_id;
	private String partner_user_id;
	private String payment_method_type;
	private String item_name;
	private String item_code;
	private int quantity;
	private String created_at;
	private String approved_at;
	private String payload;
	private PaymentAmount paymentAmount;

}
