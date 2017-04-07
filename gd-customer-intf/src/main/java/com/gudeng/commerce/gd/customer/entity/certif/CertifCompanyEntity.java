package com.gudeng.commerce.gd.customer.entity.certif;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.gudeng.commerce.gd.customer.annotation.ExcelConf;

@Entity(name = "certif_company")
public class CertifCompanyEntity  implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 5315053200663690027L;

	/**
    *
    */
    private Integer id;

    *会员ID
    */
    private Integer memberId;

    *账号
    */
    @ExcelConf(excelHeader="账号", sort = 1)
    private String account;

    *企业名称
    */
    @ExcelConf(excelHeader="企业名称", sort = 2)
    private String companyName;

    *营业执照号码
    */
    private String bzl;

    *营业执照图片
    */
    private String bzlPhotoUrl;

    *提交时间
    */
	@ExcelConf(excelHeader="申请时间", sort = 3)
    private Date commitTime;

    *状态(0:待审核1:已认证;2:已驳回)
    */
    private String status;

    *app类型，记录属于哪个app或者客户端提交的认证。
            1为农批商，2为农商友，3为农速通，4为供应商，5为谷登农批web
    */
    private Byte appType;

    *记录产生的时间
    */
    private Date createTime;

    *记录最新的更新时间
    */
    private Date updateTime;

    *
    */
    private String createUserId;

    *
    */
    private String updateUserId;

    *记录当前操作的操作员是谁，取管理后台用户的姓名
    */
	@ExcelConf(excelHeader="审核员", sort = 5)
    private String optionUser;

    *企业法人姓名
    */
    private String realName;

    *法人身份证号
    */
    private String idCard;

    *法人身份证图片, 逗号分隔
    */
    private String cardPhotoUrl;

    *头像
    */
    private String icon;

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
    @Column(name = "companyName")
    public String getCompanyName(){

    }
    public void setCompanyName(String companyName){

    }
    @Column(name = "bzl")
    public String getBzl(){

    }
    public void setBzl(String bzl){

    }
    @Column(name = "bzlPhotoUrl")
    public String getBzlPhotoUrl(){

    }
    public void setBzlPhotoUrl(String bzlPhotoUrl){

    }
    @Column(name = "commitTime")
    public Date getCommitTime(){

    }
    public void setCommitTime(Date commitTime){

    }
    @Column(name = "status")
    public String getStatus(){

    }
    public void setStatus(String status){

    }
    @Column(name = "appType")
    public Byte getAppType(){

    }
    public void setAppType(Byte appType){

    }
    @Column(name = "createTime")
    public Date getCreateTime(){

    }
    public void setCreateTime(Date createTime){

    }
    @Column(name = "updateTime")
    public Date getUpdateTime(){

    }
    public void setUpdateTime(Date updateTime){

    }
    @Column(name = "createUserId")
    public String getCreateUserId(){

    }
    public void setCreateUserId(String createUserId){

    }
    @Column(name = "updateUserId")
    public String getUpdateUserId(){

    }
    public void setUpdateUserId(String updateUserId){

    }
    @Column(name = "optionUser")
    public String getOptionUser(){

    }
    public void setOptionUser(String optionUser){

    }
    @Column(name = "realName")
    public String getRealName(){

    }
    public void setRealName(String realName){

    }
    @Column(name = "idCard")
    public String getIdCard(){

    }
    public void setIdCard(String idCard){

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
}