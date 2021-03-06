package com.gudeng.commerce.gd.customer.service.impl.certif;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.gudeng.commerce.gd.customer.dao.BaseDao;
import com.gudeng.commerce.gd.customer.dto.certif.CertifPersonalDTO;
import com.gudeng.commerce.gd.customer.entity.certif.CertifPersonalEntity;
import com.gudeng.commerce.gd.customer.service.certif.CertifPersonalService;
/**
 * 谷登科技代码生成器出品,模板不代表正确，请酌情修改
 * 
 * @author lidong
 *
 */
public class CertifPersonalServiceImpl implements CertifPersonalService {
	@Autowired
	private BaseDao<?> baseDao;

	@Override
	public CertifPersonalDTO getById(String id) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		return baseDao.queryForObject("CertifPersonalEntity.getById", map, CertifPersonalDTO.class);
	}

	@Override
	public List<CertifPersonalDTO> getList(Map<String, Object> map) throws Exception {
		return baseDao.queryForList("CertifPersonalEntity.getList", map, CertifPersonalDTO.class);
	}

	@Override
	public int deleteById(String id) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		return baseDao.execute("CertifPersonalEntity.deleteById", map);
	}
	
	@Override
	public int deleteBatch(List<String> list) throws Exception {
		int len = list.size();
		Map<String, Object>[] batchValues = new HashMap[len];
		for (int i = 0; i < len; i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("id", StringUtils.trim(list.get(i)));
			batchValues[i] = map;
		}
		return baseDao.batchUpdate("CertifPersonalEntity.deleteById", batchValues).length;
	}

	@Override
	public int update(CertifPersonalDTO t) throws Exception {
		return baseDao.execute("CertifPersonalEntity.update", t);
	}

	@Override
	public int getTotal(Map<String, Object> map) throws Exception {
		return baseDao.queryForObject("CertifPersonalEntity.getTotal", map, Integer.class);
	}

	@Override
	public Long insert(CertifPersonalEntity entity) throws Exception {
		return baseDao.persist(entity, Long.class);
	}

	@Override
	public List<CertifPersonalDTO> getListPage(Map<String, Object> map) throws Exception {
		return baseDao.queryForList("CertifPersonalEntity.getListPage", map, CertifPersonalDTO.class);
	}
}