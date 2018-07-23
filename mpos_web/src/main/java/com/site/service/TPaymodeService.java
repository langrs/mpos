package com.site.service;

import com.site.core.base.Manager;
import com.site.entity.TPaymode;

import java.util.List;

/**
 * TPaymode Service 层
 * @author site
 */

public interface TPaymodeService extends Manager<Long, TPaymode>
{
	List<TPaymode> queryRight(String userNo);
}