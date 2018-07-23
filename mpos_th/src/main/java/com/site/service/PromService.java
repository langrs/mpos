package com.site.service;

import com.site.dao.*;
import com.site.entity.*;
import com.site.entity.respon.GetCardRuleResult;
import com.site.entity.respon.GetPromResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by langrs on 2017-03-17.
 *
 */
@Service(value = "PromService")
public class PromService {
    //积分规则主表
    @Resource
    TfCardTypeRuleDao tfCardTypeRuleDao;
    //积分规则明细表
    @Resource
    TfCardTypeRuleDetailDao tfCardTypeRuleDetailDao;
    //一般促销积分规则表
    @Resource
    TeGenDao teGenDao;
    //一般促销规则明细表
    @Resource
    TeGenPriceInfoDao teGenPriceInfoDao;
    //促销对象
    @Resource
    TePromObjetDao tePromObjetDao;
    //促销对象明细
    @Resource
    TePromObjetDetailDao tePromObjetDetailDao;
    //满额满量促销单
    @Resource
    TeFullDao teFullDao;
    //满额满量促销单明细
    @Resource
    TeFullPriceDao teFullPriceDao;
    @Resource
    TeFullGoodsDao teFullGoodsDao;
    //满额条件
    @Resource
    TePromPreDao tePromPreDao;
    @Resource
    TePromPreDetailDao tePromPreDetailDao;
    //收卡规则
    TfCardRuleDao tfCardRuleDao;
    //收卡规则明细
    TfCardRuleDetailDao tfCardRuleDetailDao;
    //收卡规则限制条款
    TfCardRuleAmtDao tfCardRuleAmtDao;
    //收券规则
    TaCouponRuleDao taCouponRuleDao;
    //收券规则明细
    TaCouponRuleDetailDao taCouponRuleDetailDao;
    //收券规则限制条款
    TaCouponRuleAmtDao taCouponRuleAmtDao;

    //调用的入口函数,把所有的规则全部检合并
    public void readyRule(PromInfo promInfo) {
        //会员积分规则
        pointRule(promInfo);
        //会员折扣规则
        memberDiscRuld(promInfo);
        //一般促销规则
        genRuld(promInfo);
        //满额满赠促销规则
        fullRull(promInfo);
        //收卡规则
        cardRule(promInfo);
        //收券规则


    }
    //收券规则
    public void couponRule(PromInfo promInfo){
        QueryMap queryMap = new QueryMap();
        queryMap.put("shop",promInfo.getShop());
        List<GetCardRuleResult> getCardRuleResults = taCouponRuleDao.getCouponRule(promInfo.getShop());
        if(getCardRuleResults == null){
            return;
        }
        for (GetCardRuleResult getCardRuleResult : getCardRuleResults) {
            for(PromPlu promPlu:promInfo.getPromPlus()){
                String ruleway = getCardRuleResult.getRuleway();
                queryMap.clear();
                if(ruleway.equals("C")){ //商品属性1
                    queryMap.put("code",promPlu.getFgroup1());
                }else if(ruleway.equals("D")){
                    queryMap.put("code",promPlu.getFgroup2());
                }else if(ruleway.equals("E")){
                    queryMap.put("code",promPlu.getFgroup3());
                }else if(ruleway.equals("F")){
                    queryMap.put("code",promPlu.getFgroup4());
                }else if(ruleway.equals("G")){
                    queryMap.put("code",promPlu.getFgroup5());
                }else if(ruleway.equals("H")){
                    queryMap.put("code",promPlu.getFgroup6());
                }else if(ruleway.equals("J")){
                    queryMap.put("code",promPlu.getFgroup8());
                }else if(ruleway.equals("I")){
                    queryMap.put("code",promPlu.getFgroup7());
                }else if(ruleway.equals("K")){//商品属性9
                    queryMap.put("code",promPlu.getFgroup9());
                }else if(ruleway.equals("5")){ //商品品类
                    queryMap.put("code",promPlu.getSno());
                }else if(ruleway.equals("4")){ //商品编号
                    queryMap.put("code",promPlu.getPluno());
                }else if(ruleway.equals("8")){//商品品牌
                    queryMap.put("code",promPlu.getBrand());
                }
                queryMap.put("ruleno", getCardRuleResult.getRuleno());
                queryMap.put("cnfflg", "Y");
                TaCouponRuleDetail taCouponRuleDetail = taCouponRuleDetailDao.getOne(queryMap);
                if(taCouponRuleDetail == null){continue;}
                //如果有符合条件的记录,则记录该收卡规则
                queryMap.clear();
                queryMap.put("ruleno",getCardRuleResult.getRuleno());
                queryMap.put("cnfflg","Y");
                //因为这个设备只是给专柜使用,一个专柜下面的商品,一般只会有一种限制收券的规则,
                //所以一旦找到一种规则,则全部退出去
                List<TaCouponRuleAmt> taCouponRuleAmts = taCouponRuleAmtDao.getList(queryMap);
                promInfo.setTaCouponRuleAmts(taCouponRuleAmts);
                break;
            }
        }
    }
    //收卡规则
    public void cardRule(PromInfo promInfo){
        QueryMap queryMap = new QueryMap();
        queryMap.put("shop",promInfo.getShop());
        List<GetCardRuleResult> getCardRuleResults = tfCardRuleDao.getCardRule(promInfo.getShop());
        if(getCardRuleResults == null){
            return;
        }
        for (GetCardRuleResult getCardRuleResult : getCardRuleResults) {
            for(PromPlu promPlu:promInfo.getPromPlus()){
                String ruleway = getCardRuleResult.getRuleway();
                queryMap.clear();
                if(ruleway.equals("C")){ //商品属性1
                    queryMap.put("code",promPlu.getFgroup1());
                }else if(ruleway.equals("D")){
                    queryMap.put("code",promPlu.getFgroup2());
                }else if(ruleway.equals("E")){
                    queryMap.put("code",promPlu.getFgroup3());
                }else if(ruleway.equals("F")){
                    queryMap.put("code",promPlu.getFgroup4());
                }else if(ruleway.equals("G")){
                    queryMap.put("code",promPlu.getFgroup5());
                }else if(ruleway.equals("H")){
                    queryMap.put("code",promPlu.getFgroup6());
                }else if(ruleway.equals("I")){
                    queryMap.put("code",promPlu.getFgroup7());
                }else if(ruleway.equals("J")){
                    queryMap.put("code",promPlu.getFgroup8());
                }else if(ruleway.equals("4")){ //商品编号
                    queryMap.put("code",promPlu.getPluno());
                }else if(ruleway.equals("K")){//商品属性9
                    queryMap.put("code",promPlu.getFgroup9());
                }else if(ruleway.equals("5")){ //商品品类
                    queryMap.put("code",promPlu.getSno());
                }else if(ruleway.equals("8")){//商品品牌
                    queryMap.put("code",promPlu.getBrand());
                }
                queryMap.put("ruleno", getCardRuleResult.getRuleno());
                queryMap.put("cnfflg", "Y");
                TfCardRuleDetail tfCardRuleDetail = tfCardRuleDetailDao.getOne(queryMap);
                if(tfCardRuleDetail == null){continue;}
                //如果有符合条件的记录,则记录该收卡规则
                queryMap.clear();
                queryMap.put("ruleno",getCardRuleResult.getRuleno());
                queryMap.put("cnfflg","Y");
                //因为这个设备只是给专柜使用,一个专柜下面的商品,一般只会有一种限制收卡的规则,
                //所以一旦找到一种规则,则全部退出去
                List<TfCardRuleAmt> tfCardRuleAmts = tfCardRuleAmtDao.getList(queryMap);
                promInfo.setTfCardRuleAmts(tfCardRuleAmts);
                break;
            }
        }

    }
    //会员积分规则
    public void pointRule(PromInfo promInfo) {
        if (promInfo.getCardno() == null || promInfo.getCardno() == "") {
            return;
        }

        QueryMap queryMap = new QueryMap();
        String lbdate = new SimpleDateFormat("yyyyMMdd").format(new Date());
        queryMap.put("cnfflg", "Y");
        queryMap.put("organizationno", promInfo.getShop());
        //规则为积分
        queryMap.put("ruletype", "1");
        queryMap.put("lbdate", lbdate);
        //按照会员等级查询
        queryMap.put("ctnotype", "2");
        //当前的会员等级条件
        queryMap.put("ctno", promInfo.getMembergrade());
        List<TfCardTypeRule> tfCardTypeRules = tfCardTypeRuleDao.getList(queryMap);
        if (tfCardTypeRules == null) {
            return;
        }
        //循环所有的符合条件的积分规则
        for (TfCardTypeRule tfCardTypeRule : tfCardTypeRules) {
            String ruleway = tfCardTypeRule.getRuleway();
            //按照销售条码来进行循环看条码是否符合规则
            for (PromPlu promPlu : promInfo.getPromPlus()) {
                //如果该条码前面没有被处理过,那么继续,如果已经有积分参数的数据了,则就直接跳过,不做处理了,因为是按照优先级来
                //排序的,前面的条款已经生效的的话,就可以了
                if (promPlu.getDeffull() != null && promPlu.getDeffull() != 0) {
                    continue;
                }

                TfCardTypeRuleDetail tfCardTypeRuleDetail = null;
                queryMap.clear();
                //!!!!!!!!!!!!!!!!!!!!!!!!!!这里按照条件来检索!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                if (ruleway.equals("4") || ruleway.equals("T")) {  //按商品编号
                    queryMap.put("code", promPlu.getPluno());
                } else if (ruleway.equals("5")) {  //按照商品品类
                    queryMap.put("code", promPlu.getSno());
                }
                queryMap.put("ruleno", tfCardTypeRule.getRuleno());
                queryMap.put("cnfflg", "Y");
                queryMap.put("ruletype", "1");
                tfCardTypeRuleDetail = tfCardTypeRuleDetailDao.getOne(queryMap);
                if (tfCardTypeRuleDetail == null) {
                    continue;
                }
                //设置积分的参数
                promPlu.setDefunit(tfCardTypeRuleDetail.getDefunit());
                promPlu.setDeffull(tfCardTypeRuleDetail.getDeffull());
                promPlu.setStdscore(tfCardTypeRuleDetail.getStdscore());
                promPlu.setUnitscore(tfCardTypeRuleDetail.getUnitscore());
                promPlu.setPcexstdscore(tfCardTypeRuleDetail.getPcexstdscore());
                promPlu.setPcexunitscore(tfCardTypeRuleDetail.getPcexunitscore());
            }
        }
    }

    //会员折扣规则
    public void memberDiscRuld(PromInfo promInfo) {
        if (promInfo.getCardno() == null || promInfo.getCardno().trim().equals("")) {
            return;
        }

        QueryMap queryMap = new QueryMap();
        String lbdate = new SimpleDateFormat("yyyyMMdd").format(new Date());
        queryMap.put("cnfflg", "Y");
        queryMap.put("organizationno", promInfo.getShop());
        //规则为会员卡折扣
        queryMap.put("ruletype", "2");
        queryMap.put("lbdate", lbdate);
        //按照会员等级查询
        queryMap.put("ctnotype", "2");
        //当前的会员等级条件
        queryMap.put("ctno", promInfo.getMembergrade());
        List<TfCardTypeRule> tfCardTypeRules = tfCardTypeRuleDao.getList(queryMap);
        if (tfCardTypeRules == null) {
            return;
        }
        //循环所有的符合条件的积分规则
        for (TfCardTypeRule tfCardTypeRule : tfCardTypeRules) {
            String ruleway = tfCardTypeRule.getRuleway();
            //按照销售条码来进行循环看条码是否符合规则
            for (PromPlu promPlu : promInfo.getPromPlus()) {
                //如果该条码前面没有被处理过,那么继续,如果已经有参数的数据了,则就直接跳过,不做处理了,因为是按照优先级来
                //排序的,前面的条款已经生效的的话,就可以了
                if (promPlu.getVipdisc() != null && promPlu.getVipdisc() != 0) {
                    continue;
                }

                TfCardTypeRuleDetail tfCardTypeRuleDetail = null;
                queryMap.clear();
                //!!!!!!!!!!!!!!!!!!!!!!!!!!这里按照条件来检索!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                if (ruleway.equals("4") || ruleway.equals("T")) {  //按商品编号
                    queryMap.put("code", promPlu.getPluno());
                } else if (ruleway.equals("5")) {  //按照商品品类
                    queryMap.put("code", promPlu.getSno());
                }
                queryMap.put("ruleno", tfCardTypeRule.getRuleno());
                queryMap.put("cnfflg", "Y");
                queryMap.put("ruletype", "3");
                tfCardTypeRuleDetail = tfCardTypeRuleDetailDao.getOne(queryMap);
                if (tfCardTypeRuleDetail == null) {
                    continue;
                }
                //如果已经设置过了会员折扣,则不再处理了,按优先级来生效
                if (promPlu.getDisc() != null && promPlu.getDisc() > 0) {
                    continue;
                }
                //设置会员折扣的参数
                promPlu.setVipdisc(tfCardTypeRuleDetail.getDisc());
            }
        }
    }

    //一般促销规则
    public void genRuld(PromInfo promInfo) {
        QueryMap queryMap = new QueryMap();
        queryMap.put("shop", promInfo.getShop());
        List<GetPromResult> getPromResults = teGenDao.getPromResult(promInfo.getShop());
        if (getPromResults == null) {
            return;
        }
        for (GetPromResult getPromResult : getPromResults) {
            for (PromPlu promPlu : promInfo.getPromPlus()) {
                //针对商品(品牌,品类,属性)等获取促销商品
                String flag = null;
                String type = getPromResult.getType();
                String promway = getPromResult.getPromway();
                //判断是否该商品已经被处理过一般促销了,按照优先级的顺序,只处理一次
                flag = promPlu.getFlag();
                if (flag != null && flag.equals("1")) {
                    continue;
                }

                queryMap.clear();
                if (type.equals("4")) {  //商品编码
                    queryMap.put("code", promPlu.getPluno());
                } else if (type.equals("5")) { //品类
                    queryMap.put("code", promPlu.getSno());
                }
                queryMap.put("promno", getPromResult.getPromno());
                queryMap.put("cnfflg", "Y");
                TeGenPriceInfo teGenPriceInfo = teGenPriceInfoDao.getOne(queryMap);
                if (teGenPriceInfo == null) {
                    continue;
                }
                //如果找到了商品的话,就可以查看该促销对应的生效对象,因为折扣和倍换的参数都在promObject表中
                queryMap.clear();
                queryMap.put("promno", getPromResult.getPromno());
                queryMap.put("cnfflg", "Y");
                //针对散客和会员获取促销对象设定参数
                if (promInfo.getCardno() != null && promInfo.getCardno().length() > 1) {
                    queryMap.put("objecttype", "2");
                } else {
                    queryMap.put("objecttype", "1");
                }
                List<TePromObjet> tePromObjets = tePromObjetDao.getList(queryMap);
                if (tePromObjets == null) {
                    continue;
                }

                if (promway.equals("2")) { //折扣
                    promPlu.setPromwayamt(tePromObjets.get(0).getPromwayamt());
                    promPlu.setFlag("1");
                } else if (promway.equals("4")) { //倍换
                    promPlu.setTimesstd(tePromObjets.get(0).getTimesstd());
                    promPlu.setTimesdou(tePromObjets.get(0).getTimesdou());
                    promPlu.setFlag("1");
                }
            }

        }

    }

    //满额满赠促销规则
    public void fullRull(PromInfo promInfo) {
        String parobjet = null;
        QueryMap queryMap = new QueryMap();
        queryMap.put("shop", promInfo.getShop());
        if (promInfo.getCardno() != null && promInfo.getCardno().length() > 2) { //会员
            parobjet = "2";
        } else { //散客
            parobjet = "1";
        }
        List<GetPromResult> getPromResults = teFullDao.getPromResult(promInfo.getShop(), parobjet);
        if (getPromResults == null) {
            return;
        }
        List<PromFull> promFulls = new ArrayList<PromFull>();
        for (GetPromResult getPromResult : getPromResults) {
            queryMap.clear();
            queryMap.put("promno", getPromResult.getPromno());
            //第一次选出来的信息不全,重新取一次资料
            TeFull teFull = teFullDao.getOne(queryMap);
            //循环判断条码
            for (PromPlu promPlu : promInfo.getPromPlus()) {
                //针对商品(品牌,品类,属性)等获取促销商品
                String flag = null;
                String promtype = null;
                String type = getPromResult.getType();
                String promway = getPromResult.getPromway();
                //判断是否该商品已经被处理过满额促销了,按照优先级的顺序,只处理一次
                //如果flag=1的话,是已经处理过的一般促销规则,允许叠加促销的算法为先计算一般促销,
                // 再计算满额促销,所以允许再进行满额促销的规则设置
                flag = promPlu.getFlag();
                if (flag != null && flag.equals("2")) {
                    continue;
                }
                queryMap.clear();
                if (type.equals("4")) {  //商品编码
                    queryMap.put("code", promPlu.getPluno());
                } else if (type.equals("5")) { //品类
                    queryMap.put("code", promPlu.getSno());
                }
                queryMap.put("promno", getPromResult.getPromno());
                queryMap.put("cnfflg", "Y");
                TeFullGoods teFullGoods = teFullGoodsDao.getOne(queryMap);
                if (teFullGoods == null) {
                    continue;
                }

                if (promway.equals("3")) { //折让,就是满减
                    promtype = "2";
                } else if (promway.equals("2") && getPromResult.getCanexchange().equals("Y")) {  //折扣(满赠)
                    promtype = "3";
                } else if (promway.equals("2") && getPromResult.getCanexchange().equals("N")) {  //折扣(打折)
                    promtype = "1";
                }
                //处理满额条件表
                queryMap.clear();
                queryMap.put("promno", getPromResult.getPromno());
                queryMap.put("cnfflg", "Y");
                List<TeFullPrice> teFullPrices = teFullPriceDao.getList(queryMap);
                if (teFullPrices == null) {
                    continue;
                }
                //循环满额条件表,这个条件表可能有多行,以Condgroupno为主键,例如有满100,有满200,满300等多条记录,
                //对应了赠送或减金额的表也是多条记录,所以需要循环获取

                for (TeFullPrice teFullPrice : teFullPrices) {
                    PromFull promFull = new PromFull();
                    if (promtype.equals("3")) { //如果是满额赠送促销,需要获取赠送商品(卡/券)表
                        queryMap.clear();
                        queryMap.put("promno", getPromResult.getPromno());
                        queryMap.put("cnfflg", "Y");
                        queryMap.put("exchangegroupno", teFullPrice.getCondgroupno());
                        TePromPreDetail tePromPreDetail = tePromPreDetailDao.getOne(queryMap);
                        if (tePromPreDetail == null) {
                            continue;
                        }
                        promFull.setPromno(teFullPrice.getPromno());
                        promFull.setPromtype(promtype);
                        promFull.setCondGroupNO(teFullPrice.getCondgroupno());
                        //满额条件
                        promFull.setCondfull(teFullPrice.getCondfull());
                        promFull.setRebaterate(teFullPrice.getRebaterate());
                        //赠送类型,例如卡,券,商品等
                        promFull.setExchangetype(tePromPreDetail.getType());
                        //赠送类型编码,例如什么卡种,什么券种,什么商品等
                        promFull.setExchangecode(tePromPreDetail.getCode());
                        //满额赠送金额
                        promFull.setQuota(tePromPreDetail.getQuota());

                    } else {  //打折或满减,获取te_PromObjet表的折扣金额(满减金额)
                        queryMap.clear();
                        queryMap.put("promno", getPromResult.getPromno());
                        queryMap.put("cnfflg", "Y");
                        //判断是否会员
                        queryMap.put("objecttype", parobjet);
                        //条件组别
                        queryMap.put("condgroupno", teFullPrice.getCondgroupno());
                        TePromObjet tePromObjet = tePromObjetDao.getOne(queryMap);
                        promFull.setPromno(teFullPrice.getPromno());
                        promFull.setPromtype(promtype);
                        //条件组别
                        promFull.setCondGroupNO(teFullPrice.getCondgroupno());
                        //满额条件
                        promFull.setCondfull(teFullPrice.getCondfull());
                        promFull.setRebaterate(teFullPrice.getRebaterate());
                        //满减金额或满额打折率
                        promFull.setPromwayamt(tePromObjet.getPromwayamt());
                    }
                    promFulls.add(promFull);
                }
            }

        }
        if(promFulls != null){
            promInfo.setPromFulls(promFulls);
        }
    }
}

