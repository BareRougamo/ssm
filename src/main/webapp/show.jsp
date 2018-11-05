<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品列表</title>
</head>
<body>

	<div align="center">
		<table border="1" cellspacing="0">
			<caption>商品列表</caption>
			<tbody>
				<tr>
					<td>商品编号</td>
					<td>商品名称</td>
					<td>商品类型</td>
					<td>商品价格</td>
					<td>剩余数量</td>
				</tr>
				<c:forEach items="${goods }" var="good">
					<tr>
						<td>${good.goods_id }</td>
						<td>${good.goods_name }</td>
						<td>${good.goods_type }</td>
						<td>${good.goods_price }</td>
						<td>${good.goods_count }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<p>一共${page.pages}页</p>
		<a href="goods.do?page=${page.firstPage}">第一页</a> <a
			href="goods.do?page=${page.nextPage}">下一页</a> <a
			href="goods.do?page=${page.prePage}">上一页</a> <a
			href="goods.do?page=${page.lastPage}">最后页</a>
	</div>
</body>
</html>