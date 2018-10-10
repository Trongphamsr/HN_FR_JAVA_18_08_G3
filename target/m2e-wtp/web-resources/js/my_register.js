
$(function(){

	$("#register-form").validate({
		rules:{
			Address:"required",
			Password:"required",
	 		Email:"required",
			FirstName:{
				required: true,
				minlength:2,
				maxlength:5
			},
			LastName:{
				required: true,
				minlength:4,
				maxlength:10
			},
			ConfirmPassword : {
				equalTo: "#Password"
			},
			Phone:{
				
			    required: true,
			    number: true,
				minlength:10, 
				maxlength:10
				}

		},
		messages:{
			
			Address:"This field is required please",
			Password:"This field is required please",
			Email:"This field is required please a@gmail.com",
			ConfirmPassword: {
				equalTo: "Re-password must be the same with password"
			},
			
			FirstName:{
				required:"This field is required please",
				minlength:"minlength 4 character",
				minlength:"maxlength 10 character"
			},

			LastName:{
				required:"This field is required please",
				minlength:"minlength 4 character",
				minlength:"maxlength 10 character"
			},
			Phone:{
			    required:"This field is required please",
			    number:"matches must 0-9",
				minlength:"minlength 10 character",
				minlength:"maxlength 10 character"
			}
		}

	});


});


function registerMember() {
	var FirstName = $("#FirstName").val();
	var LastName = $("#LastName").val();
	var Address = $("#Address").val();
	var Password = $("#Password").val();
	var Email = $("#Email").val();
	var Phone = $("#Phone").val();
	var ConfirmPassword= $("#ConfirmPassword").val();
	
	$.ajax({
		type : "POST",
		url : "registerMember",
		data : "FirstName=" + FirstName + "&LastName=" + LastName
		+ "&Address=" + Address 
		+ "&Password=" + Password
		+ "&Email=" + Email
		+ "&Phone=" + Phone
		+ "&ConfirmPassword=" + ConfirmPassword,

		success : function(data) {
			var ht = data.msg;
			$("#response").html(ht);
		},
		error : function(data) {
			alert("Some error occured");
		}
	});
}
