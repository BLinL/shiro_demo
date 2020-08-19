package com.bliu.sd.entity;

import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
@ToString
public class Role implements Serializable {
    /**
     *
     *
     * @mbg.generated Mon Jul 20 17:17:34 CST 2020
     */
    private Integer id;

    /**
     *
     *
     * @mbg.generated Mon Jul 20 17:17:34 CST 2020
     */
    private String role_name;

    /**
     *
     *
     * @mbg.generated Mon Jul 20 17:17:34 CST 2020
     */
    private String remark;

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:34 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tb_role.id
     *
     * @return the value of tb_role.id
     *
     * @mbg.generated Mon Jul 20 17:17:34 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:34 CST 2020
     */
    public Role withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_role.id
     *
     * @param id the value for tb_role.id
     *
     * @mbg.generated Mon Jul 20 17:17:34 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tb_role.role_name
     *
     * @return the value of tb_role.role_name
     *
     * @mbg.generated Mon Jul 20 17:17:34 CST 2020
     */
    public String getRole_name() {
        return role_name;
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:34 CST 2020
     */
    public Role withRole_name(String role_name) {
        this.setRole_name(role_name);
        return this;
    }

    /**
     * This method sets the value of the database column tb_role.role_name
     *
     * @param role_name the value for tb_role.role_name
     *
     * @mbg.generated Mon Jul 20 17:17:34 CST 2020
     */
    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    /**
     * This method returns the value of the database column tb_role.remark
     *
     * @return the value of tb_role.remark
     *
     * @mbg.generated Mon Jul 20 17:17:34 CST 2020
     */
    public String getRemark() {
        return remark;
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:34 CST 2020
     */
    public Role withRemark(String remark) {
        this.setRemark(remark);
        return this;
    }

    /**
     * This method sets the value of the database column tb_role.remark
     *
     * @param remark the value for tb_role.remark
     *
     * @mbg.generated Mon Jul 20 17:17:34 CST 2020
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:34 CST 2020
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        role_name("role_name", "role_name", "VARCHAR", false),
        remark("remark", "remark", "VARCHAR", false);

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:34 CST 2020
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:34 CST 2020
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:34 CST 2020
         */
        private final String column;

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:34 CST 2020
         */
        private final boolean isColumnNameDelimited;

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:34 CST 2020
         */
        private final String javaProperty;

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:34 CST 2020
         */
        private final String jdbcType;

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:34 CST 2020
         */
        public String value() {
            return this.column;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:34 CST 2020
         */
        public String getValue() {
            return this.column;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:34 CST 2020
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:34 CST 2020
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:34 CST 2020
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:34 CST 2020
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:34 CST 2020
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:34 CST 2020
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:34 CST 2020
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }
    }
}