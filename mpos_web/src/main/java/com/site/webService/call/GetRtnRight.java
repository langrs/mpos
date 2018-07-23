
package com.site.webService.call;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRtnRight", propOrder = {
        "arg0",
        "arg1"
})
public class GetRtnRight {

    protected String arg0;
    protected String arg1;

    /**
     * 获取arg0属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getArg0() {
        return arg0;
    }

    /**
     * 设置arg0属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setArg0(String value) {
        this.arg0 = value;
    }

    /**
     * 获取arg1属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getArg1() {
        return arg1;
    }

    /**
     * 设置arg1属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setArg1(String value) {
        this.arg1 = value;
    }

}
