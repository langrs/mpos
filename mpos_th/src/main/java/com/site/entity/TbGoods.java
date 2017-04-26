package com.site.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
 /**
 * FUNCTION:TbGoods Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 @JsonIgnoreProperties({"spec","fsal","fsba","fsod","deftime","reservedfileld","tiisbag","helpno",
		 "rareaclass","rareatype","companyno","organizationno","trantime","placeno","pricezone","counterno",
		 "plutype","plufunc","fgroup8","fgroup9","fgroup10","cnfflg","sunit","fgroup2",
		 "fgroup3","fgroup4","fgroup5","fgroup6","fgroup7","isfeature",
		 "isopenwin","series","fgroup1"})
 @ApiModel(value = "商品基本信息",description = "TbGoods")
public class TbGoods implements Serializable
{
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value = "销售条码")
	protected String pluno;
	@ApiModelProperty(value = "销售名称")
	protected String pluname;
	@ApiModelProperty(hidden = true)
	protected String spec;
	@ApiModelProperty(hidden = true)
	protected String fsal;
	@ApiModelProperty(hidden = true)
	protected String fsba;
	@ApiModelProperty(hidden = true)
	protected String fsod;
	@ApiModelProperty(hidden = true)
	protected String deftime;
	@ApiModelProperty(hidden = true)
	protected String reservedfileld;
	@ApiModelProperty(hidden = true)
	protected String tiisbag;
	@ApiModelProperty(hidden = true)
	protected String helpno;
	@ApiModelProperty(hidden = true)
	protected String rareaclass;
	@ApiModelProperty(hidden = true)
	protected String rareatype;
	@ApiModelProperty(value = "商品税别")
	protected String taxcode;
	@ApiModelProperty(hidden = true)
	protected String companyno;
	@ApiModelProperty(hidden = true)
	protected String organizationno;
	@ApiModelProperty(hidden = true)
	protected String trantime;
	@ApiModelProperty(value = "销售库区")
	protected String rarea;
	@ApiModelProperty(hidden = true)
	protected String counterno;
	@ApiModelProperty(hidden = true)
	protected String placeno;
	@ApiModelProperty(hidden = true)
	protected String pricezone;
	@ApiModelProperty(hidden = true)
	protected String plutype;
	@ApiModelProperty(hidden = true)
	protected String plufunc;
	@ApiModelProperty(hidden = true)
	protected String fgroup8;
	@ApiModelProperty(hidden = true)
	protected String fgroup9;
	@ApiModelProperty(hidden = true)
	protected String fgroup10;
	@ApiModelProperty(hidden = true)
	protected String cnfflg;
	@ApiModelProperty(hidden = true)
	protected String iscountergoods;
	@ApiModelProperty(hidden = true)
	protected String sunit;
	@ApiModelProperty(hidden = true)
	protected String fgroup2;
	@ApiModelProperty(hidden = true)
	protected String fgroup3;
	@ApiModelProperty(hidden = true)
	protected String fgroup4;
	@ApiModelProperty(hidden = true)
	protected String fgroup5;
	@ApiModelProperty(hidden = true)
	protected String fgroup6;
	@ApiModelProperty(hidden = true)
	protected String fgroup7;
	@ApiModelProperty(hidden = true)
	protected String isfeature;
	@ApiModelProperty(hidden = true)
	protected String isopenwin;
	@ApiModelProperty(hidden = true)
	protected String series;
	@ApiModelProperty(value = "商品品类")
	protected String sno;
	@ApiModelProperty(value = "商品品牌")
	protected String brand;
	@ApiModelProperty(hidden = true)
	protected String fgroup1;
	public void setPluno(String pluno)
	{
		this.pluno = pluno;
	}
	public String getPluno()
	{
		return this.pluno;
	}
	public void setPluname(String pluname)
	{
		this.pluname = pluname;
	}
	public String getPluname()
	{
		return this.pluname;
	}
	public void setSpec(String spec)
	{
		this.spec = spec;
	}
	public String getSpec()
	{
		return this.spec;
	}
	public void setFsal(String fsal)
	{
		this.fsal = fsal;
	}
	public String getFsal()
	{
		return this.fsal;
	}
	public void setFsba(String fsba)
	{
		this.fsba = fsba;
	}
	public String getFsba()
	{
		return this.fsba;
	}
	public void setFsod(String fsod)
	{
		this.fsod = fsod;
	}
	public String getFsod()
	{
		return this.fsod;
	}
	public void setDeftime(String deftime)
	{
		this.deftime = deftime;
	}
	public String getDeftime()
	{
		return this.deftime;
	}
	public void setReservedfileld(String reservedfileld)
	{
		this.reservedfileld = reservedfileld;
	}
	public String getReservedfileld()
	{
		return this.reservedfileld;
	}
	public void setTiisbag(String tiisbag)
	{
		this.tiisbag = tiisbag;
	}
	public String getTiisbag()
	{
		return this.tiisbag;
	}
	public void setHelpno(String helpno)
	{
		this.helpno = helpno;
	}
	public String getHelpno()
	{
		return this.helpno;
	}
	public void setRareaclass(String rareaclass)
	{
		this.rareaclass = rareaclass;
	}
	public String getRareaclass()
	{
		return this.rareaclass;
	}
	public void setRareatype(String rareatype)
	{
		this.rareatype = rareatype;
	}
	public String getRareatype()
	{
		return this.rareatype;
	}
	public void setTaxcode(String taxcode)
	{
		this.taxcode = taxcode;
	}
	public String getTaxcode()
	{
		return this.taxcode;
	}
	public void setCompanyno(String companyno)
	{
		this.companyno = companyno;
	}
	public String getCompanyno()
	{
		return this.companyno;
	}
	public void setOrganizationno(String organizationno)
	{
		this.organizationno = organizationno;
	}
	public String getOrganizationno()
	{
		return this.organizationno;
	}
	public void setTrantime(String trantime)
	{
		this.trantime = trantime;
	}
	public String getTrantime()
	{
		return this.trantime;
	}
	public void setRarea(String rarea)
	{
		this.rarea = rarea;
	}
	public String getRarea()
	{
		return this.rarea;
	}
	public void setCounterno(String counterno)
	{
		this.counterno = counterno;
	}
	public String getCounterno()
	{
		return this.counterno;
	}
	public void setPlaceno(String placeno)
	{
		this.placeno = placeno;
	}
	public String getPlaceno()
	{
		return this.placeno;
	}
	public void setPricezone(String pricezone)
	{
		this.pricezone = pricezone;
	}
	public String getPricezone()
	{
		return this.pricezone;
	}
	public void setPlutype(String plutype)
	{
		this.plutype = plutype;
	}
	public String getPlutype()
	{
		return this.plutype;
	}
	public void setPlufunc(String plufunc)
	{
		this.plufunc = plufunc;
	}
	public String getPlufunc()
	{
		return this.plufunc;
	}
	public void setFgroup8(String fgroup8)
	{
		this.fgroup8 = fgroup8;
	}
	public String getFgroup8()
	{
		return this.fgroup8;
	}
	public void setFgroup9(String fgroup9)
	{
		this.fgroup9 = fgroup9;
	}
	public String getFgroup9()
	{
		return this.fgroup9;
	}
	public void setFgroup10(String fgroup10)
	{
		this.fgroup10 = fgroup10;
	}
	public String getFgroup10()
	{
		return this.fgroup10;
	}
	public void setCnfflg(String cnfflg)
	{
		this.cnfflg = cnfflg;
	}
	public String getCnfflg()
	{
		return this.cnfflg;
	}
	public void setIscountergoods(String iscountergoods)
	{
		this.iscountergoods = iscountergoods;
	}
	public String getIscountergoods()
	{
		return this.iscountergoods;
	}
	public void setSunit(String sunit)
	{
		this.sunit = sunit;
	}
	public String getSunit()
	{
		return this.sunit;
	}
	public void setFgroup2(String fgroup2)
	{
		this.fgroup2 = fgroup2;
	}
	public String getFgroup2()
	{
		return this.fgroup2;
	}
	public void setFgroup3(String fgroup3)
	{
		this.fgroup3 = fgroup3;
	}
	public String getFgroup3()
	{
		return this.fgroup3;
	}
	public void setFgroup4(String fgroup4)
	{
		this.fgroup4 = fgroup4;
	}
	public String getFgroup4()
	{
		return this.fgroup4;
	}
	public void setFgroup5(String fgroup5)
	{
		this.fgroup5 = fgroup5;
	}
	public String getFgroup5()
	{
		return this.fgroup5;
	}
	public void setFgroup6(String fgroup6)
	{
		this.fgroup6 = fgroup6;
	}
	public String getFgroup6()
	{
		return this.fgroup6;
	}
	public void setFgroup7(String fgroup7)
	{
		this.fgroup7 = fgroup7;
	}
	public String getFgroup7()
	{
		return this.fgroup7;
	}
	public void setIsfeature(String isfeature)
	{
		this.isfeature = isfeature;
	}
	public String getIsfeature()
	{
		return this.isfeature;
	}
	public void setIsopenwin(String isopenwin)
	{
		this.isopenwin = isopenwin;
	}
	public String getIsopenwin()
	{
		return this.isopenwin;
	}
	public void setSeries(String series)
	{
		this.series = series;
	}
	public String getSeries()
	{
		return this.series;
	}
	public void setSno(String sno)
	{
		this.sno = sno;
	}
	public String getSno()
	{
		return this.sno;
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public String getBrand()
	{
		return this.brand;
	}
	public void setFgroup1(String fgroup1)
	{
		this.fgroup1 = fgroup1;
	}
	public String getFgroup1()
	{
		return this.fgroup1;
	}
}  