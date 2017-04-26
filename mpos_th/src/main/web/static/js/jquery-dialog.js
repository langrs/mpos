/* ===========================================================
 * jquery-dialog.js v2.0.0
 * 1、v2.0.0增加组织架构选择
 * Author : 庄为亮
 * Email : jonathan_zhuang@163.com
 * ========================================================== */

!function($) {

	"use strict"; // jshint ;_;

	/*
	 * DIALOG PUBLIC CLASS DEFINITION ===============================
	 */

	var Dialog = function(element, options) {
		this.$element = $(element);
		this.options = options;
		this.options.idField = typeof $(element).attr("data-idField") == 'string'
				&& $(element).attr("data-idField") || this.options.idField;
		this.options.nameField = typeof $(element).attr("data-nameField") == 'string'
				&& $(element).attr("data-nameField") || this.options.nameField;
		this.options.multiple = $(element).attr("data-multiple") == 'true'
				&& true || this.options.multiple;
		this.options.service = typeof $(element).attr("data-service") == 'string'
				&& $(element).attr("data-service") || this.options.service;
		this.options.authType = typeof $(element).attr("data-authType") == 'string'
				&& $(element).attr("data-authType") || this.options.authType;
		this.init(element, options);
	}

	Dialog.prototype = {

		constructor : Dialog

		,
		init : function(element, options) {
			var $this = this;
			$this.$element = $(element);
			$this.options = options;
			var modalId = $this.$element.attr("id") + "Modal";
			$this.$element.attr("data-toggle", "modal").attr("data-target",
					"#" + modalId);
			var modalHTML = '<div class="modal fade" id="' + modalId
					+ '" tabindex="-1" data-backdrop="static" role="dialog" aria-labelledby="'
					+ modalId + 'Label" aria-hidden="true">';
			modalHTML += ' <div class="modal-dialog">';
			modalHTML += ' 	  <div class="modal-content">';
			modalHTML += '   	<div class="modal-header">';
			modalHTML += '   		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>';
			modalHTML += '   		<h4 class="modal-title" id="' + modalId
					+ 'Label">' + this.options.title + '</h4>';
			modalHTML += '   	</div>';
			modalHTML += '   	<div class="modal-body">';
			modalHTML += '   	</div>';
			modalHTML += '   	<div class="modal-footer">';
			modalHTML += '   		<button type="button" class="btn btn-primary" data-determine="modal">确定</button>';
			modalHTML += '   		<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>';
			modalHTML += '   	</div>';
			modalHTML += '   </div>';
			modalHTML += ' </div>';
			modalHTML += '</div>';
			$this.$element.after(modalHTML);
			$this.options.modal = $('#' + modalId);
			if (!$this.options.multiple){
				this.initSingleDialog();
			}else if($this.options.authType!=null && $this.options.authType != "GENERAL_POST"){
				this.initMultOrgDialog();
			}else if($this.options.authType == "GENERAL_POST"){
				$this.options.service = "generalPostDataService&isMultiple="+$this.options.multiple;
				this.initMultipleDialog();
			}else{
				this.initMultipleDialog();
			}
			// load data
			//$this.options.multiple ? this.initMultOrgDialog() : this
			//		.initSingleDialog();
			$this.options.modal.on('click.determine.modal',
					'[data-determine="modal"]', function() {
						if ($this.options.multiple) {
							var $selected = $("#" + $this.$element.attr("id")
									+ "Selected");
							var idField = "", nameField = "";
							$selected.find("option").each(
									function() {
										idField += $this.options.splitStr
												+ $(this).attr("value");
										nameField += $this.options.splitStr
												+ $(this).html();
									});
							if (idField != "") {
								idField = idField.substring(1);
								nameField = nameField.substring(1);
							}
							$this.options.selectedId = idField;
							$this.options.selectedName = nameField;
						}
						$("#" + $this.options.idField).val(
								$this.options.selectedId);
						$("#" + $this.options.nameField).val(
								$this.options.selectedName);
						$this.options.modal.modal('hide');
					});
		}

		,
		initSingleDialog : function() {
			var $this = this;
			if ($this.options.authType == "STRUCTURE")
				$this.options.service = "structureTreeService";
			else if ($this.options.authType == "POST")
				$this.options.service = "structureTreeService";
			else if ($this.options.authType == "GENERAL_POST")
				$this.options.service = "generalPostDataService&isMultiple="+$this.options.multiple;
			else if ($this.options.authType == "USER")
				$this.options.service = "structureTreeService";
			else if ($this.options.authType == "POST_USER")
				$this.options.service = "structureTreeService";
			else if ($this.options.authType == "ALL")
				$this.options.service = "structureTreeService";
			var zTreeId = this.$element.attr("id") + "ZTree";
			$this.options.modal.find('div[class="modal-body"]').append(
					'<ul id="' + zTreeId + '" data-dialogId="'
							+ this.$element.attr("id")
							+ '" class="ztree"><img src="'
							+ Com_Parameter.StaticPath
							+ '/images/loading.gif"></ul>');
			$this.options.modal.on('show.bs.modal', function(e) {
				$this.options.zTree == null
						&& $this.loadTreeData(zTreeId, $this);
				// $this.options.zTree.expandAll(true);
			});
		}

		,
		initMultOrgDialog : function() {
			var $this = this;
			if ($this.options.authType != "") {
				$this.options.service = "structureTreeService";
			}
			var zTreeId = this.$element.attr("id") + "ZTree";
			var selectHTML = '<div class="row">';
			selectHTML += ' <div class="col-xs-5">';
			selectHTML += ' 	<p>组织机构</p>';
			selectHTML += ' 	<ul id="'
					+ zTreeId
					+ '" data-dialogId="'
					+ $this.$element.attr("id")
					+ '" class="ztree" style="height: 300px;width: 100%;overflow: scroll;"><img src="'
					+ Com_Parameter.StaticPath + '/images/loading.gif"></ul>';
			selectHTML += ' </div>';
			selectHTML += ' <div class="col-xs-3">';
			selectHTML += ' 	<p>备选框</p>';
			selectHTML += ' 	<select id="'
					+ this.$element.attr("id")
					+ 'Alternative" multiple="multiple" size="10" style="height: 300px;width: 100%"></select>';
			selectHTML += ' </div>';
			selectHTML += ' <div class="col-xs-1" style="height: 100%;text-align: center;">';
			selectHTML += '   	<button class="btn btn-default" data-add-to="option" style="margin-top: 100px"><span class="glyphicon glyphicon-arrow-right"></span></button><br>';
			selectHTML += '   	<button class="btn btn-default" data-remove-to="option" style="margin-top: 10px"><span class="glyphicon glyphicon-arrow-left"></span></button>';
			selectHTML += ' </div>';
			selectHTML += ' <div class="col-xs-3">';
			selectHTML += ' 	<p>已选框</p>';
			selectHTML += '   	<select id="'
					+ this.$element.attr("id")
					+ 'Selected" multiple="multiple" size="10" style="height: 300px;width: 100%"></select>';
			selectHTML += ' </div>';
			selectHTML += '</div>';
			$this.options.modal.find('div[class="modal-body"]').append(
					selectHTML);
			$this.options.modal.find('div[class="modal-dialog"]').css('width',
					'800px');
			var $alternative = $("#" + $this.$element.attr("id")
					+ "Alternative");
			var $selected = $("#" + $this.$element.attr("id") + "Selected");
			$this.options.modal.on('show.bs.modal', function(e) {
				$this.options.zTree == null
						&& $this.loadTreeData(zTreeId, $this);
			});
			$this.options.modal.on('click', '[data-add-to="option"]',
					function() {
						$alternative.find("option:selected").each(
								function() {
									var $opt = $(this);
									$selected.append('<option value="'
											+ $opt.attr("value") + '">'
											+ $opt.html() + '</option>');
									$opt.remove();
								});
						return false;
					});
			$this.options.modal.on('click', '[data-remove-to="option"]',
					function() {
						$selected.find("option:selected").each(function() {
									var $opt = $(this);
									$alternative.append('<option value="'
											+ $opt.attr("value") + '">'
											+ $opt.html() + '</option>');
									$opt.remove();
								});
						return false;
					});
			$alternative.on('dblclick', 'option', function() {
				var $opt = $(this);
				if(!$this.options.multiple){
					$alternative.append($selected.html());
					$selected.empty();
				}
				$selected.append('<option value="' + $opt.attr("value") + '">'
						+ $opt.html() + '</option>');
				$opt.remove();
				
			});
			$selected.on('dblclick', 'option', function() {
				var $opt = $(this);
				$alternative.append('<option value="' + $opt.attr("value")
						+ '">' + $opt.html() + '</option>');
				$opt.remove();
			});
		}

		,
		initMultipleDialog : function() {
			var $this = this;
			var selectHTML = '<div class="row">';
			selectHTML += ' <div class="col-xs-5">';
			selectHTML += ' 	<p>备选框</p>';
			selectHTML += ' 	<select id="'
					+ this.$element.attr("id")
					+ 'Alternative" multiple="multiple" size="10" style="height: 300px;width: 100%"></select>';
			selectHTML += ' </div>';
			selectHTML += ' <div class="col-xs-2" style="height: 100%;text-align: center;">';
			selectHTML += '   	<button class="btn btn-default" data-add-to="option" style="margin-top: 100px"><span class="glyphicon glyphicon-arrow-right"></span></button><br>';
			selectHTML += '   	<button class="btn btn-default" data-remove-to="option" style="margin-top: 10px"><span class="glyphicon glyphicon-arrow-left"></span></button>';
			selectHTML += ' </div>';
			selectHTML += ' <div class="col-xs-5">';
			selectHTML += ' 	<p>已选框</p>';
			selectHTML += '   	<select id="'
					+ this.$element.attr("id")
					+ 'Selected" multiple="multiple" size="10" style="height: 300px;width: 100%"></select>';
			selectHTML += ' </div>';
			selectHTML += '</div>';
			$this.options.modal.find('div[class="modal-body"]').append(
					selectHTML);
			var $alternative = $("#" + $this.$element.attr("id")
					+ "Alternative");
			var $selected = $("#" + $this.$element.attr("id") + "Selected");
			$this.options.modal.on('show.bs.modal', function(e) {
				if ($this.options.data == null) {
					$.getJSON(Com_Parameter.ContextPath
							+ "/getDataList?s_bean="
							+ $this.options.service, function(data) {
						$this.options.data = data;
						$.each(data, function(index, val) {
							$alternative.append('<option value="' + val.id
									+ '">' + val.name + '</option>');
						});
					});
				}
			});
			$this.options.modal.on('click', '[data-add-to="option"]',
					function() {
						$alternative.find("option:selected").each(
								function() {
									var $opt = $(this);
									$selected.append('<option value="'
											+ $opt.attr("value") + '">'
											+ $opt.html() + '</option>');
									$opt.remove();
								});
						return false;
					});
			$this.options.modal.on('click', '[data-remove-to="option"]',
					function() {
						$selected.find("option:selected").each(
								function() {
									var $opt = $(this);
									$alternative.append('<option value="'
											+ $opt.attr("value") + '">'
											+ $opt.html() + '</option>');
									$opt.remove();
								});
						return false;
					});
			$alternative.on('dblclick', 'option', function() {
				var $opt = $(this);
				$selected.append('<option value="' + $opt.attr("value") + '">'
						+ $opt.html() + '</option>');
				$opt.remove();
			});
			$selected.on('dblclick', 'option', function() {
				var $opt = $(this);
				$alternative.append('<option value="' + $opt.attr("value")
						+ '">' + $opt.html() + '</option>');
				$opt.remove();
			});
		}

		,
		zTreeOnCheck : function(event, treeId, treeNode) {
			var $zTree = $("#" + treeId);
			var $dialog = $("#" + $zTree.attr("data-dialogId")).data('Dialog');
			if ($dialog.options.multiple) {

			} else {
				$dialog.options.selectedId = treeNode.id;
				$dialog.options.selectedName = treeNode.name;
			}
		}

		,
		zTreeOnClick : function(event, treeId, treeNode) {
			var $zTree = $("#" + treeId);
			var $dialog = $("#" + $zTree.attr("data-dialogId")).data('Dialog');
			var param = (treeNode.id + "").split("|");
			if (param.length == 1) {
				$dialog.getOrgDataList(treeNode, $dialog);
			}
		}

		,
		zTreeOnDblClick : function(event, treeId, treeNode) {
			var $zTree = $("#" + treeId);
			var $selected = $("#" + $zTree.attr("data-dialogId") + "Selected");
			if ($selected.find('option[value="' + treeNode.id + '"]').length == 0)
				$selected.append('<option value="' + treeNode.id + '">'
						+ treeNode.name + '</option>');
		}

		,
		loadTreeData : function(zTreeId, dialogObj) {
			var chkStyle = dialogObj.options.multiple ? "checkbox" : "radio";
			var checkEnable = dialogObj.options.multiple ? false : true;
			var setting = {
				check : {
					enable : checkEnable,
					chkStyle : chkStyle,
					radioType : "all"
				},
				data : {
					simpleData : {
						enable : true
					}
				},
				view : {
					expandSpeed : ""
				},
				callback : {
					onCheck : dialogObj.zTreeOnCheck,
					onClick : dialogObj.zTreeOnClick

				}
			};
			// var url = Com_Parameter.ContextPath + "/common/getJson";
			$.getJSON(Com_Parameter.ContextPath + "/getDataList?s_bean="
					+ dialogObj.options.service, function(data) {
				dialogObj.options.zTree = $.fn.zTree.init($("#" + zTreeId),
						setting, data);
				var nodes = dialogObj.options.zTree.getNodes();
				if (nodes.length > 0) {
					dialogObj.options.zTree.expandNode(nodes[0], true, false,
							false);
				}
			});
		}

		,
		getOrgDataList : function(treeNode, dialogObj) {
			var $alternative = $("#" + dialogObj.$element.attr("id")
					+ "Alternative");
			$.getJSON(Com_Parameter.ContextPath
					+ "/getDataList?s_bean=orgDataService&authType="
					+ dialogObj.options.authType + "&structureId="
					+ treeNode.id, function(data) {
				$alternative.empty();
				$.each(data, function(index, val) {
					$alternative.append('<option value="' + val.id + '">'
							+ val.name + '</option>');
				});
			});
		}
	}

	/*
	 * Dialog PLUGIN DEFINITION =========================
	 */

	$.fn.Dialog = function(option) {
		return this.each(function() {
			var $this = $(this), data = $this.data('Dialog'), options = $
					.extend({}, $.fn.Dialog.defaults, typeof option == "object"
							&& option)
			if (!data)
				$this.data('Dialog', (data = new Dialog(this, options)))
			if (typeof option == 'string')
				data[option]()
		})
	}

	$.fn.Dialog.Constructor = Dialog

	$.fn.Dialog.defaults = {
		idField : null,
		nameField : null,
		multiple : false,
		splitStr : ";",
		title : "对话框",
		service : "",
		authType : null,// 组织架构对话框类型：（STRUCTURE:组织）、（GENERAL_POST:通用岗位）、（POST:岗位）、（USER:用户）、（POST_USER:岗位和用户）、（ALL:所有，包括组织、岗位和用户）
		// ====以下属性方法仅供内部使用，控件初始化后请勿调用======
		zTree : null,
		modal : null,
		data : null,
		selectedId : "",
		selectedName : ""
	}

	$(window).on('load', function() {
		$('[data-dialog="dialog"]').each(function() {
			var $dialog = $(this), options = {};
			$dialog.Dialog(options);
		})
	})

}(window.jQuery);