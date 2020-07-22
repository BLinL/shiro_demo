package com.bliu.sd.dao;

import com.bliu.sd.entity.RoleMenu;
import com.bliu.sd.entity.RoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RoleMenuMapper {
    /**
     *
     * @mbg.generated Wed Jul 22 10:09:55 CST 2020
     */
    long countByExample(RoleMenuExample example);

    /**
     *
     * @mbg.generated Wed Jul 22 10:09:55 CST 2020
     */
    int deleteByExample(RoleMenuExample example);

    /**
     *
     * @mbg.generated Wed Jul 22 10:09:55 CST 2020
     */
    int deleteByPrimaryKey(Integer role_id);

    /**
     *
     * @mbg.generated Wed Jul 22 10:09:55 CST 2020
     */
    int insert(RoleMenu record);

    /**
     *
     * @mbg.generated Wed Jul 22 10:09:55 CST 2020
     */
    int insertSelective(RoleMenu record);

    /**
     *
     * @mbg.generated Wed Jul 22 10:09:55 CST 2020
     */
    List<RoleMenu> selectByExample(RoleMenuExample example);

    /**
     *
     * @mbg.generated Wed Jul 22 10:09:55 CST 2020
     */
    RoleMenu selectByPrimaryKey(Integer role_id);

    /**
     *
     * @mbg.generated Wed Jul 22 10:09:55 CST 2020
     */
    int updateByExampleSelective(@Param("record") RoleMenu record, @Param("example") RoleMenuExample example);

    /**
     *
     * @mbg.generated Wed Jul 22 10:09:55 CST 2020
     */
    int updateByExample(@Param("record") RoleMenu record, @Param("example") RoleMenuExample example);

    /**
     *
     * @mbg.generated Wed Jul 22 10:09:55 CST 2020
     */
    int updateByPrimaryKeySelective(RoleMenu record);

    /**
     *
     * @mbg.generated Wed Jul 22 10:09:55 CST 2020
     */
    int updateByPrimaryKey(RoleMenu record);
}