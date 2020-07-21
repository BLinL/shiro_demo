package com.bliu.sd.entity;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
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
@Data
public class User implements Serializable {
    /**
     *
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    private Integer id;

    /**
     *
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    @NotEmpty(message = "用户名不能为空")
    private String user_name;

    /**
     *
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    @NotEmpty(message = "用户密码不能为空")
    private String password;

    /**
     *
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    private String tel;

    /**
     *
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    private String gender;

    /**
     * active
     *
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    private Byte status = 0;

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tb_user.id
     *
     * @return the value of tb_user.id
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    public User withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column tb_user.id
     *
     * @param id the value for tb_user.id
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tb_user.user_name
     *
     * @return the value of tb_user.user_name
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    public User withUser_name(String user_name) {
        this.setUser_name(user_name);
        return this;
    }

    /**
     * This method sets the value of the database column tb_user.user_name
     *
     * @param user_name the value for tb_user.user_name
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    /**
     * This method returns the value of the database column tb_user.password
     *
     * @return the value of tb_user.password
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    public User withPassword(String password) {
        this.setPassword(password);
        return this;
    }

    /**
     * This method sets the value of the database column tb_user.password
     *
     * @param password the value for tb_user.password
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method returns the value of the database column tb_user.tel
     *
     * @return the value of tb_user.tel
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    public String getTel() {
        return tel;
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    public User withTel(String tel) {
        this.setTel(tel);
        return this;
    }

    /**
     * This method sets the value of the database column tb_user.tel
     *
     * @param tel the value for tb_user.tel
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * This method returns the value of the database column tb_user.gender
     *
     * @return the value of tb_user.gender
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    public String getGender() {
        return gender;
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    public User withGender(String gender) {
        this.setGender(gender);
        return this;
    }

    /**
     * This method sets the value of the database column tb_user.gender
     *
     * @param gender the value for tb_user.gender
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * This method returns the value of the database column tb_user.status
     *
     * @return the value of tb_user.status
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    public Byte getStatus() {
        return status;
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    public User withStatus(Byte status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method sets the value of the database column tb_user.status
     *
     * @param status the value for tb_user.status
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     *
     * @mbg.generated Mon Jul 20 17:17:31 CST 2020
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        user_name("user_name", "user_name", "VARCHAR", false),
        password("password", "password", "VARCHAR", true),
        tel("tel", "tel", "VARCHAR", false),
        gender("gender", "gender", "CHAR", false),
        status("status", "status", "TINYINT", true);

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:31 CST 2020
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:31 CST 2020
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:31 CST 2020
         */
        private final String column;

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:31 CST 2020
         */
        private final boolean isColumnNameDelimited;

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:31 CST 2020
         */
        private final String javaProperty;

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:31 CST 2020
         */
        private final String jdbcType;

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:31 CST 2020
         */
        public String value() {
            return this.column;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:31 CST 2020
         */
        public String getValue() {
            return this.column;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:31 CST 2020
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:31 CST 2020
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:31 CST 2020
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:31 CST 2020
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:31 CST 2020
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         *
         * @mbg.generated Mon Jul 20 17:17:31 CST 2020
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
         * @mbg.generated Mon Jul 20 17:17:31 CST 2020
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