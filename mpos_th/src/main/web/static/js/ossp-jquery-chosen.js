/* ===========================================================
 * bootstrap-OChosen.js v1.0.0
 * Author : Jonathan Zhuang
 * Email : jonathan_zhuang@163.com
 * ========================================================== */

!function($) {

	"use strict"; // jshint ;_;

	/*
	 * OSSP CHOSEN PUBLIC CLASS DEFINITION ===============================
	 */

	var OChosen = function(element, options) {
		this.$element = $(element);
		this.options = options;
		this.options.multiple = $(element).attr("data-multiple") == "true"
				|| this.options.multiple;
		this.options.service = $(element).attr("data-service");
		this.init()
	}

	OChosen.prototype = {

		constructor : OChosen

		,
		init : function() {
			this.options.multiple ? this.initMultipleChosen()
					: this.initSingleChosen();
		}

		,
		initSingleChosen : function() {
			this.$element.chosen({});
		}

		,
		initMultipleChosen : function(element, options) {
			this.options.multiple ? alert("1") : alert("2");
			// //alert(element.multiple)
		}

	}

	/*
	 * OChosen PLUGIN DEFINITION =========================
	 */

	$.fn.OChosen = function(option) {
		return this.each(function() {
			var $this = $(this), data = $this.data('OChosen'), options = $
					.extend({}, $.fn.OChosen.defaults,
							typeof option == "object" && option)
			if (!data)
				$this.data('OChosen', (data = new OChosen(this, options)))
			if (typeof option == 'string')
				data[option]()
		})
	}

	$.fn.OChosen.Constructor = OChosen

	$.fn.OChosen.defaults = {
		multiple : false,
		placeholder : "==请选择==",
		service : ""
	}

	$(window).on('load', function() {
		$('[data-o-chosen="chosen"]').each(function() {
			var $chosen = $(this), options = {};
			$chosen.OChosen(options);
		})
	})

}(window.jQuery);