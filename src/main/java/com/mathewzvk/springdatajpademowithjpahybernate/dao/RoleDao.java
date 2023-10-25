package com.mathewzvk.springdatajpademowithjpahybernate.dao;

import com.mathewzvk.springdatajpademowithjpahybernate.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
}
