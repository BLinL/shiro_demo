package com.bliu.sd.dao;

import com.bliu.sd.entity.UserRole;
import com.bliu.sd.entity.UserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserRoleMapper {
    /**
     *
     * @mbg.generated Wed Jul 22 10:11:08 CST 2020
     */
    long countByExample(UserRoleExample example);

    /**
     *
     * @mbg.generated Wed Jul 22 10:11:08 CST 2020
     */
    int deleteByExample(UserRoleExample example);

    /**
     *
     * @mbg.generated Wed Jul 22 10:11:08 CST 2020
     */
    int deleteByPrimaryKey(Integer user_id);

    /**
     *
     * @mbg.generated Wed Jul 22 10:11:08 CST 2020
     */
    int insert(UserRole record);

    /**
     *
     * @mbg.generated Wed Jul 22 10:11:08 CST 2020
     */
    int insertSelective(UserRole record);

    /**
     *
     * @mbg.generated Wed Jul 22 10:11:08 CST 2020
     */
    List<UserRole> selectByExample(UserRoleExample example);

    /**
     *
     * @mbg.generated Wed Jul 22 10:11:08 CST 2020
     */
    UserRole selectByPrimaryKey(Integer user_id);

    /**
     *
     * @mbg.generated Wed Jul 22 10:11:08 CST 2020
     */
    int updateByExampleSelective(@Param("record") UserRole record, @Param("example") UserRoleExample example);

    /**
     *
     * @mbg.generated Wed Jul 22 10:11:08 CST 2020
     */
    int updateByExample(@Param("record") UserRole record, @Param("example") UserRoleExample example);

    /**
     *
     * @mbg.generated Wed Jul 22 10:11:08 CST 2020
     */
    int updateByPrimaryKeySelective(UserRole record);

    /**
     *
     * @mbg.generated Wed Jul 22 10:11:08 CST 2020
     */
    int updateByPrimaryKey(UserRole record);
}