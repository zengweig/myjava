$(function(){
	$(".items").each(function(){
		$(this).click(function(){
			$(this).addClass("active");
			$(this).siblings().removeClass("active");			
		})
	})
		
})