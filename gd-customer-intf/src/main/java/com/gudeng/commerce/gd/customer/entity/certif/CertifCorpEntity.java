package com.gudeng.commerce.gd.customer.entity.certif;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.gudeng.commerce.gd.customer.annotation.ExcelConf;

@Entity(name = "certif_corp")
public class CertifCorpEntity  implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 6078350907494788227L;

	/**
    *
    */
    private Integer id;

    *用户id
    */
    private Integer memberId;

    *账号
    */
    @ExcelConf(excelHeader="用户账户", sort=1)
    private String account;

    *合作社
    */
    @ExcelConf(excelHeader="合作社名称", sort=2)
    private String corpName;

    *邻近市场
    */
    private String markets;

    *商铺名称
    */
    private String shopName;

    *主营分类
    */
    private Integer cateId;

    *店铺id( aim to 主营分类、所在地址 )
    */
    private Integer businessId;

    *申请认证时间
    */
    private Date commitTime;

    *供应量
    */
    private Integer stockCount;

    *供应量单位
    */
    private String units;

    *营业执照号码
    */
    private String bzl;

    *营业执照照片
    */
    private String bzlPhotoUrl;

    *状态(0:待审核1:已认证;2:已驳回)
    */
    private String status;

    *省
    */
    private Integer province;

    *市
    */
    private Integer city;

    *县
    */
    private Integer area;

    *地址
    */
    private String address;

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

    private String optionUser ;

    @Column(name = "optionUser")
	public String getOptionUser() {
		return optionUser;
	}
	public void setOptionUser(String optionUser) {
		this.optionUser = optionUser;
	}

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
    @Column(name = "corpName")
    public String getCorpName(){

    }
    public void setCorpName(String corpName){

    }
    @Column(name = "markets")
    public String getMarkets(){

    }
    public void setMarkets(String markets){

    }
    @Column(name = "shopName")
    public String getShopName(){

    }
    public void setShopName(String shopName){

    }
    @Column(name = "cateId")
    public Integer getCateId(){

    }
    public void setCateId(Integer cateId){

    }
    @Column(name = "businessId")
    public Integer getBusinessId(){

    }
    public void setBusinessId(Integer businessId){

    }
    @Column(name = "commitTime")
    public Date getCommitTime(){

    }
    public void setCommitTime(Date commitTime){

    }
    @Column(name = "stockCount")
    public Integer getStockCount(){

    }
    public void setStockCount(Integer stockCount){

    }
    @Column(name = "units")
    public String getUnits(){

    }
    public void setUnits(String units){

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
    @Column(name = "status")
    public String getStatus(){

    }
    public void setStatus(String status){

    }
    @Column(name = "province")
    public Integer getProvince(){

    }
    public void setProvince(Integer province){

    }
    @Column(name = "city")
    public Integer getCity(){

    }
    public void setCity(Integer city){

    }
    @Column(name = "area")
    public Integer getArea(){

    }
    public void setArea(Integer area){

    }
    @Column(name = "address")
    public String getAddress(){

    }
    public void setAddress(String address){

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
}