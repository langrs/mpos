<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<%@ include file="/WEB-INF/views/include/head.jsp" %>
<html>
<head>
    <title>积分兑换</title>
<body ontouchstart="" screen_capture_injected="true">
<header class="ui-header ui-header-positive ui-border-b" style="background-color: #078CDB;">
    <i class="ui-icon-return" onclick="history.back()"></i>
    <h1>积分兑换 </h1>
    <i class="ui-icon-home" style="position: absolute; top: 0px; right: 2px; "></i>
</header>
<section style=" height: 22px;"></section>
<script>
    $('.ui-icon-home').click(function () {
        location.href = yturl("/user/home.do");
    });
</script>
<footer class="ui-footer ui-footer-stable"
        style="background-color: rgba(0, 0, 0, 0.8); color: #fff; height: 30px; padding-top: 13px; padding-bottom: 13px; ">
    <div class="ui-row-flex ui-whitespace" style="height: 30px; line-height: 30px; text-align: center;">
        <div class="ui-col ui-col-3">
            礼品数
            <em id="em_num">0</em>
            <span style="border-left:solid 1px #fff;margin-left:2px;padding-left:2px;">
                总积分
                <em id="em_total">0</em>
            </span>
        </div>
        <div class="ui-col ui-col-2">
            <button id="btn_exchange" class="ui-btn ui-btn-primary">
                立即兑换
            </button>
        </div>
    </div>
</footer>
<section class="ui-container" style=" border-top-width: 30px;">
    <section id="grid">
        <div class="demo-item">
            <div class="demo-block">
                <ul class="ui-list ui-list-text ui-border-tb">
                    <c:forEach items="${gift}" var="entity">
                        <li class="ui-border-t" style="border-bottom: solid 1px #E0DEDE;">
                            <h4 class="ui-nowrap">
                                <label class="ui-checkbox">
                                    <input type="checkbox" data-no="${entity.itemNo}"
                                           data-integral="${entity.needIntegral}" data-name="${entity.itemName}">
                                </label>
                                    ${entity.itemName}
                            </h4>
                            <div class="ui-txt-info">积分:${entity.needIntegral}</div>
                        </li>
                    </c:forEach>
                </ul>
            </div>
        </div>
    </section>
</section><!-- /.ui-container-->

<script>
    var storage = window.localStorage;
    var exchangeStorageName = ytpos.getStorageName("exchange");
    (function () {
        initexchange();//初始化绑定礼品
    })();
    //初始化绑定礼品
    function initexchange() {
        if (storage.getItem(exchangeStorageName)) {
            var obj = JSON.parse(storage.getItem(exchangeStorageName));
            for (var i = 0; i < obj.length; i++) {
                $("input[type=checkbox]").each(function () {
                    if ($(this).attr("data-no") == obj[i].no) {
                        $(this).prop("checked", true);
                    }
                });
            }
        }
        total();
    }

    $("input[type=checkbox]").click(function () {
        if ($(this).prop("checked") == false) {
            //写入本地存储
            if (storage.getItem(exchangeStorageName)) {
                var exchangeJson = JSON.parse(storage.getItem(exchangeStorageName));
                exchangeJson = deleteData(exchangeJson, $(this).attr("data-no"));
                storage.setItem(exchangeStorageName, JSON.stringify(exchangeJson));
            }
        }
        else {
            //写入本地存储
            if (storage.getItem(exchangeStorageName)) {
                var exchangeJson = JSON.parse(storage.getItem(exchangeStorageName));
                var itemJson = {
                    "no": $(this).attr("data-no"),
                    "integral": $(this).attr("data-integral"),
                    "itemname": $(this).attr("data-name")
                };
                exchangeJson.push(itemJson);
                storage.setItem(exchangeStorageName, JSON.stringify(exchangeJson));
            }
            else {
                var itemJson = [{
                    "no": $(this).attr("data-no"),
                    "integral": $(this).attr("data-integral"),
                    "itemname": $(this).attr("data-name")
                }];
                storage.setItem(exchangeStorageName, JSON.stringify(itemJson));
            }
        }
        total();//计算总积分
    });
    //计算总积分
    function total(obj,objname) {
        var num = 0;
        var integral = 0;
//        通过jquery循环所有的checkbox控件,获取选中的控件,然后统计选中数量和根据选中的控件的data-integral属性合计需要积分
        $("input[type=checkbox]").each(function () {
            if ($(this).prop("checked") == true) {
                integral += Number($(this).attr("data-integral"));
                num++;
            }
        });
//        将礼品数和总积分赋值给页面控件
        $("#em_num").html(num);
        $("#em_total").html(integral);
    }
    //从数组中删除
    function deleteData(objs,objname) {
        for(var i=0;i<objs.length;i++){
            var obj = objs[i];
            var nostr = obj.no;
            if(nostr == objname){
                objs.splice(i,1);
                break;
            }
        }
        return objs;
    }

    $("#btn_exchange").tap(function () {
        var num = 0;
        num = ytpos.toDec($("#em_num").html());
        if (num == 0)
            dialogMsg("请先选择要兑换的礼品！");
        else
            location.href = yturl('/user/createexchange.do');
    });
</script>


</body>
</html>