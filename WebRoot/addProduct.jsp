<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>保存商品的页面</h1>

	<s:form action="product_save" method="post" namespace="/" theme="simple">
		<table>
			<tr>
				<td>商品名称</td>
				<td><s:textfield name="pname" /></td>
			</tr>
			<tr>
				<td>商品价格</td>
				<td><s:textfield name="price" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="提交" /></td>
			</tr>
		</table>

	</s:form>
</body>
</html>