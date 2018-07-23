package com.site.service;

import com.site.core.base.Manager;
import com.site.entity.TCode;

import java.util.List;

/**
 * TCode Service 层
 * @author site
 */

public interface TCodeService extends Manager<Long, TCode>
{
	public List<TCode> queryByCodeType(List<String> codeType);
}