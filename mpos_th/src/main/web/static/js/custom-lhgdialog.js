/*selectType ='multi','single' single-单选 multi-多选
 *url='${contextPath}/dialog/dialogFrame?selectObj=4&orgId='+orgId;
 *selectObj=1234 1-组织 2-岗位 3-人员 4-账户 23-岗位+人员
 *orgId-机构id
 *structureId-组织id 可以为空,如果为空查询机构下的所有行政组织,如果不为空根据组织id追溯到根节点
 */
function showDialog(url,title,selectType)
{
	var width
	var height
	if(selectType=='single')
	{
		width = 525;
		height= 482;
	}
	else
	{
		width = 698;
		height= 482;
	}
	var demoDG1 = $.dialog({		
	 skin: '',
     title:title, 
     width:width,
     height:height,
     content:'url:'+url+'&selectType='+selectType, 
     lock:true,
	 Drag:false,
	 ok:true,
	 cancel:true,
	 min:false,
	 max:true, 
	 padding:0,
	 fixed:true,	
	 top:50,		
  });	
}

/**
 * 角色对话框
 * @param title
 * @param orgId
 */
function roleDialog(url)
{
	 var demoDG1 = $.dialog({		
	 skin: '',
     title:'角色对话框', 
     width:485,
     height:410,
     content:'url:'+url, 
     lock:true,
	 Drag:false,
	 ok:true,
	 cancel:true,
	 min:false,
	 max:true, 
	 padding:0,
	 fixed:true,	
	 top:50,
  });
}
