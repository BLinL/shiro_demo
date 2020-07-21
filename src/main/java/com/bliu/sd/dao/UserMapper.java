package com.bliu.sd.dao;

import com.bliu.sd.entity.User;
import com.bliu.sd.entity.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    /**
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    long countByExample(UserExample example);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    int deleteByExample(UserExample example);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    int insert(User record);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    int insertSelective(User record);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    List<User> selectByExample(UserExample example);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    User selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    int updateByPrimaryKey(User record);
}