package com.cos.pj.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//1. 결재요청 vo -> 결재요청할때 사용

@Getter
@Setter
@ToString
public class PaymentReady {
	private String tid;
	private String next_redirect_pc_url;
	private String partner_order_id;

}
