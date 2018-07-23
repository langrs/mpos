//			function YYYYMMDDstart()
//            {
//                MonHead = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
//
//                //先给年下拉框赋内容
//                var y   = new Date().getFullYear();
//                for (var i = (y-60); i < (y+1); i++) //以今年为准，前30年，后30年
//                    document.getElementById("sYear").options.add(new Option(" "+ i, i));
//
//                //赋月份的下拉框
//                for (var i = 1; i < 13; i++)
//                    document.getElementById("sMonth").options.add(new Option(" " + i, i));
//
//                document.getElementById("sYear").value = y;
//                document.getElementById("sMonth").value = new Date().getMonth() + 1;
//                var n = MonHead[new Date().getMonth()];
//                if (new Date().getMonth() ==1 && IsPinYear(YYYYvalue)) n++;
//                    writeDay(n); //赋日期下拉框
//                document.getElementById("sDate").value = new Date().getDate();
//            }
//            if(document.attachEvent){
//            	window.attachEvent("onload", YYYYMMDDstart);
//            }
//            else{
//            	window.addEventListener('load', YYYYMMDDstart, false);
//            }
                
            function YYYYDD(str) //年发生变化时日期发生变化(主要是判断闰平年)
            {
                var MMvalue = document.getElementById("sMonth").options[document.getElementById("sMonth").selectedIndex].value;
                if (MMvalue == ""){ var e = document.getElementById("sDate"); optionsClear(e); return;}
                var n = MonHead[MMvalue - 1];
                if (MMvalue ==2 && IsPinYear(str)) n++;
                    writeDay(n);
            }
            function MMDD(str)  //月发生变化时日期联动
            {
                var YYYYvalue = document.getElementById("sYear").options[document.getElementById("sYear").selectedIndex].value;
                if (YYYYvalue == ""){ var e = document.getElementById("sDate"); optionsClear(e); return;}
                var n = MonHead[str - 1];
                if (str ==2 && IsPinYear(YYYYvalue)) n++;
                    writeDay(n);
            }
            function writeDay(n)  //据条件写日期的下拉框
            {
                var e = document.getElementById("sDate"); optionsClear(e);
                for (var i=1; i<(n+1); i++)
                    e.options.add(new Option(" "+ i, i));
            }
            function YYYYDD1(str) //年发生变化时日期发生变化(主要是判断闰平年)
            {
            	var MMvalue = document.getElementById("sMonth_entryDate").options[document.getElementById("sMonth_entryDate").selectedIndex].value;
            	if (MMvalue == ""){ var e = document.getElementById("sDate_entryDate"); optionsClear(e); return;}
            	var n = MonHead[MMvalue - 1];
            	if (MMvalue ==2 && IsPinYear(str)) n++;
            	writeDay1(n);
            }
            
            function MMDD1(str)  //月发生变化时日期联动
            {
            	var YYYYvalue1 = document.getElementById("sYear_entryDate").options[document.getElementById("sYear_entryDate").selectedIndex].value;
            	if (YYYYvalue1 == ""){ var e = document.getElementById("sDate_entryDate"); optionsClear(e); return;}
            	var n = MonHead[str - 1];
            	if (str ==2 && IsPinYear(YYYYvalue1)) n++;
            	writeDay1(n);
            }
            function writeDay1(n)  //据条件写日期的下拉框
            {
            	var e = document.getElementById("sDate_entryDate"); optionsClear(e);
            	for (var i=1; i<(n+1); i++)
            		e.options.add(new Option(" "+ i, i));
            }
            function IsPinYear(year)//判断是否闰平年
            {  
                return(0 == year%4 && (year%100 !=0 || year%400 == 0));
            }
            function optionsClear(e)
            {
                e.options.length = 1;
            }