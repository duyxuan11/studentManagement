<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tìm kiếm thông tin sinh viên tốt nghiệp</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
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
		max-width: 1200px;
	}
	h1{
	    	text-align: center;
	    }
	p {
		color: red;
		text-align: center;
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
	<h1>Tìm kiếm thông tin sinh viên tốt nghiệp</h1>
	<p>${errorString}</p>
	<form method="POST" action="${pageContext.request.contextPath}/findTTTN" accept-charset="utf-8">
		<div class="form-row"></div>
		<div class="form-row">
            <div class="form-group col-md-6">
            	<label for="inputCMND">Số CMND</label> 
				<input name="soCMND" value="${sinhVienTotNghiep.soCMND}" type="text" class="form-control" id="inputCMND">
            </div>
            <div class="form-group col-md-6">
            	<label for="inputName">Họ và tên</label> 
				<input name="hoTen" value="${sinhVienTotNghiep.hoTen}" type="text" class="form-control" id="inputName" >
            </div>
        </div>

		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputTruong">Mã trường</label>
				<input name="maTruong" value="${sinhVienTotNghiep.maTruong}" type="text" class="form-control" id="inputTruong" >
				<%-- <select name="maTruong" id="inputTruong" class="form-control">
					<c:forEach items="${truongList}" var="truong" >
						<option  value="${truong.maTruong}">${truong.maTruong} - ${truong.tenTruong}</option>
	       			</c:forEach>
				</select> --%>
			</div>
			<div class="form-group col-md-6">
				<label for="inputNganh">Mã ngành</label> 
				<input name="maNganh" value="${sinhVienTotNghiep.maNganh}" type="text" class="form-control" id="inputNganh" >
				<%-- <select name="maNganh" id="inputNganh" class="form-control">
						<c:forEach items="${nganhList}" var="nganh" >
				          <option value="${nganh.maNganh}">${nganh.maNganh} - ${nganh.tenNganh}</option>
				       </c:forEach>
				</select> --%>
			</div>
		</div>

		<div class="form-row">
            <div class="form-group col-md-6">
            	<label for="inputTenCT">Tên Công Ty</label> 
				<input name="tenCongTy" value="${sinhVienTotNghiep.tenCongTy}" type="text" class="form-control" id="inputTenCT">
            </div>
            <div class="form-group col-md-6">
            	<label for="inputThoiGianLamViec">Thời gian làm việc</label> 
				<input name="thoiGianLamViec" value="${sinhVienTotNghiep.thoiGianLamViec}" type="text" class="form-control" id="inputThoiGianLamViec">
            </div>
        </div>
        <div class = "center1">
			<button type="submit" class="btn btn-primary btn-lg">Tìm kiếm</button>
			<span class="mgin"> </span> <a href="findTTTN"
			class="btn btn-secondary btn-lg active" role="button"
			aria-pressed="true">Hủy</a>
		</div>
	</form>
	<span class="mgin"></span>
	<h3 class="center1">Thông tin sinh viên tốt nghiệp</h3>
	<table class="table align-middle mb-0 bg-white">
		<thead class="bg-light">
			<tr>
				<th>Số CMND</th>
				<th>Họ Tên</th>
				<th>Mã Ngành</th>
				<th>Mã Trường</th>
				<th>Mã Ngành Đang Làm Việc</th>
				<th>Tên Công Ty</th>
				<th>Thời Gian Làm Việc</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${sinhVienTotNghiepList}" var="sinhVien">
				<tr>
					<td>${sinhVien.soCMND}</td>
					<td>${sinhVien.hoTen}</td>
					<td>${sinhVien.maNganh}</td>
					<td>${sinhVien.maTruong}</td>
					<td>${sinhVien.maNganhDangLam}</td>
					<td>${sinhVien.tenCongTy}</td>
					<td>${sinhVien.thoiGianLamViec}</td>
				</tr>
			</c:forEach>


		</tbody>
	</table>
	<jsp:include page="_footer.jsp"></jsp:include>
</body>
</html>