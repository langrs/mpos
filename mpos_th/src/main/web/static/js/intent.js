$(document).ready(function() {
			$("#key").focus();
			 $("#associatedForm").validate({
				submitHandler: function(form){
					Oosp_Loading('正在提交，请稍等...');
					form.submit();
				},
				errorContainer: "#messageBox",
				errorPlacement: function(error, element) {
					$("#messageBox").text("输入有误，请先更正。");
					if (element.is(":checkbox")||element.is(":radio")||element.parent().is(".input-append")){
						error.appendTo(element.parent().parent());
					} else {
						error.insertAfter(element);
					}
				}
			}); 
			$("#saveAssociated").click(function (){
				$("#associatedForm").submit();
			});
		});
		function getUrl(tag,url){ 
			  $('#intentBrand').attr("src",url);
		}