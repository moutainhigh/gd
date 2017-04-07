package com.gudeng.commerce.gd.bi.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "grd_pro_freight_order")
public class GrdProFreightOrderEntity  implements java.io.Serializable{
	
   /**
	* 
	*/
	private static final long serialVersionUID = 6624758126802112564L;
    /**
    *
    */
    private Long id;

    *
    */
    private Long marketId;

    *
    */
    private String marketName;

    *团队id
    */
    private Integer teamId;

    *团队名称
    */
    private String teamName;

    *地推人员信息Id
    */
    private Integer grdId;

    *地推姓名
    */
    private String grdUserName;

    *地推人员手机号
    */
    private String grdMobile;

    *货运订单号
    */
    private String freightOrderNo;

    *承运人
    */
    private String reciever;

    *发运人
    */
    private String publisher;

    *订单生成时间
    */
    private Date generateTime;

    *订单状态
    */
    private String orderStatus;

    *支付状态
    */
    private String payStatus;

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

    @Column(name = "id")
    public Long getId(){

    }
    public void setId(Long id){

    }
    @Column(name = "marketId")
    public Long getMarketId(){

    }
    public void setMarketId(Long marketId){

    }
    @Column(name = "marketName")
    public String getMarketName(){

    }
    public void setMarketName(String marketName){

    }
    @Column(name = "teamId")
    public Integer getTeamId(){

    }
    public void setTeamId(Integer teamId){

    }
    @Column(name = "teamName")
    public String getTeamName(){

    }
    public void setTeamName(String teamName){

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
    @Column(name = "freightOrderNo")
    public String getFreightOrderNo(){

    }
    public void setFreightOrderNo(String freightOrderNo){

    }
    @Column(name = "reciever")
    public String getReciever(){

    }
    public void setReciever(String reciever){

    }
    @Column(name = "publisher")
    public String getPublisher(){

    }
    public void setPublisher(String publisher){

    }
    @Column(name = "generateTime")
    public Date getGenerateTime(){

    }
    public void setGenerateTime(Date generateTime){

    }
    @Column(name = "orderStatus")
    public String getOrderStatus(){

    }
    public void setOrderStatus(String orderStatus){

    }
    @Column(name = "payStatus")
    public String getPayStatus(){

    }
    public void setPayStatus(String payStatus){

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