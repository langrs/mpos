package com.site.entity.entityParm;

/**
 * Created by langrs on 2016-11-13.
 */
public class RpVipQuery {
    protected String ckcode;
    protected String lmcode;
    protected Double cardjf;
    protected String cardtype;
    protected String cardstatus;

    public Double getCardjf() {
        return cardjf;
    }

    public void setCardjf(Double cardjf) {
        this.cardjf = cardjf;
    }

    public String getCardstatus() {
        return cardstatus;
    }

    public void setCardstatus(String cardstatus) {
        this.cardstatus = cardstatus;
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    public String getCkcode() {
        return ckcode;
    }

    public void setCkcode(String ckcode) {
        this.ckcode = ckcode;
    }

    public String getLmcode() {
        return lmcode;
    }

    public void setLmcode(String lmcode) {
        this.lmcode = lmcode;
    }
}
