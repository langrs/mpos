package com.site.entity.respon;

/**
 * Created by langrs on 2017-03-20.
 */
public class GetPromResult {
    protected String promno;
    protected String type;
    protected Long priority;
    protected String promway;
    //是否换赠
    protected String canexchange;

    public String getCanexchange() {
        return canexchange;
    }

    public void setCanexchange(String canexchange) {
        this.canexchange = canexchange;
    }

    //换赠方式 1.超量  2.倍量
    protected String  exchangeway;

    public String getExchangeway() {
        return exchangeway;
    }

    public void setExchangeway(String exchangeway) {
        this.exchangeway = exchangeway;
    }

    public String getPromway() {
        return promway;
    }

    public void setPromway(String promway) {
        this.promway = promway;
    }

    public String getPromno() {
        return promno;
    }

    public void setPromno(String promno) {
        this.promno = promno;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }
}
