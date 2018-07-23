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
    <h1>兑换礼品 </h1>
    <i class="ui-icon-home" style="position: absolute; top: 0px; right: 2px; "></i>
</header>
<section style=" height: 22px;"></section>
<script>
    $('.ui-icon-home').click(function () {
        location.href = yturl("/user/home.do");
    });
</script>
<section class="ui-container">
    <section id="list">
        <div class="demo-item">
            <div class="demo-block">
                <ul class="ui-list ui-list-text ui-border-tb">
                    <li id="li_items" class="ui-border-t" style="padding-left: 15px;margin-left: 0px;">芙蓉王(购销)（所需积分<em>1000.00</em>）<br></li>
                    <li class="ui-border-t" style="padding-left: 15px;margin-left: 0px;">
                        总共所需积分<em id="em_total">1000</em>；可用积分<em id="em_available">${integralValue}</em><br>
                        <font id="font_msg" style="color: red;">很抱歉，您的积分不够</font>
                    </li>
                    <li class="ui-border-t" style="padding-left: 5px;margin-left: 0px;">
                        <font style="color: #1FBAF3;">
                            <i class="ui-icon-warn-block" style="font-size: 40px; color: #1FBAF3;"></i>
                            预兑换成功之后，请凭有效证件到门店<br>
                            领取， 领取之后，积分会自动扣除。
                        </font>
                    </li>
                </ul>
            </div>
        </div>
        <div class="demo-item" style=" margin-top: 30px; ">
            <div class="demo-block">
                <div class="ui-btn-wrap">
                    <input type="hidden" id="hid_branchno" value="00">
                    <button id="btn_exchange" class="ui-btn-lg ui-btn-primary" disabled="disabled">
                        立即兑换
                    </button>
                </div>
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
            var htmlstr = "";
            var total = 0;
            for (var i = 0; i < obj.length; i++) {
                htmlstr += obj[i].itemname + "（所需积分<em>" + obj[i].integral + "</em>）<br />";
                total += ytpos.toDec(obj[i].integral);
            }
            $("#li_items").html(htmlstr);
            $("#em_total").html(total);
            var have = ytpos.toDec($("#em_available").html());
            if (total > have) {
                $("#font_msg").css("display", "");
                $("#btn_exchange").attr("disabled", "disabled");
            }else {
                $("#font_msg").css("display", "none");
                $("#btn_exchange").attr("disabled", "");
            }
        }
    }

    $("#btn_exchange").tap(function () {
        var data = [];
        var have = ytpos.toDec($("#em_available").html());
        var total = 0;
        $("ul[data-id='item'] li").each(function () {
            var qty = ytpos.toDec($(this).find("[data-id='qty']").html());
            if (qty > 0) {
                var item = {};
                item.itemno = $(this).attr("data-id");
                item.qty = ytpos.toDec($(this).find("[data-id='qty']").html());
                item.integral = ytpos.toDec($(this).find("[data-id='integral']").html());
                total = total + item.qty * item.integral;
                data.push(item);
            }
        });
        if (storage.getItem(exchangeStorageName)) {
            var obj = JSON.parse(storage.getItem(exchangeStorageName));
            for (var i = 0; i < obj.length; i++) {
                var item = {};
                item.itemno = obj[i].no;
                item.qty = 1;
                item.integral = ytpos.toDec(obj[i].integral);
                total += ytpos.toDec(obj[i].integral);
                data.push(item);
            }
        }
        if (total == 0) {
            dialogMsg("请先选择要兑换的礼品！");
            return;
        }
        if (total > have) {
            dialogMsg("选择的礼品太多，积分不够！");
            return;
        }
        var branchno = $("#hid_branchno").val();

        var postdata = {};
        postdata.vipno = "${vipNo}";
        postdata.branchno = branchno;
        postdata.data = data;
        $.ajax({
            url: yturl("/user/GetCreateExchange.do"),
            data: JSON.stringify(postdata),
            dataType: "json",
            async: false,
            success: function (rc) {
                if (rc.MsgCode == "0") {
                    storage.removeItem(exchangeStorageName);//清除opid-exchange的值
                    var tourl = yturl("/user/exchangelist.do");
                    dialogMsgUrl("兑换成功", tourl);
                }
                else {
                    dialogMsg(rc.Msg);
                }
            },
            error: function (xhr, errorType, error) {
                dialogMsg("兑换失败");
            }
        });
    });
</script>
    

</body></html>