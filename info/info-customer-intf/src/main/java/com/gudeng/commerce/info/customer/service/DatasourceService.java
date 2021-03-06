package com.gudeng.commerce.info.customer.service;

import java.util.List;
import java.util.Map;

import com.gudeng.commerce.info.customer.dto.DatasourceDTO;
import com.gudeng.commerce.info.customer.entity.DatasourceEntity;


public interface DatasourceService {

	/**
	 * 添加
	 * 
	 * @param DatasourceEntity
	 *            obj
	 * @return Long 添加成功后id
	 * 
	 */
	public Long insertEntity(DatasourceEntity obj) throws Exception;

	/**
	 * 通过ID删除对象
	 * 
	 * @param id
	 * @return void
	 * 
	 */
	public int deleteById(Long id) throws Exception;

	/**
	 * 批量通过ID删除对象
	 * 
	 * @param idList
	 * @return void
	 * 
	 */
	public int batchDeleteById(List<Long> idList) throws Exception;
	
	/**
	 * 通过对象更新数据库
	 * 
	 * @param DatasourceDTO
	 * @return int
	 * 
	 */
	public int updateDTO(DatasourceDTO obj) throws Exception;
	
	/**
	 * 批量通过对象更新数据库
	 * 
	 * @param DatasourceDTO
	 * @return int
	 * 
	 */
	public int batchUpdateDTO(List<DatasourceDTO> objList) throws Exception;
	
	/**
	 * 查询记录数
	 * 
	 * @param map
	 * @return 记录数
	 * 
	 */
	public int getTotal(Map<String, Object> map) throws Exception;

	/**
	 * 根据ID查询对象
	 * 
	 * @param id
	 * @return DatasourceDTO
	 * 
	 */
	public DatasourceDTO getById(Long id) throws Exception;

	/**
	 * 根据条件查询list(分页查询)
	 * 
	 * @param map
	 * @return List<DatasourceDTO>
	 */
	public List<DatasourceDTO> getListByConditionPage(Map<String, Object> map) throws Exception;

	/**
	 * 根据条件查询list
	 * 
	 * @param map
	 * @return List<DatasourceDTO>
	 */
	public List<DatasourceDTO> getListByCondition(Map<String, Object> map) throws Exception;
}
