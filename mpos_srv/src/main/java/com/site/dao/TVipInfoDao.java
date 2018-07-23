package com.site.dao;

import com.site.base.MyBatisDaoImpl;
import com.site.entity.TVipInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 对象功能:TVipInfo Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TVipInfoDao extends MyBatisDaoImpl<String, TVipInfo> 
{
	@Override
	public String getNamespace() {
		return TVipInfo.class.getName();
	}

	//根据会员卡号/手机号查询会员资料
	public List<TVipInfo> getByBillno(String billno){
		List<TVipInfo> tVipInfos = sqlSessionTemplate.selectList(getNamespace() + ".getByBillno", billno);
		return tVipInfos;
	}
}
