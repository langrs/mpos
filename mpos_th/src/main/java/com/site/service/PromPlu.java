package com.site.service;

/**
 * Created by langrs on 2017-03-17.
 *
 */
public class PromPlu {
    //规则处理标志
    protected String flag;
    //项次
    protected int item;
    //条码
    protected String pluno;
    //专柜码
    protected String counterno;
    //商品品类
    protected String sno;
    //商品品牌
    protected String brand;
    //属性1
    protected String fgroup1;
    //属性2
    protected String fgroup2;
    //属性3
    protected String fgroup3;
    //属性4
    protected String fgroup4;
    //属性5
    protected String fgroup5;
    //属性6
    protected String fgroup6;
    //属性7
    protected String fgroup7;
    //属性8
    protected String fgroup8;
    //属性9
    protected String fgroup9;
    //税号
    protected String taxcode;
    //原单价
    protected Double oldprice;
    //售价
    protected Double price;
    //数量
    protected Double qty;
    //积分
    protected Double pointqty;
    //折扣金额小计
    protected Double disc;
    //小计(含税)
    protected Double amt;
    //促销单号
    protected String promno;
    //促销类型:1.特价，2.折扣(买送)，3.折让 4.倍换
    protected String promway;
    //促销值(折扣值)
    protected Double promwayamt;
    ////////////////////////////////倍换相关//////////////////////////////
    //倍换基数
    protected Double timesstd;
    //倍换倍数
    protected Double timesdou;
//    ///////////////////////////////////满额赠送相关//////////////////////////////
//    //满额条件
//    protected Double condfull;
//    //折让基数
//    protected Double rebaterate;
//
//    //折让余额,这个值是计算折让后或买送剩余凑算金额
//    protected Double remain;
//    //可换赠否,如果是买送则为Y
//    protected String canexchange;
//    //换赠方式 1.超量  2.倍量
//    protected Integer exchangeway;
//    //满额赠送条款金额
//    protected Double quota;
//    //满额赠送类型(送什么东西,例如送卡M,送券等,原字段为type)
//    protected String exchangetype;
//    //满额赠送东西代码(例如送卡的话,这里存放了卡种,原字段为code)
//    protected String exchangecode;
//    //赠送金额,临时
//    protected Double exchangeamt;
//    //促销对象
//    protected String promobject;
    /////////////////////////////积分相关/////////////////////////////////
    //基准单位,0.无,1.金额,2.数量,表示按照金额还是按照数量来积分,默认都是1
    protected String defunit;
    //基准额满
    protected Integer deffull;
    //积分基准(每消费XX元)
    protected Integer stdscore;
    //单位积分(积XX分)
    protected Integer unitscore;
    //特价积分基准(享受了会员卡折扣的就启用特价积分标准)
    protected Integer pcexstdscore;
    //特价单位积分
    protected Integer pcexunitscore;
    //////////////////////////////会员折扣相关/////////////////////////////
    //会员卡折扣率
    protected Integer vipdisc;
    //会员卡折扣金额
    protected Double vipdiscamt;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTaxcode() {
        return taxcode;
    }

    public void setTaxcode(String taxcode) {
        this.taxcode = taxcode;
    }

    public String getCounterno() {
        return counterno;
    }

    public void setCounterno(String counterno) {
        this.counterno = counterno;
    }

    public Double getAmt() {
        return amt;
    }

    public void setAmt(Double amt) {
        this.amt = amt;
    }


    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public Double getOldprice() {
        return oldprice;
    }

    public void setOldprice(Double oldprice) {
        this.oldprice = oldprice;
    }

    public String getPluno() {
        return pluno;
    }

    public void setPluno(String pluno) {
        this.pluno = pluno;
    }

    public Double getPointqty() {
        return pointqty;
    }

    public void setPointqty(Double pointqty) {
        this.pointqty = pointqty;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPromno() {
        return promno;
    }

    public void setPromno(String promno) {
        this.promno = promno;
    }

    public String getPromway() {
        return promway;
    }

    public void setPromway(String promway) {
        this.promway = promway;
    }

    public Double getPromwayamt() {
        return promwayamt;
    }

    public void setPromwayamt(Double promwayamt) {
        this.promwayamt = promwayamt;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }


    public Double getTimesdou() {
        return timesdou;
    }

    public void setTimesdou(Double timesdou) {
        this.timesdou = timesdou;
    }

    public Double getTimesstd() {
        return timesstd;
    }

    public void setTimesstd(Double timesstd) {
        this.timesstd = timesstd;
    }

//    public Double getCondfull() {
//        return condfull;
//    }
//
//    public void setCondfull(Double condfull) {
//        this.condfull = condfull;
//    }
//
//    public Double getRebaterate() {
//        return rebaterate;
//    }
//
//    public void setRebaterate(Double rebaterate) {
//        this.rebaterate = rebaterate;
//    }
//
//    public Double getRemain() {
//        return remain;
//    }
//
//    public void setRemain(Double remain) {
//        this.remain = remain;
//    }
//
//    public String getCanexchange() {
//        return canexchange;
//    }
//
//    public void setCanexchange(String canexchange) {
//        this.canexchange = canexchange;
//    }

    public Double getDisc() {
        return disc;
    }

    public void setDisc(Double disc) {
        this.disc = disc;
    }

//    public Integer getExchangeway() {
//        return exchangeway;
//    }
//
//    public void setExchangeway(Integer exchangeway) {
//        this.exchangeway = exchangeway;
//    }
//
//    public Double getExchangeamt() {
//        return exchangeamt;
//    }
//
//    public void setExchangeamt(Double exchangeamt) {
//        this.exchangeamt = exchangeamt;
//    }
//
//    public String getPromobject() {
//        return promobject;
//    }
//
//    public void setPromobject(String promobject) {
//        this.promobject = promobject;
//    }
//
//    public String getExchangecode() {
//        return exchangecode;
//    }
//
//    public void setExchangecode(String exchangecode) {
//        this.exchangecode = exchangecode;
//    }
//
//    public String getExchangetype() {
//        return exchangetype;
//    }
//
//    public void setExchangetype(String exchangetype) {
//        this.exchangetype = exchangetype;
//    }
//
//    public Double getQuota() {
//        return quota;
//    }
//
//    public void setQuota(Double quota) {
//        this.quota = quota;
//    }

    public Integer getDeffull() {
        return deffull;
    }

    public void setDeffull(Integer deffull) {
        this.deffull = deffull;
    }

    public String getDefunit() {
        return defunit;
    }

    public void setDefunit(String defunit) {
        this.defunit = defunit;
    }

    public Integer getPcexstdscore() {
        return pcexstdscore;
    }

    public void setPcexstdscore(Integer pcexstdscore) {
        this.pcexstdscore = pcexstdscore;
    }

    public Integer getPcexunitscore() {
        return pcexunitscore;
    }

    public void setPcexunitscore(Integer pcexunitscore) {
        this.pcexunitscore = pcexunitscore;
    }

    public Integer getStdscore() {
        return stdscore;
    }

    public void setStdscore(Integer stdscore) {
        this.stdscore = stdscore;
    }

    public Integer getUnitscore() {
        return unitscore;
    }

    public void setUnitscore(Integer unitscore) {
        this.unitscore = unitscore;
    }


    public Integer getVipdisc() {
        return vipdisc;
    }

    public void setVipdisc(Integer vipdisc) {
        this.vipdisc = vipdisc;
    }

    public Double getVipdiscamt() {
        return vipdiscamt;
    }

    public void setVipdiscamt(Double vipdiscamt) {
        this.vipdiscamt = vipdiscamt;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getFgroup1() {
        return fgroup1;
    }

    public void setFgroup1(String fgroup1) {
        this.fgroup1 = fgroup1;
    }

    public String getFgroup2() {
        return fgroup2;
    }

    public void setFgroup2(String fgroup2) {
        this.fgroup2 = fgroup2;
    }

    public String getFgroup3() {
        return fgroup3;
    }

    public void setFgroup3(String fgroup3) {
        this.fgroup3 = fgroup3;
    }

    public String getFgroup4() {
        return fgroup4;
    }

    public void setFgroup4(String fgroup4) {
        this.fgroup4 = fgroup4;
    }

    public String getFgroup5() {
        return fgroup5;
    }

    public void setFgroup5(String fgroup5) {
        this.fgroup5 = fgroup5;
    }

    public String getFgroup6() {
        return fgroup6;
    }

    public void setFgroup6(String fgroup6) {
        this.fgroup6 = fgroup6;
    }

    public String getFgroup7() {
        return fgroup7;
    }

    public void setFgroup7(String fgroup7) {
        this.fgroup7 = fgroup7;
    }

    public String getFgroup8() {
        return fgroup8;
    }

    public void setFgroup8(String fgroup8) {
        this.fgroup8 = fgroup8;
    }

    public String getFgroup9() {
        return fgroup9;
    }

    public void setFgroup9(String fgroup9) {
        this.fgroup9 = fgroup9;
    }
//要运用这个类来计算之前,必须把所有的必须的参数准备好,比如说积分的规则是把属于当前环境的积分元素准备出来,单据
    //中的按照卡等级来做的单据,那么要把所属当前的卡种的积分条款提取出来
    //其他的促销也是,品类/品牌/商品库区等都是,要根据当前条码的来提取出促销参数
    //计算打折
//    public void calcDisc(){
//        //实际售价
//        price = oldprice * promwayamt /100;
//        //折扣金额小计
//        disc = (oldprice - price ) * qty;
//        //小计金额(含税)
//        amt = price * qty;
//    }
//    //计算折让
//    public void calcReduce(){
//        if(condfull != 0 && condfull != null){
//            Double ceil = Math.ceil((oldprice * qty) / condfull);
//            //计算凑算余额
//            remain = price * qty - ceil * condfull;
//            //计算单价
//            price = ((oldprice * qty - ceil * promwayamt) /qty);
//            //计算折让小计
//            disc = (oldprice - price)*qty;
//            //计算小计金额
//            amt = price * qty;
//
//        }
//    }
//    //计算赠送
//    public void calcExchange(){
////        门槛金额是否满足
//        if( rebaterate != null && oldprice*qty >=rebaterate){
//            Double ceil = Math.ceil(oldprice*qty/condfull);
//            //计算满额赠送金额
//            exchangeamt = ceil * quota;
//            //计算凑算余额
//            remain = price * qty - ceil * condfull;
//        }
//    }
    //计算积分
//    public void calcPoint(){
//        //如果享受了会员卡折扣的就启用特价积分标准
//        //这里是否有基准额满的限定?就是达到多少钱以上才给计算积分????
//        //积分算法是否取整,如果没有达到基准,是否就不积分?
//        if(amt >= deffull){
//            if(1==1){
//                //正常积分
//                pointqty = Math.ceil(amt / stdscore ) * unitscore;
//            }else{
//                //特价积分
//                pointqty = Math.ceil(amt/pcexstdscore) * pcexunitscore;
//            }
//        }
//    }
    //计算会员折扣
    //计算金额是按照折前的还是折后的,例如有促销打折的话,怎么算???
//    public void calcVipDisc(){
////        if(cardno != null && cardno != "" && vipdisc > 0){
//            //售价
//            price = oldprice * vipdisc/100;
//            //会员折扣金额
//            vipdiscamt = oldprice * qty * vipdisc/100 ;
//            //折扣小计
//            disc = disc + vipdiscamt;
//            //金额小计
//            amt  = price * qty - disc;
//
////        }
//    }

}
