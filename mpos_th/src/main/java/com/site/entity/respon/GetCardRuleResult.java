package com.site.entity.respon;

/**
 * Created by langrs on 2017-04-17.
 * Usage:
 */
public class GetCardRuleResult {
    //单号
    protected String ruleno;
    //是否满额收卡
    protected String isfulfil;
    //明细规则方式,例如明细的code代表什么含义
    protected String ruleway;
    //卡种
    protected String ctno;

    public String getCtno() {
        return ctno;
    }

    public void setCtno(String ctno) {
        this.ctno = ctno;
    }

    public String getIsfulfil() {
        return isfulfil;
    }

    public void setIsfulfil(String isfulfil) {
        this.isfulfil = isfulfil;
    }

    public String getRuleno() {
        return ruleno;
    }

    public void setRuleno(String ruleno) {
        this.ruleno = ruleno;
    }

    public String getRuleway() {
        return ruleway;
    }

    public void setRuleway(String ruleway) {
        this.ruleway = ruleway;
    }
}
