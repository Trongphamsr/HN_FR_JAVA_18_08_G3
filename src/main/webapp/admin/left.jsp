<div class="navbar-default sidebar" role="navigation">
	<div class="sidebar-nav navbar-collapse">
		<ul class="nav" id="side-menu">
			<li class="sidebar-search">
				<div class="input-group custom-search-form">
					<input type="text" class="form-control" placeholder="Search...">
					<span class="input-group-btn">
						<button class="btn btn-default" type="button">
							<i class="fa fa-search"></i>
						</button>
					</span>
				</div> <!-- /input-group -->
			</li>
			<li><a href="index.jsp"><i class="fa fa-dashboard fa-fw"></i>
					Dashboard</a></li>
			<li><a href="#"><i class="fa fa-bar-chart-o fa-fw"></i>
					Product<span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">

					<li><a href="allCategory"><i
							class="fa fa-table fa-fw"></i> allProduct</a></li>
					<li><a
						href="registerCategory"><i
							class="fa fa-edit fa-fw"></i> addProduct</a></li>
				</ul> <!-- /.nav-second-level --></li>



			<li><a href="#"><i class="fa fa-bar-chart-o fa-fw"></i>
					Category<span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">

					<li><a href="allCategory"><i
							class="fa fa-table fa-fw"></i> allCategory</a></li>
					<li><a
						href="<%=request.getContextPath() %>/admin/addCategory.jsp"><i
							class="fa fa-edit fa-fw"></i> addCategory</a></li>
				</ul> <!-- /.nav-second-level --></li>


			<!-- <li>
                            <a href="/page/allProduct.jsp"><i class="fa fa-table fa-fw"></i> allProduct</a>
                        </li>
                        <li>
                            <a href="addProduct.html"><i class="fa fa-edit fa-fw"></i> addProduct</a>
                        </li>-->
			<li><a href="<%=request.getContextPath() %>/page/login.jsp">Login
					Page</a></li>
			<!-- /.nav-second-level -->
			</li>
		</ul>
	</div>
	<!-- /.sidebar-collapse -->
</div>
<!-- /.navbar-static-side -->