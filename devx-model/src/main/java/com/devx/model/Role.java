package com.chinawiserv.generator.model;

import java.util.Date;
import javax.persistence.*;

public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 组织ID
     */
    @Column(name = "organ_id")
    private String organId;

    /**
     * 公司名称
     */
    @Column(name = "organ_name")
    private String organName;

    /**
     * 部门名称
     */
    @Column(name = "dept_name")
    private String deptName;

    /**
     * 编码
     */
    @Column(name = "en_code")
    private String enCode;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 标识
     */
    private String role;

    /**
     * 是否公共 0 否 1 是
     */
    @Column(name = "is_pubilc")
    private Integer isPubilc;

    /**
     * 分类 1-角色 2-岗位 3-职位 4-工作组
     */
    private Integer type;

    private String description;

    /**
     * 是否是全选 0 否 1 是
     */
    @Column(name = "is_all")
    private Integer isAll;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建人id
     */
    @Column(name = "create_user_id")
    private String createUserId;

    /**
     * 创建人
     */
    @Column(name = "create_user_name")
    private String createUserName;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 修改人id
     */
    @Column(name = "modify_user_id")
    private String modifyUserId;

    /**
     * 修改人姓名
     */
    @Column(name = "modify_user_name")
    private String modifyUserName;

    /**
     * 0 不可用 1 可用
     */
    private Integer status;

    /**
     * 数据权限类型 1 仅限本人 2 仅限本人及下属 3 所在部门 4.... (如果需要选择部门)以后扩展使用
     */
    @Column(name = "data_type")
    private Integer dataType;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取组织ID
     *
     * @return organ_id - 组织ID
     */
    public String getOrganId() {
        return organId;
    }

    /**
     * 设置组织ID
     *
     * @param organId 组织ID
     */
    public void setOrganId(String organId) {
        this.organId = organId;
    }

    /**
     * 获取公司名称
     *
     * @return organ_name - 公司名称
     */
    public String getOrganName() {
        return organName;
    }

    /**
     * 设置公司名称
     *
     * @param organName 公司名称
     */
    public void setOrganName(String organName) {
        this.organName = organName;
    }

    /**
     * 获取部门名称
     *
     * @return dept_name - 部门名称
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置部门名称
     *
     * @param deptName 部门名称
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * 获取编码
     *
     * @return en_code - 编码
     */
    public String getEnCode() {
        return enCode;
    }

    /**
     * 设置编码
     *
     * @param enCode 编码
     */
    public void setEnCode(String enCode) {
        this.enCode = enCode;
    }

    /**
     * 获取角色名称
     *
     * @return name - 角色名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置角色名称
     *
     * @param name 角色名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取标识
     *
     * @return role - 标识
     */
    public String getRole() {
        return role;
    }

    /**
     * 设置标识
     *
     * @param role 标识
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * 获取是否公共 0 否 1 是
     *
     * @return is_pubilc - 是否公共 0 否 1 是
     */
    public Integer getIsPubilc() {
        return isPubilc;
    }

    /**
     * 设置是否公共 0 否 1 是
     *
     * @param isPubilc 是否公共 0 否 1 是
     */
    public void setIsPubilc(Integer isPubilc) {
        this.isPubilc = isPubilc;
    }

    /**
     * 获取分类 1-角色 2-岗位 3-职位 4-工作组
     *
     * @return type - 分类 1-角色 2-岗位 3-职位 4-工作组
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置分类 1-角色 2-岗位 3-职位 4-工作组
     *
     * @param type 分类 1-角色 2-岗位 3-职位 4-工作组
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取是否是全选 0 否 1 是
     *
     * @return is_all - 是否是全选 0 否 1 是
     */
    public Integer getIsAll() {
        return isAll;
    }

    /**
     * 设置是否是全选 0 否 1 是
     *
     * @param isAll 是否是全选 0 否 1 是
     */
    public void setIsAll(Integer isAll) {
        this.isAll = isAll;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建人id
     *
     * @return create_user_id - 创建人id
     */
    public String getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置创建人id
     *
     * @param createUserId 创建人id
     */
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取创建人
     *
     * @return create_user_name - 创建人
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * 设置创建人
     *
     * @param createUserName 创建人
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    /**
     * 获取修改时间
     *
     * @return modify_time - 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取修改人id
     *
     * @return modify_user_id - 修改人id
     */
    public String getModifyUserId() {
        return modifyUserId;
    }

    /**
     * 设置修改人id
     *
     * @param modifyUserId 修改人id
     */
    public void setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    /**
     * 获取修改人姓名
     *
     * @return modify_user_name - 修改人姓名
     */
    public String getModifyUserName() {
        return modifyUserName;
    }

    /**
     * 设置修改人姓名
     *
     * @param modifyUserName 修改人姓名
     */
    public void setModifyUserName(String modifyUserName) {
        this.modifyUserName = modifyUserName;
    }

    /**
     * 获取0 不可用 1 可用
     *
     * @return status - 0 不可用 1 可用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置0 不可用 1 可用
     *
     * @param status 0 不可用 1 可用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取数据权限类型 1 仅限本人 2 仅限本人及下属 3 所在部门 4.... (如果需要选择部门)以后扩展使用
     *
     * @return data_type - 数据权限类型 1 仅限本人 2 仅限本人及下属 3 所在部门 4.... (如果需要选择部门)以后扩展使用
     */
    public Integer getDataType() {
        return dataType;
    }

    /**
     * 设置数据权限类型 1 仅限本人 2 仅限本人及下属 3 所在部门 4.... (如果需要选择部门)以后扩展使用
     *
     * @param dataType 数据权限类型 1 仅限本人 2 仅限本人及下属 3 所在部门 4.... (如果需要选择部门)以后扩展使用
     */
    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }
}