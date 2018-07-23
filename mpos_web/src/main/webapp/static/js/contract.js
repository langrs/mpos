

//*******************table 数字校验*******************************
function vailFloatNumberLimitDecimalPoint(evnt,obj){
		 evnt=evnt||window.event;
		 var keyCode=window.event?evnt.keyCode:evnt.which;
		 if(obj.value.indexOf(".")!=-1 && keyCode==46) return false;
		 return keyCode>=48&&keyCode<=57||keyCode==46||keyCode==8;
}

//*****************************************************
	function getUrl(tag,url){ 
		  $('#contractBrand').attr("src",url);
	}
	//*****************************************************	
	function changeSelect(id,value){
		$(""+id+"").val(value);
	}
	
	//*****************************************************
	
	var list = Array();
	var itemList=Array();
	var assbaseItemsList =Array();
	var _removeBarndList = Array();
	var _removeAssBaseList= Array();
	var _removeAssitemsList=Array();
/**************删除数组**************/
	  Array.prototype.remove=function(dx)
	  {

	    if(isNaN(dx)||dx>this.length){return false;}
	    for(var i=0,n=0;i<this.length;i++)
	    {
	        if(this[i]!=this[dx])
	        {
	            this[n++]=this[i]
	        }
	    }
	    this.length-=1
	  }
/**************************/
	  

/**************************************/	  
$(function(){
		for(var i=0; i<num; i++){
			list.push(i);
		}
		for(var i=0; i<num_items; i++){
			itemList.push(i);
		}
		for(var i=0; i<num_base; i++){
			assbaseItemsList.push(i);
		}
	$("#save").click(function(e){
		if($("#contractForm").valid()==false){
			if ( !$('#startDate').val() ) {
				$("#startDateMessage").text("开始日期不能为空，请输入");
			}
			if ( !$('#endDate').val() ) {
				$("#endDateMessage").text("结束日期不能为空，请输入");
			}
			return
		}
		if ( !$('#startDate').val() ) {
			$("#startDateMessage").text("开始日期不能为空，请输入");
			return;
		}
		if ( !$('#endDate').val() ) {
			$("#endDateMessage").text("结束日期不能为空，请输入");
			return;
		}
		var jsonStr = "";
		var json ="";
		var _jsonConmmWhere="";
		var _jsonBaseWhere="";
		var jsonConmmWhere="";
		var jsonBaseWhere="";
		var contractName="";
	//********************************************************************
		if(list.length!=0){
			jsonStr = "[";
			for(var i=0; i< list.length; i++){
				var brandCName=$("#brandCName"+list[i]).attr("value");  
				var brandEName=$("#brandEName"+list[i]).attr("value"); 
				contractName+=!isNaN(brandCName)?brandCName:brandEName+"-";
				jsonStr+=brandToJson(list[i]);
			}
		    json =jsonStr.substr(0, jsonStr.length-1);
			json += "]";
		}
		//********************************************************************
		if(itemList.length!=0){
			jsonConmmWhere="[";
			for(var i=0; i< itemList.length; i++){
			   _jsonConmmWhere+=itemsToJson(itemList[i]);
			}
		  jsonConmmWhere =jsonConmmWhere+_jsonConmmWhere.substr(0, _jsonConmmWhere.length-1)
		  jsonConmmWhere += "]";
		}
		//********************************************************************
		if(assbaseItemsList.length!=0){
			_jsonBaseWhere="[";
				for(var i=0; i< assbaseItemsList.length; i++){
				        _jsonBaseWhere += baseToJson(assbaseItemsList[i])
				}
				jsonBaseWhere =_jsonBaseWhere.substr(0, _jsonBaseWhere.length-1);
				jsonBaseWhere += "]";
			}
		
		//**************************删除合同品牌信息************************************************************
		var remove_Barnd="";
		for(var i=0; i< _removeBarndList.length; i++){
			remove_Barnd=+_removeBarndList[i]+",";
			
		}
		//********************************************************************************
		var remove_AssBase="";
		for (var i = 0; i < _removeAssBaseList.length; i++) {
			remove_AssBase=+_removeAssBaseList[i]+",";
		}
		
		//**************************************************************
		var remove_Assitems="";
		for (var i = 0; i<_removeAssitemsList.length; i++) {
			remove_Assitems=+remove_Assitems[i]+",";
		}
		$('#subject').val(contractName);
		deleteContract="[";
		deleteContract+="{'brand':'"+remove_Barnd+"','assBase':'"+remove_AssBase+"','assitems':'"+remove_Assitems+"'}";
		deleteContract += "]";
		$('#contractForm').attr('action',""+contextpath+"/biz/contract/associated/save?jsonStr="+json+"&jsonConmmWhere="+jsonConmmWhere+"&jsonBaseWhere="+jsonBaseWhere+"&remove_Contact="+deleteContract);
		$("#contractForm").submit();
	});
  
	$("a[name='remove_brand']").click(function(){
     	 $("input[name='assbrandBox']:checked").each(function(){
			var $this = $(this);
			var rowIndex=$this.val();
			var assbrand_id=$("#assbrand_id"+rowIndex).attr("value")
			if(!isNaN(assbrand_id)||assbrand_id!=null){
				_removeBarndList.push(assbrand_id);
			}
			$this.closest('tr').remove()
			list.remove(rowIndex);
		})
	})
	
	$("a[name='remove_assbaseitems']").click(function(){
     	 $("input[name='assbaseitemsBox']:checked").each(function(){
			var $this = $(this);
			var rowIndex=$this.val();
			var assbaseitems_id=$("#assbaseitems_id"+rowIndex).attr("value");
			if(!isNaN(assbaseitems_id)||assbaseitems_id!=null){
			  _removeAssBaseList.push(assbaseitems_id);
			}
			$this.closest('tr').remove()
			assbaseItemsList.remove(rowIndex);
			
		})
	})
	
	$("a[name='remove_assitems']").click(function(){
     	 $("input[name='assitemsBox']:checked").each(function(){
			var $this = $(this);
			var rowIndex=$this.val();
			var assitems_id=$("#assitems_id"+rowIndex).attr("value");
			if(!isNaN(assitems_id)||assitems_id!=""){
			 _removeAssitemsList.push(assitems_id)
			}
			$this.closest('tr').remove()
			itemList.remove(rowIndex);	
		});
	});
	
	/*********************************/
	$("a[id='supplier']").click(function(){
		$("#supplierModal").load(contextpath+'/biz/contract/associated/getSupplierList',function(){  
			    $("#supplierModal").modal("show");  
			}); 
	});
	/*********************************/
	$("a[id='assbrands']").click(function(){
		$("#barndModal").load(contextpath+'/biz/contract/associated/addAssbrands',function(){  
			    $("#barndModal").modal("show");  
			}); 
	});
	/*********************************/
	$("a[id='add_assitems']").click(function(){
		$("#assitems").load(contextpath+'/biz/contract/associated/addAssitems',function(){  
			    $("#assitems").modal("show");  
			}); 
	});
	/*********************************/
	$("a[id='assbase']").click(function(){
		
		$("#assbasemodal").load(contextpath+'/biz/contract/associated/addModalBase',function(){  
			    $("#assbasemodal").modal("show");  
			}); 
	});
	
	/*********************************/
	$("a[id='edit_brand']").click(function(){
		var barndJson="";
		var rowIndex=0;
		 $("input[name='assbrandBox']:checked").each(function(){
				var $this = $(this);
				rowIndex=$this.val();
				barndJson+=brandToJson(rowIndex).substr(0, brandToJson(rowIndex).length-1).replace(/\s+/g,'');
			//	barndJson+="]";
			})
		var path =contextpath+'/biz/contract/associated/editAssbrand?assBrand='+barndJson+'&num='+rowIndex;
		$("#barndModal").load(path,function(){  
			    $("#barndModal").modal("show");  
		}); 
	});
	
	$("a[id='edit_base']").click(function(){
		var baseJson="";
		var rowIndex=0;
		 $("input[name='assbaseitemsBox']:checked").each(function(){
				var $this = $(this);
				rowIndex=$this.val();
				baseJson+=baseToJson(rowIndex).substr(0, baseToJson(rowIndex).length-1).replace(/\s+/g,'')
		})
		$("#assbasemodal").load(contextpath+'/biz/contract/associated/editModalBase?baseJson='+baseJson+'&num='+rowIndex,function(){  
		    $("#assbasemodal").modal("show");  
		}); 
	});
	
	$("a[id='edit_assitems']").click(function(){
		var itemsJson="";
		var rowIndex=0;
		 $("input[name='assitemsBox']:checked").each(function(){
				var $this = $(this);
				rowIndex=$this.val();
				itemsJson+=itemsToJson(rowIndex).substr(0, itemsToJson(rowIndex).length-1).replace(/\s+/g,'');
		})
		$("#assitems").load(contextpath+'/biz/contract/associated/editAssitems?itemsJson='+itemsJson+'&num='+rowIndex,function(){  
		    $("#assitems").modal("show");  
		}); 
	});
	
	
	$("#areaCoefficient").decimalinput();
	$("#contractArea").decimalinput();
	$("#guideAmount").decimalinput();

	
});

function updateBase(rowIndex){
    $("#isCompare_base"+rowIndex).val($("#isCompare").attr("value"));  
	$("#isGuarantee_base"+rowIndex).val($("#isGuarantee").attr("value"));  
	$("#guaranteeType_base"+rowIndex).val($("#guaranteeType").attr("value"));  
	$("#guaranteeAmount_base"+rowIndex).val($("#guaranteeAmount").attr("value")); 
	$("#codeType_base"+rowIndex).val($("#codeType").attr("value")); 
	$("#lower_base"+rowIndex).val($("#lower").attr("value"));  
	$("#upper_base"+rowIndex).val($("#upper").attr("value"));  
	$("#startDate_base"+rowIndex).val($("#startDate_base").attr("value"));
	$("#endDate_base"+rowIndex).val($("#endDate_base").attr("value"));
	$("#validType_base"+rowIndex).val($("#validType").attr("value"));
	$("#countBase_base"+rowIndex).val($("#countBase").attr("value"));
	$("#deductType_base"+rowIndex).val($("#deductType").attr("value"));
	$("#payDate_base"+rowIndex).val($("#payDate").attr("value"));
	$("#remarks_base"+rowIndex).val($("#remarks_base").attr("value"));
	$("#deductRate_base"+rowIndex).val($("#deductRate").attr("value"));
	
	$("#isCompareBase_td"+rowIndex).html($("#isCompare option:selected").text());
	$("#isGuaranteeBase_td"+rowIndex).html($("#isGuarantee option:selected").text());
	$("#guaranteeTypeBase_td"+rowIndex).html($("#guaranteeType option:selected").text());
	$("#guaranteeAmount_td"+rowIndex).html($("#guaranteeAmount").attr("value"));
	$("#codeTypeBase_td"+rowIndex).html($("#codeType option:selected").text());
	$("#upperBase_td"+rowIndex).html($("#upper").attr("value"));
	$("#lowerBase_td"+rowIndex).html($("#lower").attr("value"));
	$("#deductRateBase_td"+rowIndex).html($("#deductRate").attr("value"));
	$("#startDateBase_td"+rowIndex).html($("#startDate_base").attr("value"));
	$("#endDateBase_td"+rowIndex).html($("#endDate_base").attr("value"));	
}
function baseToJson(rowIndex){
	var json="";
	var assbaseitems_id =$("#assbaseitems_id"+rowIndex).attr("value");
    var isCompare=$("#isCompare_base"+rowIndex).attr("value");  
	var isGuarantee=$("#isGuarantee_base"+rowIndex).attr("value");  
	var guaranteeType=$("#guaranteeType_base"+rowIndex).attr("value");  
	var guaranteeAmount=$("#guaranteeAmount_base"+rowIndex).attr("value"); 
	var codeType=$("#codeType_base"+rowIndex).attr("value"); 
	var lower=$("#lower_base"+rowIndex).attr("value");  
	var upper=$("#upper_base"+rowIndex).attr("value");  
	var startDate=$("#startDate_base"+rowIndex).attr("value");
	var endDate=$("#endDate_base"+rowIndex).attr("value");
	var validType=$("#validType_base"+rowIndex).attr("value");
	var countBase=$("#countBase_base"+rowIndex).attr("value");
	var deductType=$("#deductType_base"+rowIndex).attr("value");
	var payDate=$("#payDate_base"+rowIndex).attr("value");
	var remarks=$("#remarks_base"+rowIndex).attr("value");
	var deductRate=$("#deductRate_base"+rowIndex).attr("value");
	var barndId=$("#barndId_base"+rowIndex).attr("value");
	json +="{'id':'"+assbaseitems_id+"','isCompare':'"+isCompare+"','isGuarantee':'"+isGuarantee+"',"
	json+="'guaranteeType':'"+guaranteeType+"','guaranteeAmount':'"+guaranteeAmount+"','startDate':'"+startDate+"','endDate':'"+endDate+"',"
	json+="'validType':'"+validType+"','deductType':'"+deductType+"',"
	json+="'deductRate':'"+deductRate+"','countBase':'"+countBase+"','remarks':'"+remarks.replace(/\s+/g,'')+"',"
	json+="'codeType':'"+codeType+"',"
	json+="'lower':'"+lower+"','upper':'"+upper+"','payDate':'"+payDate+"','brandsId':'"+barndId+"'"
    json+="},"
	return json;
}

function updateItems(rowIndex){
	$("#assitems_id"+rowIndex).val($("#assitems_id").attr("value"));
	$("#deductItem_items"+rowIndex).val($("#deductItem").attr("value"));  
	$("#deductCate_items"+rowIndex).val($("#deductCate").attr("value"));  
	$("#amount_items"+rowIndex).val($("#amount").attr("value"));  
	$("#startDate_items"+rowIndex).val($("#startDate_items").attr("value")); 
	$("#endDate_items"+rowIndex).val($("#endDate_items").attr("value"));  
	$("#validType_items"+rowIndex).val($("#validType").attr("value"));  
	$("#countBase_items"+rowIndex).val($("#countBase").attr("value"));
	$("#deductType_items"+rowIndex).val($("#deductType").attr("value"));
	$("#deductCode_items"+rowIndex).val($("#deductCode").attr("value"));
	$("#taxRate_items"+rowIndex).val($("#taxRate_items").attr("value"));
	$("#taxRateCode_items"+rowIndex).val($("#taxRateCode_items").attr("value"));
	$("#remarks_items"+rowIndex).val($("#remarks_items").text());
	//TD
	$("#deductCodeIteme_td"+rowIndex).html($("#deductCode").attr("value"))
	$("#amountIteme_td"+rowIndex).html($("#amount").attr("value"))
	$("#startDateitems_td"+rowIndex).html($("#startDate_items").attr("value"))
	$("#endDateitems_td"+rowIndex).html($("#endDate_items").attr("value"))
	$("#validTypeitems_td"+rowIndex).html($("#validType option:selected").text());
	$("#countBaseitems_td"+rowIndex).html($("#countBase option:selected").text())
	$("#taxRateitems_td"+rowIndex).html($("#taxRate_items").attr("value"))
	
}
function itemsToJson(rowIndex){
	var json="";
	var assitems_id =$("#assitems_id"+rowIndex).attr("value");
	var deductItem=$("#deductItem_items"+rowIndex).attr("value");  
	var deductCate=$("#deductCate_items"+rowIndex).attr("value");  
	var amount=$("#amount_items"+rowIndex).attr("value");  
	var startDate=$("#startDate_items"+rowIndex).attr("value"); 
	var endDate=$("#endDate_items"+rowIndex).attr("value");  
	var validType=$("#validType_items"+rowIndex).attr("value");  
	var countBase=$("#countBase_items"+rowIndex).attr("value");
	var deductType=$("#deductType_items"+rowIndex).attr("value");
	var deductCode=$("#deductCode_items"+rowIndex).attr("value");
	var taxRate=$("#taxRate_items"+rowIndex).attr("value");
	var taxRateCode=$("#taxRateCode_items"+rowIndex).attr("value");
	var remarks=$("#remarks_items"+rowIndex).text();
	json += "{'id':'"+assitems_id+"','deductItem':'"+deductItem+"','deductCate':'"+deductCate+"',"
	json +="'amount':'"+amount+"','startDate':'"+startDate+"','endDate':'"+endDate+"',"
	json +="'validType':'"+validType+"','deductType':'"+deductType+"',"
	json +="'taxRate':'"+taxRate+"','taxRateCode':'"+taxRateCode+"','countBase':'"+countBase+"','remarks':'"+remarks+"','deductCode':'"+deductCode+"'"
    json +="},"
    
    return json;
	
}

function updateBrand(rowIndex){
	$("#brandId"+rowIndex).val($("#brandId").attr("value"));  
	$("#brandNo"+rowIndex).val($("#brandNo").attr("value"));  
	$("#brandCName"+rowIndex).val($("#brandCName").attr("value"));  
	$("#brandEName"+rowIndex).val($("#brandEName").attr("value")); 
	$("#brandLevel"+rowIndex).val($("#brandAttribute").attr("value"));  
	$("#brandAttribute" +rowIndex).val($("#brandAttribute").attr("value"));  
	$("#brandInviteHead" +rowIndex).val($("#brandInviteHead").attr("value"));
	$("#commodityCate" +rowIndex).val($("#commodityCate").attr("value"));
	$("#inviteCate"+rowIndex).val($("#inviteCate").attr("value"));
	$("#shop"+rowIndex).val($("#shop").attr("value"));
	$("#shopId"+rowIndex).val($("#shopId").attr("value"));
	$("#memberRateType"+rowIndex).val($("#memberRateType").attr("value"));
	$("#gcardDiscount"+rowIndex).val($("#gcardDiscount").attr("value"));
	$("#gcardDiscount2"+rowIndex).val($("#gcardDiscount2").attr("value"));
	$("#ocardDiscount2"+rowIndex).val($("#ocardDiscount2").attr("value"));
	$("#ocardDiscount"+rowIndex).val($("#ocardDiscount").attr("value"));
	
	
	$("#brandName_td"+rowIndex).html('<select  class="form-control"><option>'+$("#brandCName").attr("value")+'</option><option>'+$("#brandEName").attr("value")+'</option></select>');
	$("#inviteCate_td"+rowIndex).html($("#inviteCate").attr("value"));
	$("#commodityCate_td"+rowIndex).html($("#commodityCate").attr("value"));
	$("#brandInviteHead_td"+rowIndex).html($("#brandInviteHead").attr("value"));
	$("#shop_td"+rowIndex).html();

}
function brandToJson(rowIndex){
	var jsonStr="";
	var brandId=$("#brandId"+rowIndex).attr("value");  
	var brandNo=$("#brandNo"+rowIndex).attr("value");  
	var brandCName=$("#brandCName"+rowIndex).attr("value");  
	var brandEName=$("#brandEName"+rowIndex).attr("value"); 
	var brandLevel=$("#brandLevel"+rowIndex).attr("value");  
	var brandAttribute=$("#brandAttribute" +rowIndex).attr("value");  
	var brandInviteHead=$("#brandInviteHead" +rowIndex).attr("value");
	var commodityCate=$("#commodityCate" +rowIndex).attr("value");
	var inviteCate=$("#inviteCate"+rowIndex).attr("value");
	var shop=$("#shop"+rowIndex).attr("value");
	var shopId=$("#shopId"+rowIndex).attr("value");
	var  assbrand_id =$("#assbrand_id"+rowIndex).attr("value");
	var  memberRateType =$("#memberRateType"+rowIndex).attr("value");
	var  gcardDiscount =$("#gcardDiscount"+rowIndex).attr("value");
	var  gcardDiscount2 =$("#gcardDiscount2"+rowIndex).attr("value");
	var  ocardDiscount2 =$("#ocardDiscount2"+rowIndex).attr("value");
	var  ocardDiscount =$("#ocardDiscount"+rowIndex).attr("value");
	jsonStr += "{'id':'"+assbrand_id+"','brandEName':'"+brandEName+"','brandCName':'"+brandCName+"','brandAttribute':'"+brandAttribute+"','brandNo':'"+brandNo+"',"
	jsonStr +="'brandId':'"+brandId+"','brandLevel':'"+brandLevel+"','memberRateType':'"+memberRateType+"',"
	jsonStr +="'gcardDiscount':'"+gcardDiscount+"','gcardDiscount2':'"+gcardDiscount2+"','ocardDiscount2':'"+ocardDiscount2+"','ocardDiscount':'"+ocardDiscount+"',"
	jsonStr +="'commodityCate':'"+commodityCate+"','inviteCate':'"+inviteCate+"','brandInviteHead':'"+brandInviteHead+"',";
	jsonStr+="'assbsh':[{";
	jsonStr+="'brandId':'123123'";
	jsonStr+="}]";
	jsonStr+="},";
	return jsonStr;
}

//*****************************************************	
function btnBaseOk_click() {
	var baseWherHight = $("#contractBaseWhere_tab").height();
	alert($("#operate_base").attr("value"))
	//  动态添加行 
	if($("#operate_base").attr("value")=='edit'){
		updateBase($("#base_seq").attr("value"));
		
	}else{
	    var isCompare=$("#isCompare").attr("value");  
		var isGuarantee=$("#isGuarantee").attr("value");  
		var guaranteeType=$("#guaranteeType").attr("value");  
		var guaranteeAmount=$("#guaranteeAmount").attr("value"); 
		var codeType=$("#codeType").attr("value"); 
		var lower=$("#lower").attr("value");  
		var upper=$("#upper").attr("value");  
		var startDate=$("#startDate_base").attr("value");
		var endDate=$("#endDate_base").attr("value");
		var validType=$("#validType").attr("value");
		var countBase=$("#countBase").attr("value");
		var deductType=$("#deductType").attr("value");
		var payDate=$("#payDate").attr("value");
		var remarks=$("#remarks_base").attr("value");
		var deductRate=$("#deductRate").attr("value");
		var barndId_base=$("#barndId_base").attr("value");
		var brandHight = $("#contractBrand_tab").height();
	    var newRow = document.createElement ("tr");   
	    var newTd0 = document.createElement ("td"); 
	    newTd0.setAttribute ("class","o-l-tab-ckb");
	    var newTd1 = document.createElement ("td");     
	    newTd1.setAttribute ("class","o-l-tab-ckb");
	    newTd1.setAttribute ("id","isCompareBase_td"+num);  //
	    var newTd2 = document.createElement ("td");
	    newTd2.setAttribute ("id","isGuaranteeBase_td"+num);  //
	    newTd2.setAttribute ("class","o-l-tab-ckb");
	    var newTd3 = document.createElement ("td");
	    newTd3.setAttribute ("id","guaranteeTypeBase_td"+num);  //
	    newTd3.setAttribute ("class","o-l-tab-ckb");
	    var newTd4 = document.createElement ("td");   
	    newTd4.setAttribute ("id","guaranteeAmount_td"+num);  //
	    newTd4.setAttribute ("class","o-l-tab-ckb");
	    var newTd5 = document.createElement ("td");  
	    newTd5.setAttribute ("id","codeTypeBase_td"+num);  //
	    newTd5.setAttribute ("class","o-l-tab-ckb"); 
	    var newTd6 = document.createElement ("td");  
	    newTd6.setAttribute ("class","o-l-tab-ckb");
	    newTd6.setAttribute ("id","upperBase_td"+num);  //
	    var newTd7 = document.createElement ("td"); 
	    newTd7.setAttribute ("class","o-l-tab-ckb");
	    newTd7.setAttribute ("id","lowerBase_td"+num);  //
	    var newTd8 = document.createElement ("td"); 
	    newTd8.setAttribute ("class","o-l-tab-ckb");
	    newTd8.setAttribute ("id","deductRateBase_td"+num);  //
	    var newTd9 = document.createElement ("td"); 
	    newTd9.setAttribute ("class","o-l-tab-ckb");
	    newTd9.setAttribute ("id","startDateBase_td"+num);  //
	    var newTd10 = document.createElement ("td");
	    newTd10.setAttribute ("class","o-l-tab-ckb");
	    newTd10.setAttribute ("id","endDateBase_td"+num);  //
	//    var newTd11 = document.createElement ("td");
	//    newTd11.setAttribute ("class","o-l-tab-ckb");
	//    var newTd12 = document.createElement ("td");
	//    newTd12.setAttribute ("class","o-l-tab-ckb");
	//    var newTd13 = document.createElement ("td");
	//    newTd13.setAttribute ("class","o-l-tab-ckb");
	//    var newTd14 = document.createElement ("td");
	//    newTd14.setAttribute ("class","o-l-tab-ckb");
	//    var newTd15 = document.createElement ("td");
	//    newTd15.setAttribute ("class","o-l-tab-ckb");
	    //  动态添加内容  
	    
	    newTd0.innerHTML = '<div class="input-group">'
	    					+'<input type="checkBox" name="assbaseitemsBox"  value="'+num_base+'" />'
	    					+'<input type="hidden" id="assbaseitems_id'+num_base+'" /></div>'
	    					+'<input type="hidden" class="form-control"  id="isCompare_base'+num_base+'"  value="'+isCompare+'"    />'
	    					+'<input type="hidden" class="form-control"  id="isGuarantee_base'+num_base+'"   value="'+isGuarantee+'"    />'
	    					+'<input type="hidden" class="form-control"  id="guaranteeType_base'+num_base+'"    value="'+guaranteeType+'"  />'
	    					+'<input type="hidden" class="form-control"  id="guaranteeAmount_base'+num_base+'"   value="'+guaranteeAmount+'"   />'
	    					+'<input type="hidden" class="form-control"  id="codeType_base'+num_base+'"  value="'+codeType+'" />'
	    					+'<input type="hidden" class="form-control"  id="lower_base'+num_base+'"  value="'+lower+'"   />'
	    					+'<input type="hidden" class="form-control"  id="upper_base'+num_base+'"  value="'+upper+'"   />'
	    					+'<input type="hidden" class="form-control"  id="startDate_base'+num_base+'"  value="'+startDate+'"  />'
	    					+'<input type="hidden" class="form-control"  id="endDate_base'+num_base+'"    value="'+endDate+'"  />'
	    					+'<input type="hidden" class="form-control"  id="validType_base'+num_base+'" value="'+validType+'"  />'
	    					+'<input type="hidden" class="form-control" id="countBase_base'+num_base+'"   value="'+countBase+'"   />'
	    					+'<input type="hidden" class="form-control" id="deductType_base'+num_base+'"   value="'+deductType+'"  />'
	    					+'<input type="hidden" class="form-control" id="payDate_base'+num_base+'"  value="'+payDate+'"   />'
	    					+'<input type="hidden" class="form-control" id="remarks_base'+num_base+'"  value="'+remarks+'"   />'
	    					+'<input type="hidden" class="form-control" id="deductRate_base'+num_base+'"  value="'+deductRate+'"  />'
	    					+'<input type="hidden" class="form-control" id="barndId_base'+num_base+'"  value="'+barndId_base+'"  />'
	    					
	    newTd1.innerHTML =$("#isCompare option:selected").text();
	    newTd2.innerHTML =$("#isGuarantee option:selected").text();
	    newTd3.innerHTML =$("#guaranteeType option:selected").text();
	    newTd4.innerHTML =guaranteeAmount;
	    newTd5.innerHTML =$("#codeType option:selected").text() ;
	    newTd6.innerHTML =upper ;
	    newTd7.innerHTML =lower;
	    newTd8.innerHTML =deductRate ;
	    newTd9.innerHTML =startDate ;
	    newTd10.innerHTML = endDate;
	//    newTd11.innerHTML =validType ;
	//    newTd12.innerHTML =countBase;
	//    newTd13.innerHTML = deductType;
	//    newTd14.innerHTML =payDate;
	//    newTd15.innerHTML =remarks;
	    newRow.appendChild (newTd0);     
	    newRow.appendChild (newTd1);
	    newRow.appendChild (newTd2);
	    newRow.appendChild (newTd3);
	    newRow.appendChild (newTd4); 
	    newRow.appendChild (newTd5);
	    newRow.appendChild (newTd6);
	    newRow.appendChild (newTd7);
	    newRow.appendChild (newTd8);
	    newRow.appendChild (newTd9);
	    newRow.appendChild (newTd10);
	//    newRow.appendChild (newTd11);
	//    newRow.appendChild (newTd12);
	//    newRow.appendChild (newTd13);
	//    newRow.appendChild (newTd14);
	//    newRow.appendChild (newTd15);
		
	    document.getElementById("contractBaseWhere").appendChild (newRow);
	    
	    assbaseItemsList.push(num_base);
	    num_base++;
	    $("#contractBaseWhere_tab").height(baseWherHight+50)
	}
}

/**
*
*添加修改合同条款
*
****/
function btnItemsOk_click(){
	alert($("#operate_item").attr("value"))
	if($("#operate_item").attr("value")=='edit'){
		updateItems($("#item_seq").attr("value"));
		
	}else{
		var deductItem=$("#deductItem").attr("value");  
		var deductCate=$("#deductCate").attr("value");  
		var amount=$("#amount").attr("value");  
		var startDate_items=$("#startDate_items").attr("value"); 
		var endDate_items=$("#endDate_items").attr("value");  
		var validType=$("#validType").attr("value");  
		var countBase_items=$("#countBase").attr("value");
		var deductType=$("#deductType").attr("value");
		var deductCode=$("#deductCode").attr("value");
		var taxRate=$("#taxRate_items").attr("value");
		var taxRateCode=$("#taxRateCode").attr("value");
		var remarks_items=$("#remarks_items").text();
		var commnWhereHight = $("#contractCommnWhere_tab").height();
		//  动态添加行  
	    var newRow = document.createElement ("tr");  
	    //  动态创建列  
	     var newTd0 = document.createElement ("td"); 
	    newTd0.setAttribute ("class","o-l-tab-ckb");
	    var newTd1 = document.createElement ("td");     
	    newTd1.setAttribute ("class","o-l-tab-ckb");
	    newTd1.setAttribute ("id","deductCodeIteme_td"+num);
	    var newTd2 = document.createElement ("td");  
	    newTd2.setAttribute ("class","o-l-tab-ckb");
	    newTd2.setAttribute ("id","amountIteme_td"+num);
	    var newTd3 = document.createElement ("td");
	    newTd3.setAttribute ("class","o-l-tab-ckb");
	    newTd3.setAttribute ("id","startDateitems_td"+num);
	    var newTd4 = document.createElement ("td");   
	    newTd4.setAttribute ("class","o-l-tab-ckb");
	    newTd4.setAttribute ("id","endDateitems_td"+num);
	    var newTd5 = document.createElement ("td");  
	    newTd5.setAttribute ("id","validTypeitems_td"+num);
	    newTd5.setAttribute ("class","o-l-tab-ckb");
	    var newTd6 = document.createElement ("td");
	    newTd6.setAttribute ("id","countBaseitems_td"+num);
	    newTd6.setAttribute ("class","o-l-tab-ckb");
	    var newTd7 = document.createElement ("td"); 
	    newTd7.setAttribute ("id","taxRateitems_td"+num);
	    newTd7.setAttribute ("class","o-l-tab-ckb");
	 
	
	    //  动态添加内容  
	    
	    newTd0.innerHTML = '<input type="checkBox" name="assitemsBox" value="'+num_items+'" />'
	    					+'<input type="hidden" id="assitems_id'+num_items+'"  />'
	    					+'<input type="hidden" id="deductCode_items'+num_items+'" value="'+deductCode+'" />'
	    					+'<input type="hidden" id="deductItem_items'+num_items+'" value="'+deductItem+'" />'
	    					+'<input type="hidden" id="deductCate_items'+num_items+'" value="'+deductCate+'" />'
	    					+'<input type="hidden" id="amount_items'+num_items+'" value="'+amount+'" />'
	    					+'<input type="hidden" id="startDate_items'+num_items+'" value="'+startDate_items+'" />'
	    					+'<input type="hidden" id="endDate_items'+num_items+'" value="'+endDate_items+'" />'
	    					+'<input type="hidden" id="validType_items'+num_items+'" value="'+validType+'" />'
	    					+'<input type="hidden" id="countBase_items'+num_items+'" value="'+countBase_items+'" />'
	    					+'<input type="hidden" id="deductType_items'+num_items+'" value="'+deductType+'" />'
	    					+'<input type="hidden" id="taxRate_items'+num_items+'" value="'+taxRate+'" />'
	    					+'<input type="hidden" id="remarks_items'+num_items+'" value="'+remarks_items+'" />'
	    					+'<input type="hidden" id="taxRateCode_items'+num_items+'" value="'+taxRateCode+'" />'
	    
	    newTd1.innerHTML = deductCode;
	    newTd2.innerHTML = amount;
	    newTd3.innerHTML = startDate_items;
	    newTd4.innerHTML = endDate_items;
	    newTd5.innerHTML =  $("#validType option:selected").text();
	    newTd6.innerHTML =  $("#countBase option:selected").text();
	    newTd7.innerHTML = taxRate;
	  
	    newRow.appendChild (newTd0);     
	    newRow.appendChild (newTd1);
	    newRow.appendChild (newTd2);
	    newRow.appendChild (newTd3);
	    newRow.appendChild (newTd4); 
	    newRow.appendChild (newTd5);
	    newRow.appendChild (newTd6);
	    newRow.appendChild (newTd7);
	   
	    document.getElementById("contractCommnWhere").appendChild(newRow);
	    itemList.push(num_items);
	    num_items++;
	    $("#contractCommnWhere_tab").height(commnWhereHight+50);
	}
}

function btnBrandOk_click(){
	
	if($("#operate").attr("value")=='edit'){
		updateBrand($("#barnd_seq").attr("value"));
		
	}else{
		var brandId=$("#brandId").attr("value");  
		var brandNo=$("#brandNo").attr("value");  
		var brandCName=$("#brandCName").attr("value");  
		var brandEName=$("#brandEName").attr("value"); 
		var brandLevel=$("#brandLevel").attr("value");  
		var brandAttribute=$("#brandAttribute").attr("value");  
		var brandInviteHead=$("#brandInviteHead").attr("value");
		var commodityCate=$("#commodityCate").attr("value");
		var inviteCate=$("#inviteCate").attr("value");
		var shop=$("#shop").attr("value");
		var shopId=$("#shopId").attr("value");
		var  assbrand_id =$("#assbrand_id").attr("value");
		var  memberRateType =$("#memberRateType").attr("value");
		var  gcardDiscount =$("#gcardDiscount").attr("value");
		var  gcardDiscount2 =$("#gcardDiscount2").attr("value");
		var  ocardDiscount2 =$("#ocardDiscount2").attr("value");
		var  ocardDiscount =$("#ocardDiscount").attr("value");
		
		var brandHight = $("#contractBrand_tab").height();
	    var newRow = document.createElement ("tr");   
	    var newTd0 = document.createElement ("td"); 
	    newTd0.setAttribute ("class","o-l-tab-ckb");
	   
	    var newTd1 = document.createElement ("td");     
	    newTd1.setAttribute ("class","o-l-tab-ckb");
	    newTd1.setAttribute ("id","brandName_td"+num);
	    var newTd2 = document.createElement ("td");  
	    newTd2.setAttribute ("id","inviteCate_td"+num);
	    newTd2.setAttribute ("class","o-l-tab-ckb");
	    var newTd3 = document.createElement ("td");
	    newTd3.setAttribute ("id","commodityCate_td"+num);
	    newTd3.setAttribute ("class","o-l-tab-ckb");
	    var newTd4 = document.createElement ("td");
	    newTd4.setAttribute ("id","brandInviteHead_td"+num);
	    newTd4.setAttribute ("class","o-l-tab-ckb");
	    var newTd5 = document.createElement ("td"); 
	    newTd5.setAttribute ("id","shop_td"+num);
	    newTd5.setAttribute ("class","o-l-tab-ckb");
	    //  动态添加内容  
	    newTd0.innerHTML = '<input type="checkBox" name="assbrandBox" value="'+num+'"  />'
							+'<input type="hidden" id="assbrand_id'+num+'" value="'+assbrand_id+'" />'
							+'<input type="hidden" id="brandNo'+num+'" value="'+brandNo+'"/>'
							+'<input type="hidden" id="brandId'+num+'" value="'+brandId+'"/>'
							+'<input type="hidden" id="brandCName'+num+'" value="'+brandCName+'"/>'
							+'<input type="hidden" id="brandEName'+num+'" value="'+brandEName+'" />'
							+'<input type="hidden" id="brandLevel'+num+'" value="'+brandLevel+'" />'
							+'<input type="hidden" id="brandAttribute'+num+'" value="'+brandAttribute+'" />'
							+'<input type="hidden" id="inviteCate'+num+'" value="'+inviteCate+'" />'
							+'<input type="hidden" id="commodityCate'+num+'" value="'+commodityCate+'" />'
							+'<input type="hidden" id="brandInviteHead'+num+'" value="'+brandInviteHead+'" />'
							+'<input type="hidden" id="shop'+num+'" value="'+shop+'" />'
							+'<input type="hidden" id="memberRateType'+num+'" value="'+memberRateType+'" />'
							+'<input type="hidden" id="gcardDiscount'+num+'" value="'+gcardDiscount+'" />'
							+'<input type="hidden" id="gcardDiscount2'+num+'" value="'+gcardDiscount2+'" />'
							+'<input type="hidden" id="ocardDiscount2'+num+'" value="'+ocardDiscount2+'" />'
							+'<input type="hidden" id="ocardDiscount'+num+'" value="'+ocardDiscount+'" />'
	    newTd1.innerHTML = '<select  class="form-control"><option>'+brandCName+'</option><option>'+brandEName+'</option></select>';
	    newTd2.innerHTML = brandInviteHead;
	    newTd3.innerHTML = commodityCate;
	    newTd4.innerHTML = inviteCate;
	    newTd5.innerHTML = shop;
	    newRow.appendChild (newTd0);     
	    newRow.appendChild (newTd1);
	    newRow.appendChild (newTd2);
	    newRow.appendChild (newTd3);
	    newRow.appendChild (newTd4); 
	    newRow.appendChild (newTd5);
	    document.getElementById("tableBrand").appendChild (newRow);
	    list.push(num);
	    num++;
	    $("#contractBrand_tab").height(brandHight+50)
	}
}