
package com.site.webService.call;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>makeJffl complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="makeJffl"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arg2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arg3" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="arg4" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="arg5" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "makeJffl", propOrder = {
    "arg0",
    "arg1",
    "arg2",
    "arg3",
    "arg4",
    "arg5"
})
public class MakeJffl {

    protected String arg0;
    protected String arg1;
    protected String arg2;
    protected double arg3;
    protected double arg4;
    protected double arg5;

    /**
     * ��ȡarg0���Ե�ֵ��
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
     * ����arg0���Ե�ֵ��
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
     * ��ȡarg1���Ե�ֵ��
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
     * ����arg1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg1(String value) {
        this.arg1 = value;
    }

    /**
     * ��ȡarg2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg2() {
        return arg2;
    }

    /**
     * ����arg2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg2(String value) {
        this.arg2 = value;
    }

    /**
     * ��ȡarg3���Ե�ֵ��
     * 
     */
    public double getArg3() {
        return arg3;
    }

    /**
     * ����arg3���Ե�ֵ��
     * 
     */
    public void setArg3(double value) {
        this.arg3 = value;
    }

    /**
     * ��ȡarg4���Ե�ֵ��
     * 
     */
    public double getArg4() {
        return arg4;
    }

    /**
     * ����arg4���Ե�ֵ��
     * 
     */
    public void setArg4(double value) {
        this.arg4 = value;
    }

    /**
     * ��ȡarg5���Ե�ֵ��
     * 
     */
    public double getArg5() {
        return arg5;
    }

    /**
     * ����arg5���Ե�ֵ��
     * 
     */
    public void setArg5(double value) {
        this.arg5 = value;
    }

}
