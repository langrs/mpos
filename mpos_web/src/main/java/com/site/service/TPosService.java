package com.site.service;

import com.site.core.base.Manager;
import com.site.entity.TPos;
import com.site.entity.TStore;

/**
 * TPos Service 层
 * @author site
 */

public interface TPosService extends Manager<Long, TPos>
{
	void registPos(TPos tPos, TStore tStore);
}