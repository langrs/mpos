<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>

<!DOCTYPE html>
<html>
<head>
    <title>个人中心</title>
</head>
<body ontouchstart="" screen_capture_injected="true" style="background-color: rgb(241, 241, 241);">

<section class="ui-container">
    <section id="slider">
        <div class="demo-item">
            <div class="demo-block">
                <div class="ui-slider" style=" height:50px;">
                    <ul class=" ui-slider-content" style="width: 300%">
                        <li><img src='${staticPath}/images/lun1.jpg' onerror="this.onerror='';this.src='${staticPath}/images/lun1.jpg';" /></li>
                        <li><img src='${staticPath}/images/lun2.jpg' onerror="this.onerror='';this.src='${staticPath}/images/lun2.jpg';" /></li>
                        <li><img src='${staticPath}/images/lun3.jpg' onerror="this.onerror='';this.src='${staticPath}/images/lun3.jpg';" /></li>
                    </ul>
                    <ul class="ui-slider-indicators"><li class="">1</li><li class="current">2</li><li class="">3</li></ul></div>
            </div>
            <script class="demo-script">
                (function () {
                    var slider = new fz.Scroll('.ui-slider', {
                        role: 'slider',
                        indicator: true,
                        autoplay: true,
                        interval: 3000
                    });

                    slider.on('beforeScrollStart', function (fromIndex, toIndex) {
                        //console.log(fromIndex, toIndex)
                    });

                    slider.on('scrollEnd', function (cruPage) {
                        //console.log(cruPage)
                    });
                })();
            </script>
        </div>
    </section>
    <table class="ui-table ui-border-tb" style="margin: 0px 0px 10px 0px; background-color: #fff; ">
        <tbody>
        <tr>
            <td style="padding: 5px 10px;text-align:left;">
                <p class="demo-desc" style="font-size:12px;">
                    <i class="iconfont icon-gonggao" style=" color: #F5592B; font-size: 18px; line-height: 18px;margin-right:5px;"></i>
                    星趴微会员
                </p>
            </td>
        </tr>
        </tbody>
    </table>
    <section class="iconlist" style=" background-color: #fff; ">
        <input type="hidden" id="hidpageset" value="101,102,103,104,107,108,109">
        <table class="ui-table ui-border-tb">
            <tbody id="icons">
            <tr>
                <td id="td_huiyuanka"><i class="iconfont icon-huiyuanka" style="color: #EA9E04; "></i><div>会员卡</div></td>
                <td id="td_jilu"><i class="iconfont icon-xiaofei" style=" color: #EA4744;"></i><div>流水账</div></td>
                <td id="td_jifenduihuan"><i class="iconfont icon-duihuan" style=" color: #7FC30C;"></i><div>积分兑换</div></td>
                <td id="td_duihuanjilu"><i class="iconfont icon-duihuanjilu" style=" color: #8644C7;"></i><div>兑换记录</div></td>
            </tr>
            <tr>
                <td id="td_yuechongzhi"><i class="iconfont icon-yue" style=" color: #FB6016;"></i><div>余额充值</div></td>
                <td id="td_xiaofei"><i class="iconfont icon-jilumian" style=" color: #EA9E04;"></i><div>消费明细</div></td>
                    <td id="td_youhuiquan"><i class="iconfont icon-kehuxiaoshou" style=" color: #F72D2A;"></i><div>优惠券</div></td>
                    <td id="td_shezhi"><i class="iconfont icon-shezhi" style=" color: #1DC384;"></i><div>设置</div></td>
            </tr>
            </tbody>
        </table>
    </section>
    <table class="ui-table ui-border-tb" style="margin: 10px 0px; background-color: #fff; ">
        <tbody>
        <tr>
            <td style="padding: 15px 20px;text-align:left;">
                <p class="demo-desc" style="font-size:14px;">
                    <i class="iconfont icon-qiye" style="color: #f2aa1a; margin-right: 10px; font-size: 30px; line-height: 30px; "></i>企业简介
                </p>
                <p class="ui-txt-info" style="font-size:12px;line-height:25px;margin-left:30px;">
                    星趴微会员。免实体卡，实时查询数据，消费及时通知。真正的互联网+会员卡
                </p>
            </td>
        </tr>
        </tbody>
    </table>
    <div class="ui-actionsheet">
        <div class="ui-actionsheet-cnt">
            <button id="btn_imvip">我是会员</button>

            <button id="btn_imboss">我是老板</button>
            <button id="btn_pageset">页面设置</button>
            <button id="btn_cancel" class="ui-actionsheet-del">取消</button>
        </div>
    </div>
    <input type="hidden" id="hidiscust" value="0">
    <input type="hidden" id="hidissup" value="0">
</section>

<script>
    (function () {


        $("body").css("background-color", "#F1F1F1");//body背景色

        init();//初始化模块
//        会员卡响应
        $("#td_huiyuanka").tap(function () {
            location.href = yturl('/user/showVipInfo.do');
        });
        //流水账,会员积分变动
        $("#td_jilu").tap(function () {
            location.href = yturl('/user/getVipIntegral.do');
        });
//        积分兑换
        $("#td_jifenduihuan").tap(function () {
            location.href = yturl('/user/exchange.do');
        });
//        兑换记录
        $("#td_duihuanjilu").tap(function () {
            location.href = yturl('/user/exchangelist');
        });
        $("#td_kaibaoxiang").tap(function () {
            location.href = yturl('/user/chest');
        });
        $("#td_kaibaoxiangjilu").tap(function () {
            location.href = yturl('/user/chestlist');
        });
//        余额充值
        $("#td_yuechongzhi").tap(function () {
            location.href = yturl('/user/recharge');
        });
        //消费记录
        $("#td_xiaofei").tap(function () {
            location.href = yturl('/user/saleList.do');
        });
//        优惠券
        $("#td_youhuiquan").tap(function () {
            location.href = yturl('/user/stamplist');
        });
        //+++++++++++++++++++++++++
        $("#td_kehuzhangmu").tap(function () {
            location.href = yturl('/cust');
        });
        $("#td_kehudingdan").tap(function () {
            location.href = yturl('/cust/order');
        });
        $("#td_kehuxiaoshou").tap(function () {
            location.href = yturl('/cust/sale');
        });
        $("#td_tuihuobaozhang").tap(function () {
            location.href = yturl('/cust/returngoods');
        });
        $("#td_kehubaobiao").tap(function () {
            location.href = yturl('/cust/chart');
        });
        $("#td_huoshangzhangmu").tap(function () {
            location.href = yturl('/sup');
        });
        $("#td_huoshangdingdan").tap(function () {
            location.href = yturl('/sup/order');
        });
        $("#td_ruku").tap(function () {
            location.href = yturl('/sup/storage');
        });
        $("#td_songhuoche").tap(function () {
            location.href = yturl('/sup/returngoods');
        });
        $("#td_huoshangbaobiao").tap(function () {
            location.href = yturl('/sup/chart');
        });
        $("#td_jinrixiaoshou").tap(function () {
            location.href = yturl('/boss');
        });
        $("#td_caigou").tap(function () {
            location.href = yturl('/boss/purchase');
        });
        $("#td_jiangxiangshezhi").tap(function () {
            location.href = yturl('/boss/awardsset');
        });
        $("#td_duijiang").tap(function () {
            location.href = yturl('/boss/verification');
        });
        $("#td_baoxiangbaobiao").tap(function () {
            location.href = yturl('/boss/winreport');
        });
        $("#td_chushihuashuju").tap(function () {
            location.href = yturl('/home/welcome?reset=1');
        });

        //设置
        $("#td_shezhi").tap(function () {
            $('.ui-actionsheet').addClass('show');
        });
        $("#btn_cancel").tap(function () {
            $('.ui-actionsheet').removeClass('show');
        });
        $("#btn_imvip").tap(function () {
            location.href = yturl('/login/vip/bi.nd');
        });
        //$("#btn_imcust").tap(function () {
        //    if ($("#hidiscust").val() == "1") {
        //        location.href = yturl('/login/cust');
        //    }
        //    else {
        //        location.href = yturl('/login/custbind');
        //    }
        //});
        //$("#btn_imsup").tap(function () {
        //    if ($("#hidissup").val() == "1") {
        //        location.href = yturl('/login/sup');
        //    }
        //    else {
        //        location.href = yturl('/login/supbind');
        //    }
        //});
        $("#btn_imboss").tap(function () {
            location.href = yturl('/login/boss');
        });
        $("#btn_pageset").tap(function () {
            location.href = yturl('/home/pageset');
        });
    })();
    function init() {
        var pageset = $("#hidpageset").val();
        if (!ytpos.isNullOrEnpty(pageset)) {
            var pageArr = pageset.split(',');
            if (pageArr.length > 0) {
                var iconsHtml = "";
                for (var i = 0; i < pageArr.length; i++) {
                    var j = i + 1;
                    if ((j % 4) == 1) {
                        iconsHtml += "<tr>";
                    }
                    switch (pageArr[i]) {
                        case "101":
                            iconsHtml += "<td id=\"td_huiyuanka\"><i class=\"iconfont icon-huiyuanka\" style=\"color: #EA9E04; \"></i><div>会员卡</div></td>";
                            break;
                        case "102":
                            iconsHtml += "<td id=\"td_jilu\"><i class=\"iconfont icon-xiaofei\" style=\" color: #EA4744;\"></i><div>流水账</div></td>";
                            break;
                        case "103":
                            iconsHtml += "<td id=\"td_jifenduihuan\"><i class=\"iconfont icon-duihuan\" style=\" color: #7FC30C;\"></i><div>积分兑换</div></td>";
                            break;
                        case "104":
                            iconsHtml += "<td id=\"td_duihuanjilu\"><i class=\"iconfont icon-duihuanjilu\" style=\" color: #8644C7;\"></i><div>兑换记录</div></td>";
                            break;
                        case "105":
                            iconsHtml += "<td id=\"td_kaibaoxiang\"><i class=\"iconfont icon-xiangzi\" style=\" color: #F93594;\"></i><div>开宝箱</div></td>";
                            break;
                        case "106":
                            iconsHtml += "<td id=\"td_kaibaoxiangjilu\"><i class=\"iconfont icon-kaixiangzi\" style=\" color: #0AB33E;\"></i><div>开宝箱记录</div></td>";
                            break;
                        case "107":
                            iconsHtml += "<td id=\"td_yuechongzhi\"><i class=\"iconfont icon-yue\" style=\" color: #FB6016;\"></i><div>余额充值</div></td>";
                            break;
                        case "108":
                            iconsHtml += "<td id=\"td_xiaofei\"><i class=\"iconfont icon-jilumian\" style=\" color: #EA9E04;\"></i><div>消费明细</div></td>";
                            break;
                        case "109":
                            iconsHtml += "<td id=\"td_youhuiquan\"><i class=\"iconfont icon-kehuxiaoshou\" style=\" color: #F72D2A;\"></i><div>优惠券</div></td>";
                            break;
                            //case "201":
                            //    iconsHtml += "<td id=\"td_kehuzhangmu\"><i class=\"iconfont icon-sirenzhangdan\" style=\"color: #F92A5E; \"></i><div>客户账目</div></td>";
                            //    break;
                            //case "202":
                            //    iconsHtml += "<td id=\"td_kehudingdan\"><i class=\"iconfont icon-sirendingdan\" style=\"color: #F93333; \"></i><div>客户订单</div></td>";
                            //    break;
                            //case "203":
                            //    iconsHtml += "<td id=\"td_kehuxiaoshou\"><i class=\"iconfont icon-kehuxiaoshou\" style=\"color: #AF43E4; \"></i><div>客户销售</div></td>";
                            //    break;
                            //case "204":
                            //    iconsHtml += "<td id=\"td_tuihuobaozhang\"><i class=\"iconfont icon-tuihuobaozhang\" style=\"color: #F93900; \"></i><div>客户退货</div></td>";
                            //    break;
                            //case "205":
                            //    iconsHtml += "<td id=\"td_kehubaobiao\"><i class=\"iconfont icon-bingtu1\" style=\"color: #068FC1; font-size: 28px;\"></i><div>客户报表</div></td>";
                            //    break;
                            //case "301":
                            //    iconsHtml += "<td id=\"td_huoshangzhangmu\"><i class=\"iconfont icon-zhangdan\" style=\"color: #4AD24B; \"></i><div>货商账目</div></td>";
                            //    break;
                            //case "302":
                            //    iconsHtml += "<td id=\"td_huoshangdingdan\"><i class=\"iconfont icon-dingdan\" style=\" color: #6671CC;\"></i><div>货商订单</div></td>";
                            //    break;
                            //case "303":
                            //    iconsHtml += "<td id=\"td_ruku\"><i class=\"iconfont icon-ruku\" style=\" color: #EA5144;\"></i><div>货商入库</div></td>";
                            //    break;
                            //case "304":
                            //    iconsHtml += "<td id=\"td_songhuoche\"><i class=\"iconfont icon-songhuoche\" style=\" color: #63C30C;\"></i><div>货商退货</div></td>";
                            //    break;
                            //case "305":
                            //    iconsHtml += "<td id=\"td_huoshangbaobiao\"><i class=\"iconfont icon-bingtu2\" style=\" color: #F93900;\"></i><div>货商报表</div></td>";
                            //    break;
                        case "401":
                            iconsHtml += "<td id=\"td_jinrixiaoshou\"><i class=\"iconfont icon-xiaoshou\" style=\" color: #B529F9;\"></i><div>销售</div></td>";
                            break;
                        case "402":
                            iconsHtml += "<td id=\"td_caigou\"><i class=\"iconfont icon-caigou\" style=\"color: #1DC2C3; \"></i><div>采购</div></td>";
                            break;
                        case "403":
                            iconsHtml += "<td id=\"td_jiangxiangshezhi\"><i class=\"iconfont icon-jiang\" style=\"color: #F92A5E; \"></i><div>奖项设置</div></td>";
                            break;
                        case "404":
                            iconsHtml += "<td id=\"td_duijiang\"><i class=\"iconfont icon-dui\" style=\" color: #064CC1;\"></i><div>兑奖</div></td>";
                            break;
                        case "405":
                            iconsHtml += "<td id=\"td_baoxiangbaobiao\"><i class=\"iconfont icon-xiangzi\" style=\" color: #fb6016;\"></i><div>开宝箱报表</div></td>";
                            break;
                        case "406":
                            iconsHtml += "<td id=\"td_chushihuashuju\"><i class=\"iconfont icon-jifen\" style=\" color: #f93594;\"></i><div>初始化数据</div></td>";
                            break;
                    }
                    if ((j % 4) == 0) {
                        iconsHtml += "</tr>";
                    }
                }
                var remainder = pageArr.length % 4;
                switch (remainder) {
                    case 0: iconsHtml += "<tr><td id=\"td_shezhi\"><i class=\"iconfont icon-shezhi\" style=\" color: #1DC384;\"></i><div>设置</div></td>";
                        iconsHtml += "<td></td><td></td><td></td></tr>";
                        break;
                    case 1: iconsHtml += "<td id=\"td_shezhi\"><i class=\"iconfont icon-shezhi\" style=\" color: #1DC384;\"></i><div>设置</div></td>";
                        iconsHtml += "<td></td><td></td></tr>";
                        break;
                    case 2: iconsHtml += "<td id=\"td_shezhi\"><i class=\"iconfont icon-shezhi\" style=\" color: #1DC384;\"></i><div>设置</div></td>";
                        iconsHtml += "<td></td></tr>";
                        break;
                    case 3: iconsHtml += "<td id=\"td_shezhi\"><i class=\"iconfont icon-shezhi\" style=\" color: #1DC384;\"></i><div>设置</div></td>";
                        iconsHtml += "</tr>";
                        break;
                }

                $("#icons").html(iconsHtml);
            }
        }
    }
</script>


</body></html>