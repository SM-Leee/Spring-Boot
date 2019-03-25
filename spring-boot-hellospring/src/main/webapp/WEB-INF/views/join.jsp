<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>mysite</title>
<script type="text/javascript"
	src="${pageContext.servletContext.contextPath }/assets/js/jquery/jquery-1.9.0.js"></script>
</head>
<body>
	<form method="post"
		action="${pageContext.servletContext.contextPath }/user/join">

		<label class="block-label" for="name">이름</label> <input name="name"
			type="text" value=""> <br>
		<br> <label class="block-label" for="email">이메일</label> <input
			name="email" type="text" value=""> <br>
		<br> <img id="img-checkemail" style="width: 20px; display: none;"
			src="${pageContext.servletContext.contextPath }/assets/images/check.png" />
		<input id="btn-checkemail" type="button" value="이메일확인"> <label
			class="block-label">비밀번호</label> <input name="password"
			type="password" value="">

		<fieldset>
			<legend>성별</legend>
			<label>여</label> <input type="radio" name="gender" value="female"
				checked="checked"> <label>남</label> <input type="radio"
				name="gender" value="male">
		</fieldset>

		<fieldset>
			<legend>약관동의</legend>
			<input id="agree-prov" type="checkbox" name="agreeProv" value="y">
			<label>서비스 약관에 동의합니다.</label>
		</fieldset>

		<input type="submit" value="가입하기">

	</form>
</body>
</html>