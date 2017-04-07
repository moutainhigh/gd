package com.gudeng.commerce.gd.customer.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.gudeng.commerce.gd.customer.annotation.ExcelConf;

/**
 * 用户活动积分变更记录
 * @author gdeng
 *
 */
@Entity(name = "activity_userIntegralChange")
public class ActivityUserIntegralChangeEntity  implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -6311147194426034714L;

	/**
    *ID
    */
    private Integer id;

    *用户ID
    */
    private Integer memberId;

    *手机号码
    */
    @ExcelConf(excelHeader="手机号码", sort=2)
    private String mobile;

    *活动ID
    */
    private Integer activityId;

    *所获积分
    */
    @ExcelConf(excelHeader="变更积分", sort=5)
    private Integer integral;

    *变更类型 1增加积分 2扣减积分
    */
    private String integralType;

    *创建时间
    */
    private Date createTime;

    *创建人
    */
    @ExcelConf(excelHeader="创建人", sort=8)
    private String createUser;

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
    @Column(name = "mobile")
    public String getMobile(){

    }
    public void setMobile(String mobile){

    }
    @Column(name = "activityId")
    public Integer getActivityId(){

    }
    public void setActivityId(Integer activityId){

    }
    @Column(name = "integral")
    public Integer getIntegral(){

    }
    public void setIntegral(Integer integral){

    }
    @Column(name = "integralType")
    public String getIntegralType(){

    }
    public void setIntegralType(String integralType){

    }
    @Column(name = "createTime")
    public Date getCreateTime(){

    }
    public void setCreateTime(Date createTime){

    }
    @Column(name = "createUser")
    public String getCreateUser(){

    }
    public void setCreateUser(String createUser){

    }
}