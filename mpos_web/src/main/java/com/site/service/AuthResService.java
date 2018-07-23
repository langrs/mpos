package com.site.service;

import java.util.List;

import com.site.core.base.Manager;
import com.site.entity.AuthRes;

/**
 * AuthRes Service 层
 * @author site
 */

public interface AuthResService extends Manager<Long, AuthRes>
{

	List<AuthRes> getByNavId(Long id);
	
}