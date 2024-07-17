<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>

<style>
	h1 {
		text-align: center;
		margin: 50px 0;
	}
	
	.table {
		max-width: 50%;
		margin-left: 50%;
		transform: translateX(-50%);
	}
	
	form {
		margin-top: 100px;
		margin-left: 50%;
		transform: translateX(-50%);
		max-width: 500px;
	}
	
	caption {
		caption-side: top;
		font-size: 20px;
		padding-left: 12px;
	}
</style>
<body>
	<h1>Trang chủ</h1>

	<table class="table">
		<caption>Menu</caption>
		<tr>
			<td><a href="${pageContext.request.contextPath}/home">Home</a></td>
		</tr>
		<tr>
			<td><a href="${pageContext.request.contextPath}/khaibao">Khai
					Báo Thông Tin Sinh Viên Tốt Nghiệp</a></td>
		</tr>
		<tr>
			<td><a href="${pageContext.request.contextPath}/findSinhVien">Tìm
					kiếm thông tin Sinh Viên</a></td>
		</tr>
		<tr>
			<td><a href="${pageContext.request.contextPath}/findTTTN">Tìm
					kiếm thông tin tốt nghiệp của sinh viên</a></td>
		</tr>
		<tr>
			<td><a href="${pageContext.request.contextPath}/">Đăng xuất</a></td>
		</tr>
	</table>

	<jsp:include page="_footer.jsp"></jsp:include>
</body>
</html>