package com.site.service;

import java.util.List;

import com.site.core.base.Manager;
import com.site.entity.RoleRes;

/**
 * RoleRes Service 层
 * @author site
 */

public interface RoleResService extends Manager<Long, RoleRes>
{

	List<RoleRes> getByRoleId(Long pk);

	void deleteByRoleId(Long pk);
	
}