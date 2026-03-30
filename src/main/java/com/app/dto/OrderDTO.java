package com.app.dto;

import java.util.Objects;

public class OrderDTO {
	private Long id;
	private Integer orderCount;
	private Long productId;
	private Long memberId;
	private Integer totalPrice;
	private String memberEmail;
	private String memberName;
	private String productName;
	private Integer productprice;
	private Integer productstock;
	
	public OrderDTO() {;}

	public OrderDTO(Long id, Integer orderCount, Long productId, Long memberId, Integer totalPrice, String memberEmail,
			String memberName, String productName, Integer productprice, Integer productstock) {
		super();
		this.id = id;
		this.orderCount = orderCount;
		this.productId = productId;
		this.memberId = memberId;
		this.totalPrice = totalPrice;
		this.memberEmail = memberEmail;
		this.memberName = memberName;
		this.productName = productName;
		this.productprice = productprice;
		this.productstock = productstock;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(Integer orderCount) {
		this.orderCount = orderCount;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Integer getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductprice() {
		return productprice;
	}

	public void setProductprice(Integer productprice) {
		this.productprice = productprice;
	}

	public Integer getProductstock() {
		return productstock;
	}

	public void setProductstock(Integer productstock) {
		this.productstock = productstock;
	}

	@Override
	public String toString() {
		return "OrderDTO [id=" + id + ", orderCount=" + orderCount + ", productId=" + productId + ", memberId="
				+ memberId + ", totalPrice=" + totalPrice + ", memberEmail=" + memberEmail + ", memberName="
				+ memberName + ", productName=" + productName + ", productprice=" + productprice + ", productstock="
				+ productstock + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderDTO other = (OrderDTO) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
