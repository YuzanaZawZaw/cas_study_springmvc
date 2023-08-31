<!doctype html>
<html lang="en">
<%@ include file="/WEB-INF//jsp/common.jsp"%>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<head>
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>CASE STUDY HOME PAGE</title>
<style>
/* Centered text */
.centered {
	position: absolute;
	top: 15%;
	left: 50%;
	transform: translate(-50%, -50%);
}
</style>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
	function showPrompt() {
		var userInput = encodeURIComponent(prompt("Please enter ID:", ""));
		if (userInput !== null) {
			confirmDelete(userInput);
		} else {
			alert("No input provided.");
		}
	}
	function confirmDelete(userInput) {
		var result = window.confirm("Are you sure you want to delete?");
		if (result) {
			var linkElement = document.getElementById('deleteLink');
			var href = linkElement.getAttribute('href');

			$.ajax({
                type: "GET",
                url: "deleteDataPath", 
                data: { Id: userInput },
                success: function(response) {
                    alert(response);
                },
                error: function(error) {
                    console.error("Error:", error);
                }
            });
			
		} else {
			// Do nothing or provide feedback
			alert("Deletion canceled.");
		}
	}
</script>

</head>
<body>
	<div class="centered mt-5">
		<h1>
			<strong>Case Study Home page</strong>
		</h1>
		<div class="container">
			<div class="row align-items-center justify-content-center">
				<div class="col-md-6">
					<a href="fetchDataPath"
						class="btn btn-outline-info btn-block btn-rounded  mb-4">Fetch
						Data</a>
				</div>
				<div class="col-md-6">
					<a href="insertDataPath"
						class="btn btn-outline-info btn-block btn-rounded  mb-4">Insert
						Data</a>
				</div>
				<div class="col-md-6">
					<a href="showDataPath"
						class="btn btn-outline-info btn-block btn-rounded  mb-4">Show
						Data</a>
				</div>
				<div class="col-md-6">
					<a id="deleteLink" 
						class="btn btn-outline-info btn-block btn-rounded  mb-4"
						onclick="showPrompt()">Delete Data</a>
				</div>
			</div>
		</div>
	</div>

</body>
</html>