<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
div class ="container">
		<div class = "row">
			<h1>Student </h1>
		</div>
		
		<div class = "row">
			<div class = "col-lg-3">
				<a th:href = "@{/student/${id} }}" class = "btn btn-primary btn-sm mb-3">Student</a>
			</div>
		</div>
		<table class = "table table-striped table-bordered">
			<thead class = "table-dark">
				<tr>
					<th> Student First Name</th>
					<th> Student Last Name</th>
					<th> Student Email </th>
					<th> Actions </th>
				</tr>
			</thead>
			
			<tbody>
				<tr th:each = "student: ${students}">
					<td th:text = "${student.firstName}"></td>
					<td th:text = "${student.lastName}"></td>
					<td th:text = "${student.email}"></td>
					<td>
						<a th:href = "@{/students/edit/{id}(id=${student.id})}"
						 class = "btn btn-primary">Update</a>
						 
					</td>
				</tr>
			</tbody>
		
		</table>
		
	</div>
</body>
</html>