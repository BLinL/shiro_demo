package com.bliu.sd.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class RoleMenu implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Jul 22 10:09:55 CST 2020
     */
    private Integer role_id;

    /**
     *
     *
     * @mbg.generated Wed Jul 22 10:09:55 CST 2020
     */
    private Integer menu_id;

    /**
     *
     * @mbg.generated Wed Jul 22 10:09:55 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tb_role_menu.role_id
     *
     * @return the value of tb_role_menu.role_id
     *
     * @mbg.generated Wed Jul 22 10:09:55 CST 2020
     */
    public Integer getRole_id() {
        return role_id;
    }

    /**
     *
     * @mbg.generated Wed Jul 22 10:09:55 CST 2020
     */
    public RoleMenu withRole_id(Integer role_id) {
        this.setRole_id(role_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_role_menu.role_id
     *
     * @param role_id the value for tb_role_menu.role_id
     *
     * @mbg.generated Wed Jul 22 10:09:55 CST 2020
     */
    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    /**
     * This method returns the value of the database column tb_role_menu.menu_id
     *
     * @return the value of tb_role_menu.menu_id
     *
     * @mbg.generated Wed Jul 22 10:09:55 CST 2020
     */
    public Integer getMenu_id() {
        return menu_id;
    }

    /**
     *
     * @mbg.generated Wed Jul 22 10:09:55 CST 2020
     */
    public RoleMenu withMenu_id(Integer menu_id) {
        this.setMenu_id(menu_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_role_menu.menu_id
     *
     * @param menu_id the value for tb_role_menu.menu_id
     *
     * @mbg.generated Wed Jul 22 10:09:55 CST 2020
     */
    public void setMenu_id(Integer menu_id) {
        this.menu_id = menu_id;
    }

    /**
     *
     * @mbg.generated Wed Jul 22 10:09:55 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", role_id=").append(role_id);
        sb.append(", menu_id=").append(menu_id);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Wed Jul 22 10:09:55 CST 2020
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        RoleMenu other = (RoleMenu) that;
        return (this.getRole_id() == null ? other.getRole_id() == null : this.getRole_id().equals(other.getRole_id()))
            && (this.getMenu_id() == null ? other.getMenu_id() == null : this.getMenu_id().equals(other.getMenu_id()));
    }

    /**
     *
     * @mbg.generated Wed Jul 22 10:09:55 CST 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRole_id() == null) ? 0 : getRole_id().hashCode());
        result = prime * result + ((getMenu_id() == null) ? 0 : getMenu_id().hashCode());
        return result;
    }
}