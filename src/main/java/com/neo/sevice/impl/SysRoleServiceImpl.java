package com.neo.sevice.impl;

import com.neo.dao.SysRoleDao;
import com.neo.model.SysRole;
import com.neo.sevice.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysRoleServiceImpl implements SysRoleService {

  @Autowired
  private SysRoleDao sysRoleDao;

  @Override
  public Iterable<SysRole> findAll() {
    return sysRoleDao.findAll();
  }
}
