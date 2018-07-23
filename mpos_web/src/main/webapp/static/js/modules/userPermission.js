
$(function(){
	//tree
     var setting = {
			view: {
				showLine: false
			},
			data: {
				simpleData: {
					enable: true
				}
			},
			callback: {
			   beforeDblClick: zTreeBeforeDblClick,
               onClick: onTreeNodeClick
            }
		};
     
     function zTreeBeforeDblClick(treeId, treeNode) {
        return false;
	 }

	function onTreeNodeClick(event, treeId, treeNode) {
		// 用于解决双击时候会调用两次单击事件的问题
	    if (treeNode.clickTimeout) {
	        clearTimeout(treeNode.clickTimeout);
	        treeNode.clickTimeout = null;
	    } else {
	    	treeNode.clickTimeout = setTimeout(function() {
	    		 if (!treeNode.isParent) {
	    			  loadRolePermission(treeNode.id)	   
	    	      }
	    		 treeNode.clickTimeout = null;
	        }, 250);
	    }
	}

	function Node(id,pId,name,open){ //use constructor 
		this.id=id; 
		this.pId=pId; 
		this.name=name; 
		this.open=open; 
		return this; 
	} 


	var treeNodes = new Array();
   
	var orgId=$("#orgId").val()


     $("#chooseUser").click(function(){
		   $("#errortips").empty();
		   $("#errortips").hide();

	  var url=Com_Parameter.ContextPath+'/dialog/dialogFrame?selectObj=3&selectType=single&structDimId=1&orgId='+orgId;
	  var  title="请选择人员";	 
	  var selectType="single";
	  showDialog(url,title,selectType); 	
		
	 });


      $("#member-query-btn").click(function(){
          $("#errortips").empty();
		  $("#errortips").hide();
		  $("#subsystemPanel").empty();
	       var userId=$("#userId").val();
	  	  
		  if(userId==''){
			 $.jBox.alert("请选择人员", '提示');	    
			 return;
		  }
         treeNodes=[];
		 loadUserRole(userId);

		});	
 $("#subsystemPanel").hide();
	  function  loadUserRole(userId){
		     $.ajax({
			 type:"GET",
		     url:Com_Parameter.ContextPath+ "/authorizeMgt/userRoleList",
		     data:{"userId":userId},
			 dataType: "json",
			 success:function(data) {
					 $.each(data, function(index, val) {
						var roleNode=new Node(val.id, 0, val.roleName,false);
						treeNodes.push(roleNode);
				  });

				  if(treeNodes.length > 0){
				   $.fn.zTree.init($("#treeDemo"), setting, treeNodes);
				  }else{
				   $.fn.zTree.init($("#treeDemo"), setting, []);
				    $("#errortips").append("该人员未分配权限");
					$("#errortips").show();
				  }
                
			   },
			 error: function (msg) {
				 $.jBox.alert("查询角色失败", '提示');	
				 $.fn.zTree.init($("#treeDemo"), setting, treeNodes);
             }
			 })
		 }

			function drawModules(system){

									//模块
		           $.each(system.moduleModels, function(index, module) {
					 var moduleChecked=""
					 if(module.checked){
						moduleChecked="checked";
					 }
					 
					$("#system_"+system.sid).append("<div class='media maoye-media'><a href='#'class='pull-left'><span  class='media-object' style='width:14px; height: 10px; border:none'><span></a><div class='media-body' id='module_"+system.sid+"_"+module.sid+"'><h4 class='media-heading'> <div class='checkbox m-checkbox mgtop0'> <div class='pull-left maoye-icon'><img src='"+Com_Parameter.StaticPath+"/images/jian.png'></div> <div class='pull-left'><i class='fl'><input type='checkbox' disabled='true' "+moduleChecked+"></i> <span class='fl'>"+module.moduleName+"</span></div></div></h4></div></div>");
					
				
					drawPermissions(system,module);	
					
					drawSubModules(system,module);
					
					})
			}


		function drawSubModules(system,module){
				$.each(module.moduleModels, function(index, subModule) {
			     var subModuleChecked=""
				 if(subModule.checked){
					subModuleChecked="checked";
				 }
	
			       $("#module_"+system.sid+"_"+module.sid).append("<section class='maoye-checkbox'><div class='media maoye-media'><a href='#'class='pull-left'><span  class='media-object' style='width:14px; height: 10px; border:none'><span></a><div class='media-body' id='module_"+system.sid+"_"+subModule.sid+"'><h4 class='media-heading'> <div class='checkbox m-checkbox mgtop0'> <div class='pull-left maoye-icon'><img src='"+Com_Parameter.StaticPath+"/images/jian.png'></div> <div class='pull-left'><i class='fl'><input type='checkbox' disabled='true' "+subModuleChecked+"></i> <span class='fl'>"+subModule.moduleName+"</span></div></div></h4> </div></div></section>");
				
				   drawSubModules(system,subModule);
				   drawPermissions(system,subModule);		
				})
			}


		function drawPermissions(system,module){

			 if(module.permissionModels&&module.permissionModels.length>0){
				  $("#module_"+system.sid+"_"+module.sid).append("<section class='maoye-checkbox' ><table width='100%' border='0' cellspacing='0' cellpadding='0' id='modulepermission_"+system.sid+"_"+module.sid+"'></table> </section>");	
			 }
				 $.each(module.permissionModels, function(index, permission) {
					 var permissionChecked=""
					 if(permission.checked){
						permissionChecked="checked";
					 }
                       
						if(index%4==0){
							$("#modulepermission_"+system.sid+"_"+module.sid).append("<tr>");
						}
					$("#modulepermission_"+system.sid+"_"+module.sid+" tr:last-child").append("<td><label><input type='checkbox'  disabled='true' "+permissionChecked+">" +permission.name+"</label></td> &nbsp;");

				 })
		}
		function  loadRolePermission(roleId){
             $("#subsystemPanel").empty();
			 $.ajax({
			 type:"GET",
		     url:Com_Parameter.ContextPath+ "/authorizeMgt/getRoleRes",
		     data:{"roleId":roleId},
			 dataType: "json",
			 success:function(data) {
             $("#subsystemPanel").show();
				     //子系统
					 $.each(data, function(index, system) {
                 	
                         var systemChecked=""
						 if(system.checked){
						    systemChecked="checked";
						 }
                         $("#subsystemPanel").append("<div class='media-body maoye-mbody'  id='system_"+system.sid+"'> <h4 class='media-heading'> <div class='checkbox m-checkbox mgtop0'>		 <div class='pull-left maoye-icon-parent'><img src='"+Com_Parameter.StaticPath+"/images/jia.png'></div> <div class='pull-left'> <i class='fl'><input type='checkbox' disabled='true' "+systemChecked+"></i> <span class='fl'>"+system.name+"</span> </div> </div></h4> </div>");
                         drawModules(system);
						
				  });

						var _this=$(".media-heading");
						var content=$(".maoye-checkbox");
						_this.find(".maoye-icon").click(function(){
							if($(this).parent().parent().siblings(".maoye-checkbox").is(":visible")){
								$(this).find("img").attr("src",Com_Parameter.StaticPath+"/images/jia.png");
								$(this).parent().parent().siblings(".maoye-checkbox").hide();
								}else{
								$(this).find("img").attr("src",Com_Parameter.StaticPath+"/images/jian.png");
								$(this).parent().parent().siblings(".maoye-checkbox").show();
								}
							});
							
							$(".maoye-mbody").find(".maoye-icon-parent").parent().parent().siblings().hide();
							$(".maoye-mbody").find(".maoye-icon-parent").click(function(){
								if($(this).parent().parent().siblings().is(":visible")){
								$(this).find("img").attr("src",Com_Parameter.StaticPath+"/images/jia.png");
								$(this).parent().parent().siblings().hide();
								}else{
								$(this).find("img").attr("src",Com_Parameter.StaticPath+"/images/jian.png");
								$(this).parent().parent().siblings().show();
								}
								})

					 },
					 error: function (msg) {
						 $.jBox.alert("查询权限失败", '提示');	
					 }
					 })
		 }
		
})
		//子窗口回传值
	function getDialogValue(id,name)
	{
			$('#userId').val(id);	
			$('#userName').val(name);
	}
$().ready(function() {

  $("#errortips").empty();
  $("#errortips").hide();
})