package com.bliu.sd.service;

import com.bliu.sd.entity.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    List<Role> getAll();

    Optional<Role> getByRoleName(String roleName);
}
