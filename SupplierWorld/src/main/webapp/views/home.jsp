<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Supplier World</title>
<link rel="stylesheet" href="css/home_style.css">
</head>
<body>
	<div class="greeter">
		<span class="greeter">Welcome to Supplier World</span>
	</div>
	<div class="box">
		<form action="login" method="post">
			<span class="text-center">login</span>
			<div class="message">${message}</div>
			<br>
			<div class="input-container">
				<input type="text" required="required" name="username" /> <label>Username</label>
			</div>
			<div class="input-container">
				<input type="password" required="required" name="password" /> <label>Password</label>
			</div>
			<input type="submit" class="btn" value="submit">
		</form>
	</div>
</body>
</html>