package com.cos.pj.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//3. 결재내역 vo -> 결재내역을 가져올 때 사용.

@Getter
@Setter
@ToString
public class PaymentAmount {
	private int total;
	private int tax_free;
	private int vat;
	private int point;
	private int discount;

}
