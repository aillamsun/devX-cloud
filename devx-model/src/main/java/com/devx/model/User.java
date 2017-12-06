package com.devx.model;

import com.devx.core.model.BaseModel;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class User  extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户真实姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 工号
     */
    @Column(name = "en_code")
    private String enCode;

    /**
     * 头像
     */
    @Column(name = "head_img")
    private String headImg;

    /**
     * 性别 1 男 2 女
     */
    private Integer gender;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 微信
     */
    private String wechat;

    /**
     * 电话
     */
    @Column(name = "tele_phone")
    private String telePhone;

    /**
     * msn
     */
    private String msn;

    /**
     * qq
     */
    private String oicq;

    /**
     * 主管id
     */
    @Column(name = "manager_id")
    private Long managerId;

    /**
     * 主管人
     */
    @Column(name = "manager_name")
    private String managerName;

    /**
     * 公司id
     */
    @Column(name = "organ_id")
    private Long organId;

    @Column(name = "organ_name")
    private String organName;

    /**
     * 部门id
     */
    @Column(name = "dept_id")
    private String deptId;

    @Column(name = "dept_name")
    private String deptName;

    /**
     * 角色id
     */
    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "role_name")
    private String roleName;

    /**
     * 职位
     */
    @Column(name = "post_id")
    private Long postId;

    @Column(name = "post_name")
    private String postName;

    @Column(name = "duty_name")
    private String dutyName;

    /**
     * 岗位
     */
    @Column(name = "duty_id")
    private Long dutyId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    @Column(name = "create_user_id")
    private String createUserId;

    /**
     * 0 禁用 1 正常 2 删除
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;

    @Column(name = "last_password_reset_date")
    private Date lastPasswordResetDate;

    /**
     * 是否是超级管理员 0 否 1 是
     */
    @Column(name = "is_admin")
    private Integer isAdmin;

    /**
     * 最后一次登录时间
     */
    @Column(name = "last_login_time")
    private Date lastLoginTime;

    /**
     * 登录总次数
     */
    @Column(name = "login_count")
    private Integer loginCount;

    /**
     * 登录ip
     */
    @Column(name = "login_ip")
    private String loginIp;

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
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取用户密码
     *
     * @return password - 用户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户密码
     *
     * @param password 用户密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取用户真实姓名
     *
     * @return real_name - 用户真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置用户真实姓名
     *
     * @param realName 用户真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取昵称
     *
     * @return nick_name - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取工号
     *
     * @return en_code - 工号
     */
    public String getEnCode() {
        return enCode;
    }

    /**
     * 设置工号
     *
     * @param enCode 工号
     */
    public void setEnCode(String enCode) {
        this.enCode = enCode;
    }

    /**
     * 获取头像
     *
     * @return head_img - 头像
     */
    public String getHeadImg() {
        return headImg;
    }

    /**
     * 设置头像
     *
     * @param headImg 头像
     */
    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    /**
     * 获取性别 1 男 2 女
     *
     * @return gender - 性别 1 男 2 女
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置性别 1 男 2 女
     *
     * @param gender 性别 1 男 2 女
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取出生日期
     *
     * @return birthday - 出生日期
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置出生日期
     *
     * @param birthday 出生日期
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取手机
     *
     * @return mobile - 手机
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机
     *
     * @param mobile 手机
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取微信
     *
     * @return wechat - 微信
     */
    public String getWechat() {
        return wechat;
    }

    /**
     * 设置微信
     *
     * @param wechat 微信
     */
    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    /**
     * 获取电话
     *
     * @return tele_phone - 电话
     */
    public String getTelePhone() {
        return telePhone;
    }

    /**
     * 设置电话
     *
     * @param telePhone 电话
     */
    public void setTelePhone(String telePhone) {
        this.telePhone = telePhone;
    }

    /**
     * 获取msn
     *
     * @return msn - msn
     */
    public String getMsn() {
        return msn;
    }

    /**
     * 设置msn
     *
     * @param msn msn
     */
    public void setMsn(String msn) {
        this.msn = msn;
    }

    /**
     * 获取qq
     *
     * @return oicq - qq
     */
    public String getOicq() {
        return oicq;
    }

    /**
     * 设置qq
     *
     * @param oicq qq
     */
    public void setOicq(String oicq) {
        this.oicq = oicq;
    }

    /**
     * 获取主管id
     *
     * @return manager_id - 主管id
     */
    public Long getManagerId() {
        return managerId;
    }

    /**
     * 设置主管id
     *
     * @param managerId 主管id
     */
    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    /**
     * 获取主管人
     *
     * @return manager_name - 主管人
     */
    public String getManagerName() {
        return managerName;
    }

    /**
     * 设置主管人
     *
     * @param managerName 主管人
     */
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    /**
     * 获取公司id
     *
     * @return organ_id - 公司id
     */
    public Long getOrganId() {
        return organId;
    }

    /**
     * 设置公司id
     *
     * @param organId 公司id
     */
    public void setOrganId(Long organId) {
        this.organId = organId;
    }

    /**
     * @return organ_name
     */
    public String getOrganName() {
        return organName;
    }

    /**
     * @param organName
     */
    public void setOrganName(String organName) {
        this.organName = organName;
    }

    /**
     * 获取部门id
     *
     * @return dept_id - 部门id
     */
    public String getDeptId() {
        return deptId;
    }

    /**
     * 设置部门id
     *
     * @param deptId 部门id
     */
    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    /**
     * @return dept_name
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * @param deptName
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * 获取角色id
     *
     * @return role_id - 角色id
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id
     *
     * @param roleId 角色id
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * @return role_name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取职位
     *
     * @return post_id - 职位
     */
    public Long getPostId() {
        return postId;
    }

    /**
     * 设置职位
     *
     * @param postId 职位
     */
    public void setPostId(Long postId) {
        this.postId = postId;
    }

    /**
     * @return post_name
     */
    public String getPostName() {
        return postName;
    }

    /**
     * @param postName
     */
    public void setPostName(String postName) {
        this.postName = postName;
    }

    /**
     * @return duty_name
     */
    public String getDutyName() {
        return dutyName;
    }

    /**
     * @param dutyName
     */
    public void setDutyName(String dutyName) {
        this.dutyName = dutyName;
    }

    /**
     * 获取岗位
     *
     * @return duty_id - 岗位
     */
    public Long getDutyId() {
        return dutyId;
    }

    /**
     * 设置岗位
     *
     * @param dutyId 岗位
     */
    public void setDutyId(Long dutyId) {
        this.dutyId = dutyId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建人
     *
     * @return create_user_id - 创建人
     */
    public String getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置创建人
     *
     * @param createUserId 创建人
     */
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取0 禁用 1 正常 2 删除
     *
     * @return status - 0 禁用 1 正常 2 删除
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置0 禁用 1 正常 2 删除
     *
     * @param status 0 禁用 1 正常 2 删除
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return last_password_reset_date
     */
    public Date getLastPasswordResetDate() {
        return lastPasswordResetDate;
    }

    /**
     * @param lastPasswordResetDate
     */
    public void setLastPasswordResetDate(Date lastPasswordResetDate) {
        this.lastPasswordResetDate = lastPasswordResetDate;
    }

    /**
     * 获取是否是超级管理员 0 否 1 是
     *
     * @return is_admin - 是否是超级管理员 0 否 1 是
     */
    public Integer getIsAdmin() {
        return isAdmin;
    }

    /**
     * 设置是否是超级管理员 0 否 1 是
     *
     * @param isAdmin 是否是超级管理员 0 否 1 是
     */
    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }

    /**
     * 获取最后一次登录时间
     *
     * @return last_login_time - 最后一次登录时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置最后一次登录时间
     *
     * @param lastLoginTime 最后一次登录时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 获取登录总次数
     *
     * @return login_count - 登录总次数
     */
    public Integer getLoginCount() {
        return loginCount;
    }

    /**
     * 设置登录总次数
     *
     * @param loginCount 登录总次数
     */
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    /**
     * 获取登录ip
     *
     * @return login_ip - 登录ip
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 设置登录ip
     *
     * @param loginIp 登录ip
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }
}