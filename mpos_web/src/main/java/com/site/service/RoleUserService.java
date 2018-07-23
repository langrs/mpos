package com.site.service;

import java.util.List;

import com.site.core.base.Manager;
import com.site.entity.RoleUser;

/**
 * RoleUser Service 层
 * @author site
 */

public interface RoleUserService extends Manager<Long, RoleUser>
{

	List<RoleUser> getByUserId(Long userId);
	
}