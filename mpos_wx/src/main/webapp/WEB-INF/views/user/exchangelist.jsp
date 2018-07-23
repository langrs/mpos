<!DOCTYPE html>
<!-- saved from url=(0039)http://vip.yt-yun.com/user/exchangelist -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="format-detection" content="telephone=no">
    <title>兑换记录</title>
    <link href="./兑换记录-返利_files/frozen.css" rel="stylesheet">
    <script src="./兑换记录-返利_files/zepto.min.js.下载"></script>
    <script src="./兑换记录-返利_files/frozen.js.下载"></script>
    <link href="./兑换记录-返利_files/icon" rel="stylesheet">

    <link href="./兑换记录-返利_files/common" rel="stylesheet">

    <script src="./兑换记录-返利_files/ytpos.js.下载"></script>
    <script type="text/javascript">
        document.onselectstart = function () { return false }; //禁止鼠标选择文本

        var ytappid = "wxeea8d0dc39ba1084";

        var yturl = function (suburl) {
            var host = "http://vip.yt-yun.com";
            var rc = (host + suburl);
            return rc;
        }

        // 全局事件
        $(document).on('ajaxError', function (e, jqXHR, s, errorData) {
            console.log(errorData);
        });
    </script>
    
</head>
<body ontouchstart="">
    
<header class="ui-header ui-header-positive ui-border-b" style="background-color: #078CDB;">
    <i class="ui-icon-return" onclick="history.back()"></i><h1>兑换记录 </h1><i class="ui-icon-home" style="position: absolute; top: 0px; right: 2px; "></i>
</header>
<section style=" height: 22px;"></section>
<script>
    $('.ui-icon-home').click(function () {
        location.href = yturl("/home");
    });
</script>
<section class="ui-container" style=" border-top-width: 22px;">
    <section id="list">
        <div class="demo-item">
            <div class="demo-block">
                <div class="ui-tab">
                    <ul class="ui-tab-nav ui-border-b">
                        <li class="">兑换礼品</li>
                        <li class="current">兑换返利</li>
                    </ul>
                    <ul class="ui-tab-content" style="width: 200%; transition-property: transform; transition-timing-function: cubic-bezier(0.1, 0.57, 0.1, 1); transition-duration: 0ms; transform: translate(-337px, 0px) translateZ(0px);">
                        <li class="" style="height: 0px;">
                            <div class="demo-block">
                                <ul class="ui-list ui-border-tb" style="padding-bottom: 30px;">
                                    <li vel="B0167DBB-7239-4D83-9804-D140116BC0D9">
                                        <div class="demo-item common_div_radius" style="width: 95%; margin-left: 0px; padding-bottom:10px;">
                                            <div class="demo-block">
                                                <p class="demo-desc common_p_bg">2017/5/20 10:23:31</p>
                                                <ul class="ui-list ui-list-pure">
                                                    <li class="ui-border-t ui-txt-info" style="font-size: 0.8em; line-height: 20px; padding: 5px 0px; color: #4A4A4A; ">
                                                        <font>抽奖（所需积分<em>50.00</em>）</font><br>
                                                    </li>
                                                    <li class="ui-border-t ui-txt-info" style="font-size: 0.8em; line-height: 20px; padding: 5px 0px;">
                                                        <div style="float:left;">
                                                            <i class="ui-icon-checked" style="float: left; font-size: 18px; line-height: 20px; color: #909292;"></i>
                                                            <span style="float:left;">未完成</span>
                                                        </div>
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                        </li>
                        <li class="current" style="height: auto;">
                            <div class="demo-block">
                                <ul class="ui-list ui-border-tb" style="padding-bottom: 30px;">
                                                <li>
                                                    <div class="demo-item common_div_radius" style="width: 95%; margin-left: 0px; padding-bottom:10px;">
                                                        <div class="demo-block">
                                                            <p class="demo-desc common_p_bg">2017-05-20 10:25:10</p>
                                                            <p style="font-size: 0.8em; line-height: 20px; padding: 10px 10px 0px; color: #4A4A4A;">
                                                                <font>返利 1.00（所需积分<em>-100.00</em>）</font><br>
                                                            </p>
                                                        </div>
                                                    </div>
                                                </li>

                                </ul>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </section>
</section><!-- /.ui-container-->
<script>
    (function () {
        
        var tab = new fz.Scroll('.ui-tab', {
            role: 'tab',
            autoplay: false
        });
        /* 滑动开始前 */
        tab.on('beforeScrollStart', function (fromIndex, toIndex) {
            console.log(fromIndex, toIndex);// from 为当前页，to 为下一页
        })
    })();
</script>
    

</body></html>