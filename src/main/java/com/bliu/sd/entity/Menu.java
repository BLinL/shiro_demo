package com.bliu.sd.entity;

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
public class Menu implements Serializable {
    /**
     *
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    private Integer id;

    /**
     *
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    private Integer parent_id;

    /**
     *
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    private String menu_name;

    /**
     *
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    private String url;

    /**
     *
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    private String permission;

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tb_menu.id
     *
     * @return the value of tb_menu.id
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    public Menu withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_menu.id
     *
     * @param id the value for tb_menu.id
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tb_menu.parent_id
     *
     * @return the value of tb_menu.parent_id
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    public Integer getParent_id() {
        return parent_id;
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    public Menu withParent_id(Integer parent_id) {
        this.setParent_id(parent_id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_menu.parent_id
     *
     * @param parent_id the value for tb_menu.parent_id
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    /**
     * This method returns the value of the database column tb_menu.menu_name
     *
     * @return the value of tb_menu.menu_name
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    public String getMenu_name() {
        return menu_name;
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    public Menu withMenu_name(String menu_name) {
        this.setMenu_name(menu_name);
        return this;
    }

    /**
     * This method sets the value of the database column tb_menu.menu_name
     *
     * @param menu_name the value for tb_menu.menu_name
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }

    /**
     * This method returns the value of the database column tb_menu.url
     *
     * @return the value of tb_menu.url
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    public Menu withUrl(String url) {
        this.setUrl(url);
        return this;
    }

    /**
     * This method sets the value of the database column tb_menu.url
     *
     * @param url the value for tb_menu.url
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method returns the value of the database column tb_menu.permission
     *
     * @return the value of tb_menu.permission
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    public String getPermission() {
        return permission;
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    public Menu withPermission(String permission) {
        this.setPermission(permission);
        return this;
    }

    /**
     * This method sets the value of the database column tb_menu.permission
     *
     * @param permission the value for tb_menu.permission
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:28 CST 2020
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        parent_id("parent_id", "parent_id", "INTEGER", false),
        menu_name("menu_name", "menu_name", "VARCHAR", false),
        url("url", "url", "VARCHAR", false),
        permission("permission", "permission", "VARCHAR", false);

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        private final String column;

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        private final boolean isColumnNameDelimited;

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        private final String javaProperty;

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        private final String jdbcType;

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public String value() {
            return this.column;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public String getValue() {
            return this.column;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
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
         * @mbg.generated Mon Jul 20 17:17:28 CST 2020
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