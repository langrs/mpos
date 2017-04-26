package com.site.dao;

import com.site.base.MyBatisDaoImpl;
import com.site.entity.QueryMap;
import com.site.entity.TfCardRule;
import com.site.entity.respon.GetCardRuleResult;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 对象功能:TfCardRule Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TfCardRuleDao extends MyBatisDaoImpl<String, TfCardRule> 
{
	@Override
	public String getNamespace() {
		return TfCardRule.class.getName();
	}
	//获取当天有效的分店所有的收卡规则
	public List<GetCardRuleResult> getCardRule(String shop){
		QueryMap queryMap = new QueryMap();
		queryMap.put("lbdate",new SimpleDateFormat("yyyyMMdd").format(new Date()));
		queryMap.put("shop",shop);
		return sqlSessionTemplate.selectList(getNamespace() + ".getCardRule",queryMap);
	}
}
