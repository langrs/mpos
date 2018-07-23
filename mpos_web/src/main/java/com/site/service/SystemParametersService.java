package com.site.service;

import java.util.List;

import com.site.core.base.Manager;
import com.site.entity.SystemParameters;

/**
 * SystemParameters Service 层
 * 
 * @author site
 */

public interface SystemParametersService extends Manager<Long, SystemParameters> {
	public List<SystemParameters> getParametersByType(String type);
}