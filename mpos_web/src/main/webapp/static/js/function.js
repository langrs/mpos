// JavaScript Document

$(function(){
	var _this=$(".media-heading");
	var content=$(".maoye-checkbox");
	_this.find(".maoye-icon").click(function(){
		/*if($(this).parent().parent().siblings(".maoye-checkbox").is(":visible")){
			$(this).find("img").attr("src","images/jia.png");
			$(this).parent().parent().siblings(".maoye-checkbox").hide();
			}else{
			$(this).find("img").attr("src","images/jian.png");
			$(this).parent().parent().siblings(".maoye-checkbox").show();
			};*/

          if($(this).parent().parent().next().is(":visible")){
			$(this).find("img").attr("src","images/jia.png");
			$(this).parent().parent().next().hide();
			}else{
			$(this).find("img").attr("src","images/jian.png");
			$(this).parent().parent().next().show();
			};

		});
		
		//根节点
		$(".maoye-mbody").find(".maoye-icon-parent").parent().parent().siblings().hide();
		$(".maoye-mbody").find(".maoye-icon-parent").click(function(){
			if($(this).parent().parent().siblings().is(":visible")){
			$(this).find("img").attr("src","images/jia.png");
			$(this).parent().parent().siblings().hide();
			}else{
			$(this).find("img").attr("src","images/jian.png");
			$(this).parent().parent().siblings().show();
			}
			})
			
	//input[type=checkbox]根节点选中，子节点也选中
		
			
})
