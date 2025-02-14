package com.zanol.desafio.entities;

public class Order {

	private Integer code;
	private Double basic;
	private Double discount;
	
	public Order() {
		
	}
	
	public Order(Integer code, Double basic, Double discount) {
		this.code = code;
		this.basic = basic;
		this.discount = discount;
	}
	
	public void setCode(Integer code) {
		this.code = code;
	}
	
	public Integer getCode() {
		return code;
	}
	
	public void setBasic(Double basic) {
		this.basic = basic;
	}
	
	public Double getBasic() {
		return basic;
	}
	
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	
	public Double getDiscount() {
		return discount;
	}
	
}
