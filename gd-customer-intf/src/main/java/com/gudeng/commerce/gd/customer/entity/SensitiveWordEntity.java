package com.gudeng.commerce.gd.customer.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.gudeng.commerce.gd.customer.annotation.ExcelConf;

@Entity(name = "sensitive_word")
public class SensitiveWordEntity  implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 6916836909518733690L;

	/**
    *ID
    */
    private Integer id;

    *敏感词
    */
    @ExcelConf(excelHeader="敏感词", sort = 1)
    private String name;

    *创建时间
    */
    @ExcelConf(excelHeader="创建时间", sort = 3)
    private Date createTime;

    *最后更新时间
    */
    @ExcelConf(excelHeader="最后更新时间", sort = 4)
    private Date updateTime;

    *说明
    */
    @ExcelConf(excelHeader="说明", sort = 2)
    private String description;

    @Column(name = "id")
    public Integer getId(){

    }
    public void setId(Integer id){

    }
    @Column(name = "name")
    public String getName(){

    }
    public void setName(String name){

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
    @Column(name = "description")
    public String getDescription(){

    }
    public void setDescription(String description){

    }
}