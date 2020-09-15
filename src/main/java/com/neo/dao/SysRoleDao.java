package com.neo.dao;

import com.neo.model.SysRole;
import org.springframework.data.repository.CrudRepository;

public interface SysRoleDao extends CrudRepository<SysRole,Integer> {
  Iterable<SysRole> findAll();
}
