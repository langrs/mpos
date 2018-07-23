
package com.site.webService.call;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>czkQuery complex type?? Java ??
 * 
 * <p>????????????????????????????????
 * 
 * <pre>
 * &lt;complexType name="czkQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdinfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shopId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "czkQuery", propOrder = {
    "cdinfo",
    "shopId"
})
public class CzkQuery {

    protected String cdinfo;
    protected String shopId;

    /**
     * ???cdinfo????????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdinfo() {
        return cdinfo;
    }

    /**
     * ????cdinfo????????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdinfo(String value) {
        this.cdinfo = value;
    }

    /**
     * ???shopId????????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopId() {
        return shopId;
    }

    /**
     * ????shopId????????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopId(String value) {
        this.shopId = value;
    }

}
