/**
 * 行工具，用于自动添加行
 * <pre>
 * 	HTML:
 * 		<a href="javascript:void(0)" mrow>test1</a>
 * 		<a href="javascript:void(0)" id="link_test2">test2</a>
 * 		<table id="tbl_test"></table>
 * 	JAVASCRIPT:
 * 		$(document).ready(function(){
 * 			var config = {
 * 				template:'<tr><td>&nbsp;</td><td><a href="javascript:void(0)" mrow-del>delete</a></td></tr>',
 * 				placement:'first',
 * 				target:'table#tbl_test'
 * 			};//被mrow-del标记的DOM元素会注册删除<b>其所在行</b>事件
 * 			//test1
 * 			$.fn.mrow(config);
 * 			//test2
 * 			$("a#link_test2").mrow(config);
 * 		});
 * </pre>
 * Author: hedh
 * Last Modified: 2014-01-08
 */
(function($) {
	var Mrow = function(element, options) {
		this.init(element, options);
	};
	Mrow.PLACEMENT = {
		first : 'first',
		last : 'last'
	};
	Mrow.DEFAULTS = {
		/**
		 * 添加行模版文本
		 */
		template : undefined,
		/**
		 * jQuery表达式
		 */
		target : undefined,
		/**
		 * 添加行位置
		 */
		placement : Mrow.PLACEMENT.last,
		/**
		 * 初始化范围
		 */
		scope : document
	};
	Mrow.prototype.getDefaults = function() {
		return Mrow.DEFAULTS;
	};
	Mrow.prototype.getOptions = function(options) {
		options = $.extend({}, this.getDefaults(), options)
		return options;
	};
	Mrow.prototype.bind = function(element, options) {
		element.each(function() {
			var $this = $(this);
			$this.click(function() {
				var _tb;
				if (options.target) {
					_tb = $(options.target);
				} else {
					_tb = $this.closest("table");
				}
				if (_tb.size()) {
					var _tbd = _tb.find("tbody");
					_tbd = _tbd.size() ? _tbd : _tb;
					var _fst = _tbd.find("tr:first"),_temp;
					_temp = options.template?$(options.template):_fst.clone();
					switch (options.placement) {
					case Mrow.PLACEMENT.first:
						if (_fst.size()) {
							_temp.insertBefore(_fst);
						} else {
							_temp.appendTo(_tbd);
						}
						$.fn.mrow({
							scope : _temp
						});
						break;
					case Mrow.PLACEMENT.last:
						if (_temp.size()) {
							_temp.appendTo(_tbd);
						}
						$.fn.mrow({
							scope : _temp
						});
						break;

					default:
						break;
					}
				}
			});
		});
	};
	Mrow.prototype.init = function(element, options) {
		options = this.getOptions(options);
		if (element.size()) {
			this.bind(element, options);
		} else {
			element = $("[mrow]", options.scope || document);
			if (element.size()) {
				this.bind(element, options);
			}
			$("[mrow-del]", options.scope || document).click(function() {
				$(this).closest("tr").remove();
			});
		}
	};
	$.fn.mrow = function(options) {
		new Mrow(this, options);
	};
	$.fn.mrow.Constructor = Mrow;
})(jQuery);