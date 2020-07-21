package com.bliu.sd.dao;

import com.bliu.sd.entity.Role;
import com.bliu.sd.entity.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RoleMapper {
    /**
     *
     * @mbg.generated Mon Jul 20 17:17:34 CST 2020
     */
    long countByExample(RoleExample example);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:34 CST 2020
     */
    int deleteByExample(RoleExample example);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:34 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:34 CST 2020
     */
    int insert(Role record);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:34 CST 2020
     */
    int insertSelective(Role record);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:34 CST 2020
     */
    List<Role> selectByExample(RoleExample example);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:34 CST 2020
     */
    Role selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:34 CST 2020
     */
    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:34 CST 2020
     */
    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:34 CST 2020
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:34 CST 2020
     */
    int updateByPrimaryKey(Role record);
}