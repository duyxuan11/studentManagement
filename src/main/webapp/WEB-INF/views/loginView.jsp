<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">">
<title>Login</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>

	<style>
	    form {
	        margin-left: 50%;
	        transform: translateX(-50%);
	        max-width: 500px;
	    }
	    h1{
	    	text-align: center;
	    }
	    p{
	    	text-align: center;
	    }
	</style>

<body>
	<h1>Đăng Nhập</h1>
	<p style="color: red;">${errorString}</p>
	<form method="POST" action="${pageContext.request.contextPath}/login">
		<!-- Email input -->
		<div class="form-outline mb-4">
			<input type="text" id="inputUserName" class="form-control" name="UserName" value= "${user.userName}"/> 
			<label class="form-label" for="inputUserName" >User Name</label>
		</div>

		<!-- Password input -->
		<div class="form-outline mb-4">
			<input type="password" id="inputPassword" class="form-control" name="passwd" value= "${user.password}"/> 
			<label class="form-label" for="inputPassword" >Password</label>
		</div>

		<!-- 2 column grid layout for inline styling -->
		<div class="row mb-4">
			<div class="col d-flex justify-content-center">
				<!-- Checkbox -->
				<div class="form-check">
					<input class="form-check-input" type="checkbox" name="rememberMe" value="Y"
						id="form2Example31" checked /> 
						<label class="form-check-label" for="form2Example31"> Remember me </label>
				</div>
			</div>

			<div class="col">
				<!-- Simple link -->
				<a href="#!">Forgot password?</a>
			</div>
		</div>

		<!-- Submit button -->
		<button type="submit" class="btn btn-primary btn-block mb-4">Sign
			in</button>
	</form>
	<jsp:include page="_footer.jsp"></jsp:include>
</body>
</html>