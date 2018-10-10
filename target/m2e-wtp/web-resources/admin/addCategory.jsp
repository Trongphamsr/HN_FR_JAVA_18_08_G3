<!DOCTYPE html>
<html lang="vi">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>add Product</title>

<jsp:include page="head.jsp"></jsp:include>
</head>

<body>

	<div id="wrapper">

		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0">
			<jsp:include page="header.jsp"></jsp:include>

			<jsp:include page="left.jsp"></jsp:include>
		</nav>

		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">
						<marquee width="50%" behavior="alternate" bgcolor="pink">Add
							Category Database</marquee>
					</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-body">
							<form role="form" action="registerCategory">

								<div class="row">
									<div class="col-lg-7">
										<div class="form-group">
											<label>create category</label> <input class="form-control"
												placeholder="Enter category" name="name" id="name">
										</div>

										<button type="submit"
											class="btn btn-default">Submit
											Button</button>
										<button type="reset" class="btn btn-default">Reset
											Button</button>
							</form>
						</div>
						<!-- /.row (nested) -->
					</div>
					<!-- /.panel-body -->
				</div>
				<!-- /.panel -->
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
	</div>
	<!-- /#page-wrapper -->

	</div>
	<jsp:include page="footer.jsp"></jsp:include>

</body>

</html>
