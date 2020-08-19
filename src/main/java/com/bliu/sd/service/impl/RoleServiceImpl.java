package com.bliu.sd.service.impl;

import com.bliu.sd.dao.RoleMapper;
import com.bliu.sd.entity.Role;
import com.bliu.sd.entity.RoleExample;
import com.bliu.sd.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> getAll() {
        return roleMapper.selectByExample(new RoleExample());
    }

    @Override
    public Optional<Role> getByRoleName(String roleName) {
        RoleExample roleExample = new RoleExample();
        roleExample.createCriteria().andRole_nameEqualTo(roleName);
        List<Role> ret = roleMapper.selectByExample(roleExample);
        if(ret.size() > 0) {
            return Optional.of(ret.get(0));
        }else {
            return Optional.empty();
        }
    }
}
