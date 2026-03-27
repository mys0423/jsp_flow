<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table id="product-json" border=1>
      <tr>
         <th>상품번호</th>
         <th>상품명</th>
         <th>상품가격</th>
         <th>상품재고</th>
      </tr>
   </table>
</body>
<script type="text/javascript">
   const product = JSON.parse(`${productJSON}`)
   const table = document.querySelector("#product-json")
   
   table.innerHTML += (
      "<tr>" + 
         "<td> " + product.id + "</td>" +   
         "<td> " + product.productName + "</td>" +   
         "<td> " + product.productPrice + "</td>" +   
         "<td> " + product.productStock + "</td>" +   
      "</tr>"
   )
</script>
</html>