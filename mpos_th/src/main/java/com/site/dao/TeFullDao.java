package com.site.dao;

import com.site.base.MyBatisDaoImpl;
import com.site.entity.QueryMap;
import com.site.entity.TeFull;
import com.site.entity.respon.GetPromResult;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 对象功能:TeFull Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TeFullDao extends MyBatisDaoImpl<String, TeFull> 
{
	@Override
	public String getNamespace() {
		return TeFull.class.getName();
	}
	//获取当天有效的所有的分店满额满量促销单
	public List<GetPromResult> getPromResult(String shop,String parobjet){
		String parm;
		QueryMap queryMap = new QueryMap();
		queryMap.put("lbdate",new SimpleDateFormat("yyyyMMdd").format(new Date()));
		//会员还是散客,根据这个条件去过滤单据,当前销售单是刷卡消费还是散客消费
		//因为如果是用in条件的话,比较麻烦,在mybatis里面还要使用foreach这种方式来组合,所有干脆分开了2个查询条件
		queryMap.put("shop",shop);
		if (parobjet.equals("2")){
			parm = getNamespace() + ".getPromHy";
		}else{
			parm = getNamespace() + ".getPromSk";
		}
		return sqlSessionTemplate.selectList(parm,queryMap);
	}
}
