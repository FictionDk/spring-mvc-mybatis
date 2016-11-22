<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<meta name="Description"
	content="Information architecture, Web Design, Web Standards." />
<meta name="Keywords" content="your, keywords" />
<meta http-equiv="Content-Type" content="text/html; " />
<meta name="Distribution" content="Global" />
<meta name="Author" content="Erwin Aligam - ealigam@gmail.com" />
<meta name="Robots" content="index,follow" />

<link rel="stylesheet" href="images/Envision.css" type="text/css" />

<title>Fictio</title>

</head>

<body>

	用户登录:
	<form  action="user/login" method="get">
		user name:<br> <input type="text" name="userName" value=""> <br> 
		pass word:<br> <input type="text" name="password" value="">
		<br><br> <input type="submit" value="登录">
	</form><br><br><br>
	
	用户注册:
	<form action="user/signUp" method="get">
		user name:<br> <input type="text" name="userName" value="Mickey"> <br> 
		pass word:<br> <input type="text" name="password" value="*****">
		<br><br> <input type="submit" value="注册">
	</form><br><br><br>
	
	
	用户测试:
	<form  action="user/test" method="post">
		user name:<br> <input type="text" name="userName" value=""> <br> 
		pass word:<br> <input type="text" name="password" value="">
		<br><br> <input type="submit" value="测试">
	</form><br><br><br>
	
</body>
</html>
