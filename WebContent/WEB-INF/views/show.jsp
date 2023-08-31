<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h3>Fetch 10 Data set from 3 api</h3>
<body>
	<div class="container-xl">
		<div class="table-responsive">
			<div class="table-wrapper">
				<div class="table-title">
					<div class="row">
						<div class="col-sm-8">
							<h2>
								<font color="836ea7">Posts</font>
							</h2>
						</div>
					</div>
				</div>
				<div class="p-3 table-responsive">
					<table class="table table-striped table-hover table-bordered"
						id="myTable">
						<thead style="background-color: #836ea7">
							<tr>
								<th><font color="white">Post Id <i
										class="fa fa-sort"></i>
								</font></th>
								<th><font color="white">Title <i
										class="fa fa-sort"></i>
								</font></th>
								<th><font color="white">Body <i
										class="fa fa-sort"></i>
								</font></th>
								<th><font color="white">User Id <i
										class="fa fa-sort"></i>
								</font></th>
								<th><font color="white">Tags <i
										class="fa fa-sort"></i>
								</font></th>
								<th><font color="white">Reactions <i
										class="fa fa-sort"></i>
								</font></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach
										items="${postList}"
										var="postList">
								<tr>
									<td>${postList.id}</td>
									<td>${postList.title}</td>
									<td>${postList.body}</td>
									<td>${postList.userId}</td>
									<td>${postList.tags}</td>
									<td>${postList.reactions}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	
	<div class="container-xl">
		<div class="table-responsive">
			<div class="table-wrapper">
				<div class="table-title">
					<div class="row">
						<div class="col-sm-8">
							<h2>
								<font color="836ea7">Products</font>
							</h2>
						</div>
					</div>
				</div>
				<div class="p-3 table-responsive">
					<table class="table table-striped table-hover table-bordered"
						id="myTable">
						<thead style="background-color: #836ea7">
							<tr>
								<th><font color="white">Id <i
										class="fa fa-sort"></i>
								</font></th>
								<th><font color="white">Title <i
										class="fa fa-sort"></i>
								</font></th>
								<th><font color="white">Descriptions <i
										class="fa fa-sort"></i>
								</font></th>
								<th><font color="white">Price <i
										class="fa fa-sort"></i>
								</font></th>
								<th><font color="white">Percentage <i
										class="fa fa-sort"></i>
								</font></th>
								<th><font color="white">Rating <i
										class="fa fa-sort"></i>
								</font></th>
								<th><font color="white">Stock <i
										class="fa fa-sort"></i>
								</font></th>
								<th><font color="white">Brand <i
										class="fa fa-sort"></i>
								</font></th>
								<th><font color="white">Category <i
										class="fa fa-sort"></i>
								</font></th>
								<th><font color="white">Thumbnail <i
										class="fa fa-sort"></i>
								</font></th>
								<th><font color="white">Image <i
										class="fa fa-sort"></i>
								</font></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach
										items="${productList}"
										var="productList">
								<tr>
									<td>${productList.id}</td>
									<td>${productList.title}</td>
									<td>${productList.descriptions}</td>
									<td>${productList.price}</td>
									<td>${productList.discountPercentage}</td>
									<td>${productList.rating}</td>
									<td>${productList.stock}</td>
									<td>${productList.brand}</td>
									<td>${productList.category}</td>
									<td>${productList.thumbnail}</td>
									<td>${productList.image}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	
	<div class="container-xl">
		<div class="table-responsive">
			<div class="table-wrapper">
				<div class="table-title">
					<div class="row">
						<div class="col-sm-8">
							<h2>
								<font color="836ea7">Quotes</font>
							</h2>
						</div>
					</div>
				</div>
				<div class="p-3 table-responsive">
					<table class="table table-striped table-hover table-bordered"
						id="myTable">
						<thead style="background-color: #836ea7">
							<tr>
								<th><font color="white">Id <i
										class="fa fa-sort"></i>
								</font></th>
								<th><font color="white">Quote <i
										class="fa fa-sort"></i>
								</font></th>
								<th><font color="white">Author <i
										class="fa fa-sort"></i>
								</font></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach
										items="${quoteList}"
										var="quoteList">
								<tr>
									<td>${quoteList.id}</td>
									<td>${quoteList.quote}</td>
									<td>${quoteList.author}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>