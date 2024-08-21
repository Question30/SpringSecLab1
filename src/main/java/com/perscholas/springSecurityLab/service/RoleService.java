package com.perscholas.springSecurityLab.service;

import com.perscholas.springSecurityLab.model.Role;

import java.util.List;

public interface RoleService {
    public void saveRole(Role role);
    public Role findRoleByRoleName(String name);
    public List<Role> getAllRoles();
    public List<Role> getRolesByUser(long id);

}
