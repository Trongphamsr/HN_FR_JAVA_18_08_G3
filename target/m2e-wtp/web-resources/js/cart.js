jQuery(document).ready(function($) {
	$(".btn-cart").click(function() {
		var cart = $('#cart');
		var imgtodrag = document.createElement('i');
		$(imgtodrag).addClass('fas fa-gift');
		if (imgtodrag) {
			$(imgtodrag).offset({
				top : $(this).offset().top,
				left : $(this).offset().left
			}).css({
				'opacity' : '0.7',
				'position' : 'absolute',
				'font-size': '80px',
				'color':'red',
				'z-index' : '100'
			}).appendTo($('body')).animate({
				'top' : $(cart).offset().top+10,
				'left' : $(cart).offset().left+10,
				'font-size': '40px'
			}, 1500, 'easeInOutExpo');

			setTimeout(function() {
				$(cart).effect("shake", {
					times : 3
				}, 200);
			}, 1500);

			$(imgtodrag).animate({
				'font-size':'0'
			}, function() {
				$(this).detach()
			});
		}
		var cartNumber = parseInt($("#cartNumber").html());
		$("#cartNumber").html(1 + cartNumber);
	})
});