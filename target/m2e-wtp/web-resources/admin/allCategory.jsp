<%@taglib prefix="s" uri="/struts-tags"%>
<html lang="vi">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>all Category</title>

    <jsp:include page="head.jsp"></jsp:include>

</head>

<body>

    <div id="wrapper">

        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <jsp:include page="header.jsp"></jsp:include>

            <jsp:include page="left.jsp"></jsp:include>
        </nav>

        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-6">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3>ALL Category</h3>
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                        <s:if test="noData==true">
                            <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Name</th>
                                        <th>Action</th>
                                    </tr>
                                </thead>

                                <tbody>
                                    <s:iterator value="categoryResult">
                                   <tr class="even gradeA">
                                        <td><s:property value="id" /></td>
                                        <td><s:property value="name" /></td>
                                        <td class="center td_all">
                                              <a class="alert alert-danger" onclick="return confirm('Are you sure you want to delete this item?');" href="deleteCategory?id=<s:property value="id"/>"  >delete</a>
                                              <a data-toggle="modal" data-target="#edit_product" class="alert alert-success" href="#">edit</a>
                                        </td>
                                    </tr> 
                                    </s:iterator>
                                </tbody>
                            </table>
                            </s:if>
		<s:else>
			<div style="color: red;">No Data Found.</div>
		</s:else>
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->


            <div id="edit_product" class="modal fade" role="dialog">
              <div class="modal-dialog">

                <!-- Modal content-->
                <div class="modal-content">
                  <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Modal Header</h4>
                  </div>
                  <div class="modal-body">
                        

                        <form>
                          <div class="form-group">
                            <label for="exampleFormControlInput1">Email address</label>
                            <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com">
                          </div>
                          <div class="form-group">
                            <label for="exampleFormControlSelect1">Example select</label>
                            <select class="form-control" id="exampleFormControlSelect1">
                              <option>1</option>
                              <option>2</option>
                              <option>3</option>
                              <option>4</option>
                              <option>5</option>
                            </select>
                          </div>
                          <div class="form-group">
                            <label for="exampleFormControlSelect2">Example multiple select</label>
                            <select multiple class="form-control" id="exampleFormControlSelect2">
                              <option>1</option>
                              <option>2</option>
                              <option>3</option>
                              <option>4</option>
                              <option>5</option>
                            </select>
                          </div>
                          <div class="form-group">
                            <label for="exampleFormControlTextarea1">Example textarea</label>
                            <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
                          </div>
                        </form>

                  </div>
                  <div class="modal-footer">
                    <button type="button" class="btn btn-default btn_close_modal" data-dismiss="modal">Close</button>
                    <button type="submit" class="alert alert-success">Submit Button</button>
                  </div>
                </div>

              </div>
            </div>
    </div>
    <jsp:include page="footer.jsp"></jsp:include>
    <script>
    $(document).ready(function() {
        $('#dataTables-example').DataTable({
            responsive: true
        });
    });
    </script>

</body>

</html>
