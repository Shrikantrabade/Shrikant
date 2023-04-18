<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>USER REG FORM</h1>
	<form action="/saveUser">
		<table>

			<tr>
				<td>USERNAME FNAME</td>
				<td><input type="text" name="fname">
				<td />
			</tr>

			<tr>
				<td>USERNAME LNAME</td>
				<td><input type="text" name="lname">
				<td />
			</tr>

			<tr>
				<td>EMAIL</td>
				<td><input type="text" name="email">
				<td />
			</tr>

			<tr>
				<td>UNAME</td>
				<td><input type="text" name="uname">
				<td />
			</tr>

			<tr>
				<td>PASSWORD</td>
				<td><input type="text" name="passward">
				<td />
			</tr>

			<tr>
				<td><input type="submit" value="REGISTER">
				<td />
			</tr>

		</table>

	</form>

</body>
</html>