$(document).ready(function(){
	$(".pagination li a").click(function(event){
		$(".grid-product").css({
			"background-color":"black",
			"opacity":0.3
		});
		$(".img-gif").css({
			"display":"block"
		});
	})
})