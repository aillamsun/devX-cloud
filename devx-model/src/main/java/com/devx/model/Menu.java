package com.chinawiserv.generator.model;

import javax.persistence.*;

public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 菜单名
     */
    private String name;

    /**
     * 可显示权限
     */
    @Column(name = "has_auths")
    private String hasAuths;

    private String identity;

    private String url;

    @Column(name = "parent_id")
    private Long parentId;

    @Column(name = "parent_ids")
    private String parentIds;

    private String icon;

    private Integer weight;

    /**
     *  0 不可用 1 可用
     */
    private Integer status;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取菜单名
     *
     * @return name - 菜单名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置菜单名
     *
     * @param name 菜单名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取可显示权限
     *
     * @return has_auths - 可显示权限
     */
    public String getHasAuths() {
        return hasAuths;
    }

    /**
     * 设置可显示权限
     *
     * @param hasAuths 可显示权限
     */
    public void setHasAuths(String hasAuths) {
        this.hasAuths = hasAuths;
    }

    /**
     * @return identity
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * @param identity
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return parent_id
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * @return parent_ids
     */
    public String getParentIds() {
        return parentIds;
    }

    /**
     * @param parentIds
     */
    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    /**
     * @return icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * @param weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * 获取 0 不可用 1 可用
     *
     * @return status -  0 不可用 1 可用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 0 不可用 1 可用
     *
     * @param status  0 不可用 1 可用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}