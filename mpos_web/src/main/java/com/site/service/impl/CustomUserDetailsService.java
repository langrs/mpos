package com.site.service.impl;
import com.site.core.mybatis.QueryMap;
import com.site.entity.AuthRes;
import com.site.entity.RoleRes;
import com.site.entity.RoleUser;
import com.site.service.AuthResService;
import com.site.service.RoleResService;
import com.site.service.RoleUserService;
import com.site.service.UserService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomUserDetailsService implements UserDetailsService {
	@Resource
	UserService userService;
	@Resource
	AuthResService authResService;
	@Resource
	RoleUserService roleUserService;
	@Resource
	RoleResService roleResService;
//	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		UserDetails user = null;

		try {

			QueryMap map = new QueryMap();
			map.put("userNo", arg0);
			// 搜索数据库以匹配用户登录名.
			// 我们可以通过dao使用JDBC来访问数据库
			com.site.entity.User dbUser = userService.getOne(map);
			if (dbUser != null) {
				user = new User(dbUser.getUserNo(), dbUser.getPassWd().toLowerCase(), true, true, true, true, getAuthorities(dbUser.getId()));
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new UsernameNotFoundException("Error in retrieving user");
		}

		return user;
	}
//	/**
//	 * 获得访问角色权限
//	 *
//	 * @param access
//	 * @return
//	 */
	@SuppressWarnings("deprecation")
	public Collection<GrantedAuthority> getAuthorities(Long userId) {

		List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>();
		// 如果是超级管理员，获得所有权限
		if (1 == userId.longValue()) {
			List<AuthRes> all = authResService.getAll();
			for (AuthRes authRes : all) {
				authList.add(new GrantedAuthorityImpl(authRes.getKey()));
			}
			authList.add(new GrantedAuthorityImpl("ROLE_ADMIN"));
		} else {
			// 通过用户id查询用户的角色
			List<RoleUser> roleUserList = roleUserService.getByUserId(userId);
			for (RoleUser roleUser : roleUserList) {
				List<RoleRes> roleResList = roleResService.getByRoleId(roleUser.getRoleId());
				for (RoleRes roleRes : roleResList) {
					authList.add(new GrantedAuthorityImpl(authResService.get(roleRes.getResId()).getKey()));
				}
			}
		}
		return authList;
	}
}
