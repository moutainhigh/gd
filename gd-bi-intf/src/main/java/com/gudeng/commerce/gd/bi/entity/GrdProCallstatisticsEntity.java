package com.gudeng.commerce.gd.bi.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.gudeng.commerce.gd.bi.annotation.ExcelConf;

@Entity(name = "grd_pro_callstatistics")
public class GrdProCallstatisticsEntity  implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 8345145847493564381L;

	/**
    *
    */
    private Integer id;

    *
    */
    private Integer marketId;

    *
    */
    @ExcelConf(excelHeader="主叫人所属市场",sort=6)
    private String marketName;

    *地推人员信息Id
    */
    private Integer grdId;

    *地推姓名
    */
    @ExcelConf(excelHeader="地推姓名",sort=5)
    private String grdUserName;

    *地推人员手机号
    */
    private String grdMobile;

    *1:物流公司找车2:物流公司分给我的货 3:物流公司订单4:车主找货5:车主找订单
     6:货物我发的货7:货主运单
    */
    @ExcelConf(excelHeader="拨打来源",sort=1)
    private String source;

    *0 货主 1 车主 2 物流公司
    */
    @ExcelConf(excelHeader="APP来源",sort=2)
    private String callRole;

    *主叫人姓名
    */
    @ExcelConf(excelHeader="主叫姓名",sort=3)
    private String e_Name;

    *主叫号码
    */
    @ExcelConf(excelHeader="主叫手机",sort=4)
    private String e_Mobile;

    *1 干线业务 2 同城业务
    */
    @ExcelConf(excelHeader="主叫业务范围",sort=7)
    private String serviceType;

    *拨打时间
    */
    @ExcelConf(excelHeader="拨打时间",sort=10)
    private Date callTime;

    *被叫人手机号
    */
    @ExcelConf(excelHeader="被叫手机",sort=9)
    private String s_Mobile;

    *被叫人姓名
    */
    @ExcelConf(excelHeader="被叫姓名",sort=8)
    private String s_Name;

    *
    */
    private String createUserId;

    *记录产生的时间
    */
    private Date createTime;

    *
    */
    private String updateUserId;

    *
    */
    private Date updateTime;

    public Integer getId(){

    }
    public void setId(Integer id){

    }
    @Column(name = "marketId")
    public Integer getMarketId(){

    }
    public void setMarketId(Integer marketId){

    }
    @Column(name = "marketName")
    public String getMarketName(){

    }
    public void setMarketName(String marketName){

    }
    @Column(name = "grdId")
    public Integer getGrdId(){

    }
    public void setGrdId(Integer grdId){

    }
    @Column(name = "grdUserName")
    public String getGrdUserName(){

    }
    public void setGrdUserName(String grdUserName){

    }
    @Column(name = "grdMobile")
    public String getGrdMobile(){

    }
    public void setGrdMobile(String grdMobile){

    }
    @Column(name = "source")
    public String getSource(){

    }
    public void setSource(String source){

    }
    @Column(name = "callRole")
    public String getCallRole(){

    }
    public void setCallRole(String callRole){

    }
    @Column(name = "e_Name")
    public String getE_Name(){

    }
    public void setE_Name(String e_Name){

    }
    @Column(name = "e_Mobile")
    public String getE_Mobile(){

    }
    public void setE_Mobile(String e_Mobile){

    }
    @Column(name = "serviceType")
    public String getServiceType(){

    }
    public void setServiceType(String serviceType){

    }
    @Column(name = "callTime")
    public Date getCallTime(){

    }
    public void setCallTime(Date callTime){

    }
    @Column(name = "s_Mobile")
    public String getS_Mobile(){

    }
    public void setS_Mobile(String s_Mobile){

    }
    @Column(name = "s_Name")
    public String getS_Name(){

    }
    public void setS_Name(String s_Name){

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