package com.gudeng.commerce.gd.customer.entity.certif;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "certif_infodept")
public class CertifInfodeptEntity  implements java.io.Serializable{
    /**
    *
    */
    private Integer id;

    *用户id
    */
    private Integer memberId;

    *账号
    */
    private String account;

    *姓名
    */
    private String realName;

    *企业名称
    */
    private String companyName;

    *所属区域
    */
    private String areaInfo;

    *身份证号
    */
    private String idCard;

    *营业执照/门头照/名片照片
    */
    private String bzlPhotoUrl;

    *身份证图片, 逗号分隔
    */
    private String cardPhotoUrl;

    *头像
    */
    private String icon;

    *认证状态(0:待审核1:已认证;2:已驳回)
    */
    private String status;

    *申请认证时间
    */
    private Date commitTime;

    *
    */
    private String createUserId;

    *
    */
    private Date createTime;

    *
    */
    private String updateUserId;

    *
    */
    private Date updateTime;

    *记录当前操作的操作员是谁，取管理后台用户的姓名
    */
    private String optionUser;

    @Column(name = "id")
    public Integer getId(){

    }
    public void setId(Integer id){

    }
    @Column(name = "memberId")
    public Integer getMemberId(){

    }
    public void setMemberId(Integer memberId){

    }
    @Column(name = "account")
    public String getAccount(){

    }
    public void setAccount(String account){

    }
    @Column(name = "realName")
    public String getRealName(){

    }
    public void setRealName(String realName){

    }
    @Column(name = "companyName")
    public String getCompanyName(){

    }
    public void setCompanyName(String companyName){

    }
    @Column(name = "areaInfo")
    public String getAreaInfo(){

    }
    public void setAreaInfo(String areaInfo){

    }
    @Column(name = "idCard")
    public String getIdCard(){

    }
    public void setIdCard(String idCard){

    }
    @Column(name = "bzlPhotoUrl")
    public String getBzlPhotoUrl(){

    }
    public void setBzlPhotoUrl(String bzlPhotoUrl){

    }
    @Column(name = "cardPhotoUrl")
    public String getCardPhotoUrl(){

    }
    public void setCardPhotoUrl(String cardPhotoUrl){

    }
    @Column(name = "icon")
    public String getIcon(){

    }
    public void setIcon(String icon){

    }
    @Column(name = "status")
    public String getStatus(){

    }
    public void setStatus(String status){

    }
    @Column(name = "commitTime")
    public Date getCommitTime(){

    }
    public void setCommitTime(Date commitTime){

    }
    @Column(name = "createUserId")
    public String getCreateUserId(){

    }
    public void setCreateUserId(String createUserId){

    }
    @Column(name = "createTime")
    public Date getCreateTime(){

    }
    public void setCreateTime(Date createTime){

    }
    @Column(name = "updateUserId")
    public String getUpdateUserId(){

    }
    public void setUpdateUserId(String updateUserId){

    }
    @Column(name = "updateTime")
    public Date getUpdateTime(){

    }
    public void setUpdateTime(Date updateTime){

    }
    @Column(name = "optionUser")
    public String getOptionUser(){

    }
    public void setOptionUser(String optionUser){

    }
}