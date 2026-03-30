package com.app.vo;

import java.util.Objects;

public class OrderVO {
   private Long id;
   private Integer orderCount;
   private Long productId;
   private Long MemberId;
   
   public OrderVO() {;}

   public OrderVO(Long id, Integer orderCount, Long productId, Long memberId) {
      super();
      this.id = id;
      this.orderCount = orderCount;
      this.productId = productId;
      MemberId = memberId;
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
      return MemberId;
   }

   public void setMemberId(Long memberId) {
      MemberId = memberId;
   }

   @Override
   public String toString() {
      return "OrderVO [id=" + id + ", orderCount=" + orderCount + ", productId=" + productId + ", MemberId="
            + MemberId + "]";
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
      OrderVO other = (OrderVO) obj;
      return Objects.equals(id, other.id);
   }
   
}