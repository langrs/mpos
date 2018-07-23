package com.site.core.mybatis;


import com.site.core.base.IdGenerator;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 *
 * @author csx
 */
public abstract class AbstractDaoImpl<PK extends Serializable,T extends Serializable> implements Dao<PK,T>{
	  @Resource
	  protected IdGenerator idGenerator;
}
