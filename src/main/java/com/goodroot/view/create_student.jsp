<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class = "container">
		<div class = "row">
			<div class ="col-lg-6 col-md-6 col-sm-6 container justify-content-center card">
				<h1 class = "text-center"> add Student </h1>
				<div class = "card-body">
					<form th:action="@{/students}" th:object = "${student}" method="POST">
						<div class ="form-group">
							<label> First Name </label>
							<input
							type = "text"
							name = "firstName"
							th:field = "*{firstName}"
							class = "form-control"
							placeholder="Enter Student First Name" 
							/>
						</div>
						
						<div class ="form-group">
							<label> Last Name </label>
							<input
							type = "text"
							name = "lastName"
							th:field = "*{lastName}"
							class = "form-control"
							placeholder="Enter Student Last Name" 
							/>
						</div>
						
						<div class ="form-group">
							<label> Email </label>
							<input
							type = "text"
							name = "email"
							th:field = "*{email}"
							class = "form-control"
							placeholder="Enter Student Email" 
							/>
						</div>
						
						<div class ="form-group">
							<label> password </label>
							<input
							type = "text"
							name = "password"
							th:field = "*{password}"
							class = "form-control"
							placeholder="Enter Student default password" 
							/>
						</div>
						
						<div class = "box-footer">
							<button type="submit" class = "btn btn-primary">
								Submit
							</button>
						</div>
					</form>
				
				</div>
			</div>
		</div>
	</div>

</body>
</html>