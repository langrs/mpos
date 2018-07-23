//打开和关闭div
	function openDiv(t, i) {
		switch (i) {
		case 1:
			var div1 = $(t).closest("div.maoye-mbody");
			div1.find("div.maoye-media").toggle();
			break;
		case 2:
			var div1 = $(t).closest("div.media-body");
			div1.find("section").toggle();
			break;

		}
	}