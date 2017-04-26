package com.site.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * FUNCTION:TdSale Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
@JsonIgnoreProperties({"saleid", "pctrolleybillid","squadno","malltype","otype","totqty","totuamt","payamt","companyno",
        "organizationno","vernum","etlno","processtime","processstatus","isoffdata","giftctfno","trantime",
        "reservedfileld","wspoint","pcistrolleybill","memo","ecsflg","ecsdate","deftime","giftctf",
        "bsno","conttel","getmode","getshop","gdate","gdtime","shipadd","ispractice","cnfflg","isbuffer","ordershop",
        "contman","legalper","bdate"})
@ApiModel(value = "销售单头", description = "TdSale")
public class TdSale implements Serializable {
    @ApiModelProperty(hidden = true)
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "门店")
    protected String shop;
    @ApiModelProperty(value = "会员卡号")
    protected String cardno;
    @ApiModelProperty(value = "来源单号")
    protected String ofno;
    @ApiModelProperty(value = "积分")
    protected Double pointqty;
    @ApiModelProperty(value = "总销售金额(含税)")
    protected Double totamt;
    @ApiModelProperty(value = "销售单号")
    protected String saleno;
    @ApiModelProperty(value = "销售日期:20170503")
    protected String sdate;
    @ApiModelProperty(value = "销售时间:220712")
    protected String stime;
    @ApiModelProperty(value = "机号")
    protected String machine;
    @ApiModelProperty(value = "收银员")
    protected String opno;
    @ApiModelProperty(value = "销售单类型:0、销售单 1、原价退货 2、议价退货3、订单 4、退订单")
    protected Integer type;
    @ApiModelProperty(value = "原销售日期:退货使用")
    protected String returndate;
    /////////////////////////////////以下隐藏/////////////////////////////////////
    @ApiModelProperty(hidden = true)
    protected String saleid;
    @ApiModelProperty(hidden = true)
    protected String pctrolleybillid;
    @ApiModelProperty(hidden = true)
    protected Integer squadno;
    @ApiModelProperty(hidden = true)
    protected Integer malltype;
    @ApiModelProperty(hidden = true)
    protected Integer otype;
    @ApiModelProperty(hidden = true)
    protected Double totqty;
    @ApiModelProperty(hidden = true)
    protected Double totuamt;
    @ApiModelProperty(hidden = true)
    protected Double payamt;
    @ApiModelProperty(hidden = true)
    protected String companyno;
    @ApiModelProperty(hidden = true)
    protected String organizationno;
    @ApiModelProperty(hidden = true)
    protected String vernum;
    @ApiModelProperty(hidden = true)
    protected String etlno;
    @ApiModelProperty(hidden = true)
    protected String processtime;
    @ApiModelProperty(hidden = true)
    protected String processstatus;
    @ApiModelProperty(hidden = true)
    protected String isoffdata;
    @ApiModelProperty(hidden = true)
    protected String giftctfno;
    @ApiModelProperty(hidden = true)
    protected String trantime;
    @ApiModelProperty(hidden = true)
    protected String reservedfileld;
    @ApiModelProperty(hidden = true)
    protected String wspoint;
    @ApiModelProperty(hidden = true)
    protected String pcistrolleybill;
    @ApiModelProperty(hidden = true)
    protected String memo;
    @ApiModelProperty(hidden = true)
    protected String ecsflg;
    @ApiModelProperty(hidden = true)
    protected String ecsdate;
    @ApiModelProperty(hidden = true)
    protected String deftime;
    @ApiModelProperty(hidden = true)
    protected String giftctf;
    @ApiModelProperty(hidden = true)
    protected String bsno;
    @ApiModelProperty(hidden = true)
    protected String conttel;
    @ApiModelProperty(hidden = true)
    protected String getmode;
    @ApiModelProperty(hidden = true)
    protected String getshop;
    @ApiModelProperty(hidden = true)
    protected String gdate;
    @ApiModelProperty(hidden = true)
    protected String gtime;
    @ApiModelProperty(hidden = true)
    protected String shipadd;
    @ApiModelProperty(hidden = true)
    protected String ispractice;
    @ApiModelProperty(hidden = true)
    protected String cnfflg;
    @ApiModelProperty(hidden = true)
    protected String isbuffer;
    @ApiModelProperty(hidden = true)
    protected String ordershop;
    @ApiModelProperty(hidden = true)
    protected String contman;
    @ApiModelProperty(hidden = true)
    protected String legalper;
    @ApiModelProperty(hidden = true)
    protected String bdate;


    public void setSaleid(String saleid) {
        this.saleid = saleid;
    }

    public String getSaleid() {
        return this.saleid;
    }

    public void setPctrolleybillid(String pctrolleybillid) {
        this.pctrolleybillid = pctrolleybillid;
    }

    public String getPctrolleybillid() {
        return this.pctrolleybillid;
    }

    public void setSquadno(Integer squadno) {
        this.squadno = squadno;
    }

    public Integer getSquadno() {
        return this.squadno;
    }

    public void setMalltype(Integer malltype) {
        this.malltype = malltype;
    }

    public Integer getMalltype() {
        return this.malltype;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return this.type;
    }

    public void setOtype(Integer otype) {
        this.otype = otype;
    }

    public Integer getOtype() {
        return this.otype;
    }

    public void setPointqty(Double pointqty) {
        this.pointqty = pointqty;
    }

    public Double getPointqty() {
        return this.pointqty;
    }

    public void setTotqty(Double totqty) {
        this.totqty = totqty;
    }

    public Double getTotqty() {
        return this.totqty;
    }

    public void setTotamt(Double totamt) {
        this.totamt = totamt;
    }

    public Double getTotamt() {
        return this.totamt;
    }

    public void setTotuamt(Double totuamt) {
        this.totuamt = totuamt;
    }

    public Double getTotuamt() {
        return this.totuamt;
    }

    public void setPayamt(Double payamt) {
        this.payamt = payamt;
    }

    public Double getPayamt() {
        return this.payamt;
    }

    public void setCompanyno(String companyno) {
        this.companyno = companyno;
    }

    public String getCompanyno() {
        return this.companyno;
    }

    public void setOrganizationno(String organizationno) {
        this.organizationno = organizationno;
    }

    public String getOrganizationno() {
        return this.organizationno;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getShop() {
        return this.shop;
    }

    public void setSaleno(String saleno) {
        this.saleno = saleno;
    }

    public String getSaleno() {
        return this.saleno;
    }

    public void setVernum(String vernum) {
        this.vernum = vernum;
    }

    public String getVernum() {
        return this.vernum;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }

    public String getMachine() {
        return this.machine;
    }

    public void setEtlno(String etlno) {
        this.etlno = etlno;
    }

    public String getEtlno() {
        return this.etlno;
    }

    public void setProcesstime(String processtime) {
        this.processtime = processtime;
    }

    public String getProcesstime() {
        return this.processtime;
    }

    public void setProcessstatus(String processstatus) {
        this.processstatus = processstatus;
    }

    public String getProcessstatus() {
        return this.processstatus;
    }

    public void setIsoffdata(String isoffdata) {
        this.isoffdata = isoffdata;
    }

    public String getIsoffdata() {
        return this.isoffdata;
    }

    public void setGiftctfno(String giftctfno) {
        this.giftctfno = giftctfno;
    }

    public String getGiftctfno() {
        return this.giftctfno;
    }

    public void setTrantime(String trantime) {
        this.trantime = trantime;
    }

    public String getTrantime() {
        return this.trantime;
    }

    public void setReservedfileld(String reservedfileld) {
        this.reservedfileld = reservedfileld;
    }

    public String getReservedfileld() {
        return this.reservedfileld;
    }

    public void setWspoint(String wspoint) {
        this.wspoint = wspoint;
    }

    public String getWspoint() {
        return this.wspoint;
    }

    public void setPcistrolleybill(String pcistrolleybill) {
        this.pcistrolleybill = pcistrolleybill;
    }

    public String getPcistrolleybill() {
        return this.pcistrolleybill;
    }

    public void setReturndate(String returndate) {
        this.returndate = returndate;
    }

    public String getReturndate() {
        return this.returndate;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setEcsflg(String ecsflg) {
        this.ecsflg = ecsflg;
    }

    public String getEcsflg() {
        return this.ecsflg;
    }

    public void setEcsdate(String ecsdate) {
        this.ecsdate = ecsdate;
    }

    public String getEcsdate() {
        return this.ecsdate;
    }

    public void setDeftime(String deftime) {
        this.deftime = deftime;
    }

    public String getDeftime() {
        return this.deftime;
    }

    public void setGiftctf(String giftctf) {
        this.giftctf = giftctf;
    }

    public String getGiftctf() {
        return this.giftctf;
    }

    public void setBsno(String bsno) {
        this.bsno = bsno;
    }

    public String getBsno() {
        return this.bsno;
    }

    public void setConttel(String conttel) {
        this.conttel = conttel;
    }

    public String getConttel() {
        return this.conttel;
    }

    public void setGetmode(String getmode) {
        this.getmode = getmode;
    }

    public String getGetmode() {
        return this.getmode;
    }

    public void setGetshop(String getshop) {
        this.getshop = getshop;
    }

    public String getGetshop() {
        return this.getshop;
    }

    public void setGdate(String gdate) {
        this.gdate = gdate;
    }

    public String getGdate() {
        return this.gdate;
    }

    public void setGtime(String gtime) {
        this.gtime = gtime;
    }

    public String getGtime() {
        return this.gtime;
    }

    public void setShipadd(String shipadd) {
        this.shipadd = shipadd;
    }

    public String getShipadd() {
        return this.shipadd;
    }

    public void setStime(String stime) {
        this.stime = stime;
    }

    public String getStime() {
        return this.stime;
    }

    public void setIspractice(String ispractice) {
        this.ispractice = ispractice;
    }

    public String getIspractice() {
        return this.ispractice;
    }

    public void setCnfflg(String cnfflg) {
        this.cnfflg = cnfflg;
    }

    public String getCnfflg() {
        return this.cnfflg;
    }

    public void setIsbuffer(String isbuffer) {
        this.isbuffer = isbuffer;
    }

    public String getIsbuffer() {
        return this.isbuffer;
    }

    public void setOrdershop(String ordershop) {
        this.ordershop = ordershop;
    }

    public String getOrdershop() {
        return this.ordershop;
    }

    public void setContman(String contman) {
        this.contman = contman;
    }

    public String getContman() {
        return this.contman;
    }

    public void setLegalper(String legalper) {
        this.legalper = legalper;
    }

    public String getLegalper() {
        return this.legalper;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    public String getBdate() {
        return this.bdate;
    }

    public void setOpno(String opno) {
        this.opno = opno;
    }

    public String getOpno() {
        return this.opno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getCardno() {
        return this.cardno;
    }

    public void setOfno(String ofno) {
        this.ofno = ofno;
    }

    public String getOfno() {
        return this.ofno;
    }

    public void setSdate(String sdate) {
        this.sdate = sdate;
    }

    public String getSdate() {
        return this.sdate;
    }
}  