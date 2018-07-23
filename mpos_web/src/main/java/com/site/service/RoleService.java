package com.site.service;

import com.site.core.base.Manager;
import com.site.entity.Role;

/**
 * Role Service 层
 * @author site
 */

public interface RoleService extends Manager<Long, Role>
{

	void createRoleRes(Role role, Long[] permIds);
	void updateRoleRes(Role role, Long[] permIds);
	void removeRoleAndRoleRes(Long id, Long[] ids);
	
}