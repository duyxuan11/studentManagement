<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tìm kiếm thông tin sinh viên</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<style>
	form {
		margin-left: 50%;
		transform: translateX(-50%);
		max-width: 1000px;
	}
	
	.table {
		margin-left: 50%;
		transform: translateX(-50%);
		max-width: 1000px;
	}
	
	h1 {
		text-align: center;
	}
	
	h3 {
		text-align: center;
		margin-top: 16px;
	}
	
	p {
		color: red;
		text-align: center;
	}
	
	.input-group-text {
		min-width: 150px;
	}
	
	.input-group {
		margin: 8px 0;
	}
	
	.mgin {
		margin: 0 4px;
	}
	
	.center1 {
		text-align: center;
	}
</style>
<body>
	<jsp:include page="_menu.jsp"></jsp:include>
	<h1>Tìm kiếm thông tin sinh viên</h1>
	<p>${errorString}</p>
	<form method="POST"
		action="${pageContext.request.contextPath}/findSinhVien"
		accept-charset="UTF-8">
		<div class="input-group input-group-lg">
			<div class="input-group-prepend">
				<span class="input-group-text" id="inputGroup-sizing-lg">Số
					CMND</span>
			</div>
			<input name="soCMND" value="${sinhVien.soCMND}" type="text"
				class="form-control" aria-label="Large"
				aria-describedby="inputGroup-sizing-sm">
		</div>

		<div class="input-group input-group-lg">
			<div class="input-group-prepend">
				<span class="input-group-text" id="inputGroup-sizing-lg">Họ
					Tên</span>
			</div>
			<input name="hoTen" value="${sinhVien.hoTen}" type="text"
				class="form-control" aria-label="Large"
				aria-describedby="inputGroup-sizing-sm">
		</div>

		<div class="input-group input-group-lg">
			<div class="input-group-prepend">
				<span class="input-group-text" id="inputGroup-sizing-lg">Email</span>
			</div>
			<input name="email" value="${sinhVien.email}" type="email"
				class="form-control" aria-label="Large"
				aria-describedby="inputGroup-sizing-sm">
		</div>

		<div class="input-group input-group-lg">
			<div class="input-group-prepend">
				<span class="input-group-text" id="inputGroup-sizing-lg">Số
					điện thoại</span>
			</div>
			<input name="soDT" value="${sinhVien.soDT}" type="text"
				class="form-control" aria-label="Large"
				aria-describedby="inputGroup-sizing-sm">
		</div>

		<div class="input-group input-group-lg">
			<div class="input-group-prepend">
				<span class="input-group-text" id="inputGroup-sizing-lg">Địa
					chỉ</span>
			</div>
			<input name="diaChi" value="${sinhVien.diaChi}" type="text"
				class="form-control" aria-label="Large"
				aria-describedby="inputGroup-sizing-sm">
		</div>

		<div class = "center1">
			<button type="submit" class="btn btn-primary btn-lg">Tìm kiếm</button>
			<span class="mgin"> </span> <a href="findSinhVien"
			class="btn btn-secondary btn-lg active" role="button"
			aria-pressed="true">Hủy</a>
		</div>
		

	</form>

	<h3>Danh sách sinh viên</h3>
	<table class="table align-middle mb-0 bg-white">
		<thead class="bg-light">
			<tr>
				<th>Số CMND</th>
				<th>Họ Tên</th>
				<th>Email</th>
				<th>Số điện thoại</th>
				<th>Địa chỉ</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${sinhVienList}" var="sinhVien">
				<tr>
					<td>${sinhVien.soCMND}</td>
					<td>${sinhVien.hoTen}</td>
					<td>${sinhVien.email}</td>
					<td>${sinhVien.soDT}</td>
					<td>${sinhVien.diaChi}</td>
				</tr>
			</c:forEach>


		</tbody>
	</table>
	<jsp:include page="_footer.jsp"></jsp:include>
</body>
</html>