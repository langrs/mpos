package com.site.service;

import com.site.core.base.Manager;
import com.site.entity.User;

/**
 * User Service 层
 * @author site
 */

public interface UserService extends Manager<Long, User>
{

	User getByUserNo();
	
}