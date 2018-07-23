package com.site.service;

import java.util.List;

import com.site.core.base.Manager;
import com.site.entity.Nav;

/**
 * Nav Service 层
 * @author site
 */

public interface NavService extends Manager<Long, Nav>
{

	List<Nav> getByParent(Long parent);

	Nav getByPath(String path);

	
}