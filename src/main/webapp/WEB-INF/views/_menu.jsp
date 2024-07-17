<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
	<a class="navbar-brand" href="${pageContext.request.contextPath}/home">Trang
		chủ</a>

	<div class="collapse navbar-collapse" id="navbarNav">
		<ul class="navbar-nav">
			<li class="nav-item active"><a class="nav-link"
				href="${pageContext.request.contextPath}/khaibao">Khai báo<span
					class="sr-only">(current)</span>
			</a></li>
			<li class="nav-item active"><a class="nav-link"
				href="${pageContext.request.contextPath}/findSinhVien">Tìm kiếm
					TTSV <span class="sr-only">(current)</span>
			</a></li>
			<li class="nav-item active"><a class="nav-link"
				href="${pageContext.request.contextPath}/findTTTN">Tìm kiếm TTTN
					<span class="sr-only">(current)</span>
			</a></li>
			<li class="nav-item active"><a class="nav-link"
				href="${pageContext.request.contextPath}/">Đăng xuất<span
					class="sr-only">(current)</span>
			</a></li>
		</ul>
	</div>
</nav>
