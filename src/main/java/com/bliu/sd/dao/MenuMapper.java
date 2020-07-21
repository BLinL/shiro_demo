package com.bliu.sd.dao;

import com.bliu.sd.entity.Menu;
import com.bliu.sd.entity.MenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MenuMapper {
    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    long countByExample(MenuExample example);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    int deleteByExample(MenuExample example);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    int insert(Menu record);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    int insertSelective(Menu record);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    List<Menu> selectByExample(MenuExample example);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    Menu selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    int updateByPrimaryKeySelective(Menu record);

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    int updateByPrimaryKey(Menu record);
}