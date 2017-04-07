package com.gudeng.commerce.gd.customer.entity.certif;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.gudeng.commerce.gd.customer.annotation.ExcelConf;


@Entity(name = "certif_personal")
public class CertifPersonalEntity  implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 5222170184244330570L;

	/**
    *
    */
    private Integer id;

    *
    */
    private Integer memberId;

    *账号
    */
    @ExcelConf(excelHeader="账号", sort = 1)
    private String account;

    *姓名
    */
    @ExcelConf(excelHeader="姓名", sort = 2)
    private String realName;

    *身份证号
    */
    private String idCard;

    *用',' 隔开
    */
    private String cardPhotoUrl;

    *状态(0:待审核1:已认证;2:已驳回)
    */
    private String status;

    *提交时间
    */
	@ExcelConf(excelHeader="申请时间", sort = 3)
    private Date commitTime;

    *头像
    */
    private String icon;

	@ExcelConf(excelHeader="审核员", sort = 5)
	private String optionUser;
    
    *记录产生时间
    */
    private Date createTime;

    *最新的更新时间
    */
    private Date updateTime;

    *
    */
    private String createUserId;

    *
    */
    private String updateUserId;

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
    @Column(name = "icon")
    public String getIcon(){

    }
    public void setIcon(String icon){

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
	public String getOptionUser() {
		return optionUser;
	}
	public void setOptionUser(String optionUser) {
		this.optionUser = optionUser;
	}
    
}