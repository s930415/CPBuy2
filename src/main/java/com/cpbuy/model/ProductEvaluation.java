package com.cpbuy.model;

//產品評論模型
public class ProductEvaluation {
	private float score; // 分數
	private String message; // 訊息
	private Integer member_id;// 會員流水號
	private Integer product_id;// 產品流水號

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getMember_id() {
		return member_id;
	}

	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}

	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

}
