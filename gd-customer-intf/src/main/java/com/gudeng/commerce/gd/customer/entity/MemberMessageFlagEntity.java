package com.gudeng.commerce.gd.customer.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "member_message_flag")
public class MemberMessageFlagEntity  implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -3017188413279141329L;

	/**
    *
    */
    private Long id;

    *用户ID
    */
    private Long memberId;

    *是否发送，发送1，未发送0
    */
    private String sendFlag;
    
    /**
    *创建人
    */
    private String createUserId;

    *创建时间
    */
    private Date createTime;

    *修改人
    */
    private String updateUserId;

    *修改时间
    */
    private Date updateTime;

    @Column(name = "id")
    public Long getId(){

    }
    public void setId(Long id){

    }
    @Column(name = "memberId")
    public Long getMemberId(){

    }
    public void setMemberId(Long memberId){

    }
    @Column(name = "sendFlag")
    public String getSendFlag(){

    }
    public void setSendFlag(String sendFlag){

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