package com.site.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.base.IdGenerator;
import com.site.core.mybatis.Dao;
import com.site.core.mybatis.QueryMap;
import com.site.dao.RoleDao;
import com.site.entity.Role;
import com.site.entity.RoleRes;
import com.site.entity.RoleUser;
import com.site.service.RoleResService;
import com.site.service.RoleService;
import com.site.service.RoleUserService;

/**
 * Role Service Impl层
 * 
 * @author site
 * 
 */
@Service("RoleService")
public class RoleServiceImpl extends AbstractManagerImpl<Long, Role> implements RoleService {

	@Resource
	RoleDao dao;
	@Resource
	RoleResService roleResService;
	@Resource
	RoleUserService roleUserService;
	 @Resource
	  protected IdGenerator idGenerator;
	@Override
	protected Dao<Long, Role> getDao() {
		return dao;
	}

	@Override
	public void createRoleRes(Role role, Long[] permIds) {
		dao.create(role);
		Long roleId = role.getId();
		for (Long resId : permIds) {
			RoleRes entity = new RoleRes();
			entity.setResId(resId);
			entity.setRoleId(roleId);
			roleResService.create(entity);
		}

		insertRoleUsers(role, roleId);

	}

	public void insertRoleUsers(Role role, Long roleId) {
		RoleUser[] roleUsers = role.getRoleUsers();
		for (RoleUser roleUser : roleUsers) {
			roleUser.setRoleId(roleId);
			roleUserService.create(roleUser);
		}
	}
	@Override
	public void updateRoleRes(Role role, Long[] permIds) {
		dao.update(role);
		Long roleId = role.getId();
		roleResService.deleteByRoleId(role.getId());
		for (Long resId : permIds) {

			RoleRes entity = new RoleRes();
			entity.setId(idGenerator.getUId());
			entity.setResId(resId);
			entity.setRoleId(roleId);
			roleResService.create(entity);
		}
		

		// 先删除原来的关联用户
		deleteRoleUsers(roleId);
		//再插入新建的关联用户
		insertRoleUsers(role, roleId);
	}

	public void deleteRoleUsers(Long roleId) {
		QueryMap map = new QueryMap();
		map.put("roleId", roleId);
		List<RoleUser> list = roleUserService.getList(map);
		for (RoleUser roleUser : list) {
			roleUserService.remove(roleUser.getId());
		}
	}

	/**
	 * 删除关联
	 */
	@Override
	public void removeRoleAndRoleRes(Long id, Long[] ids) {
		if (ids != null) {
			if (ids != null) {
				for (Long pk : ids) {
					roleResService.deleteByRoleId(pk);
					remove(pk);
				}
			}
		} else {
			roleResService.deleteByRoleId(id);
			remove(id);
		}

	}
}