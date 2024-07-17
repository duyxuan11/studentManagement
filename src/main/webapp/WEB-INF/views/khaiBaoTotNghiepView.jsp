<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nhập thông tin sinh viên tốt nghiệp</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<meta charset="UTF-8">
<style>
	form {
	        margin-left: 50%;
	        transform: translateX(-50%);
	        max-width: 1000px;
	    }
	h1{
	    	text-align: center;
	    }
	p {
		color: red;
		text-align: center;
	}
</style>

<body>
	<jsp:include page="_menu.jsp"></jsp:include>
	<h1>Nhập thông tin sinh viên tốt nghiệp</h1>
	
	<p>${errorString}</p>
	<form method="POST" action="${pageContext.request.contextPath}/khaibao" accept-charset="utf-8">
		<div class="form-row"></div>
		<div class="form-row">
            <div class="form-group col-md-6">
            	<label for="inputCMND">Số CMND</label> 
				<input name="soCMND" value="${sinhVien.soCMND}" type="text" class="form-control" id="inputCMND" pattern="[0-9]{9,12}" required>
            </div>
            <div class="form-group col-md-6">
            	<label for="inputName">Họ và tên</label> 
				<input name="hoTen" value="${sinhVien.hoTen}" type="text" class="form-control" id="inputName" required>
            </div>
        </div>

		<div class="form-row">
            <div class="form-group col-md-6">
            	<label for="inputEmail4">Email</label> 
				<input name="email" value="${sinhVien.email}" type="email" class="form-control" id="inputEmail4" pattern="/^([w-.]+)@(([[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.)|(([w-]+.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(]?)$/" required>
            </div>
            <div class="form-group col-md-6">
            	<label for="inputSDT">Số điện thoại</label> 
				<input name="soDT" value="${sinhVien.soDT}" type="text" class="form-control" id="inputSDT" pattern="(\+84|0)\d{9,10}" required>
            </div>
        </div>
        
       <div class="form-row">
            <div class="form-group col-md-6">
            	<label for="inputAddress">Địa chỉ</label> 
				<input name="diaChi" value="${sinhVien.diaChi}" type="text" class="form-control" id="inputAddress" required>
            </div>
            <div class="form-group col-md-6">
            	<label for="inputNgayTN">Ngày tốt nghiệp</label> 
				<input name="ngayTN" value="${totNghiep.ngayTN}" type="date" class="form-control" id="inputNgayTN" pattern="d{4}-d{1,2}-d{1,2}" required>
            </div>
        </div>

		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputTruong">Mã trường</label> 
				<select name="maTruong" id="inputTruong" class="form-control" required>
					<c:forEach items="${truongList}" var="truong" >
						<option  value="${truong.maTruong}">${truong.maTruong} - ${truong.tenTruong}</option>
	       			</c:forEach>
				</select>
			</div>
			<div class="form-group col-md-6">
				<label for="inputNganh">Mã ngành</label> 
				<select name="maNganh" id="inputNganh" class="form-control" required>
						<c:forEach items="${nganhList}" var="nganh" >
				          <option value="${nganh.maNganh}">${nganh.maNganh} - ${nganh.tenNganh}</option>
				       </c:forEach>
				</select>
			</div>
		</div>

		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputHeTN">Hệ tốt nghiệp</label> 
				<select name="heTN" id="inputHeTN" class="form-control" required>
					<option  value="Chính quy">Chính quy</option>
					<option  value="Liên thông">Liên thông</option>
				</select>
			</div>
			<div class="form-group col-md-6">
				<label for="inputLoaiTN">Loại tốt nghiệp</label> 
				<select name="loaiTN" id="inputLoaiTN" class="form-control" required>
					<option  value="Giỏi">Giỏi</option>
					<option  value="Khá">Khá</option>
					<option  value="Trung Bình">Trung Bình</option>
				</select>
			</div>
		</div>
		
		<div class="form-row">
            <div class="form-group col-md-6">
            	<label for="inputTenCT">Tên Công Ty</label> 
				<input name="tenCongTy" value="${congViec.tenCongTy}" type="text" class="form-control" id="inputTenCT" required>
            </div>
            <div class="form-group col-md-6">
            	<label for="inputTenCV">Tên Công Việc</label> 
				<input name="tenCongViec" value="${congViec.tenCongViec}" type="text" class="form-control" id="inputTenCV" required>
            </div>
        </div>
        
        <div class="form-row">
            <div class="form-group col-md-6">
            	<label for="inputNgayVaoCT">Ngày vào công ty</label> 
				<input name="ngayVaoCongTy" value="${congViec.ngayVaoCongTy}" type="date" class="form-control" id="inputNgayVaoCT" pattern="d{4}-d{1,2}-d{1,2}" required>
            </div>
            <div class="form-group col-md-6">
            	<label for="inputThoiGianLamViec">Thời gian làm việc</label> 
				<input name="thoiGianLamViec" value="${congViec.thoiGianLamViec}" type="text" class="form-control" id="inputThoiGianLamViec" required>
            </div>
        </div>
        
        <div class="form-group">
            <label for="inputDiaChiCT">Địa chỉ công ty</label> 
			<input name="diaChiCongTy" value="${congViec.diaChiCongTy}" type="text" class="form-control" id="inputDiaChiCT" required>
        </div>

		<button type="submit" class="btn btn-primary">Lưu thông tin</button>
		<a href="home">Cancel</a>
	</form>
	<jsp:include page="_footer.jsp"></jsp:include>
</body>
</html>