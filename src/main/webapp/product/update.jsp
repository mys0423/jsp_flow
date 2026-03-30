<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 수정 페이지</title>
</head>
<body>
	<h1>상품 수정</h1>
	<form action="/flow/update-ok.product" method="post">
		<input name="id" type="hidden" value="${product.id}">
		<div>
			<p>상품명</p>
			<input name="productName" placeholder="상품명을 입력하세요" value="${product.productName}">
		</div>
		<div>
			<p>상품 가격</p>
			<input name="productPrice" placeholder="상품 가격을 입력하세요" value="${product.productPrice}">
		</div>
		<div>
			<p>상품 재고</p>
			<input name="productStock" placeholder="상품 재고를 입력하세요" value="${product.productStock}">
		</div>
		<button>상품 수정</button>
	</form>
</body>
</html>