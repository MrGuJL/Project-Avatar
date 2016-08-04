package com.heacewalker.avatar.common.core.service;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.heacewalker.avatar.common.core.dao.AvatarBaseDAO;
import com.heacewalker.avatar.common.core.entity.AvatarBaseEntity;

public abstract class AvatarBaseServiceImpl<T extends AvatarBaseEntity> implements AvatarBaseService<T> {

	private static Logger log = Logger.getLogger( AvatarBaseServiceImpl.class );
	
	@Autowired
	private AvatarBaseDAO<T> avatarBaseDAO;
	
	@Transactional
	@Override
	public int save(T entity) throws Exception {
		log.info("新增[ " + entity.getClass().getName() + " ]，数据内容[ " + ToStringBuilder.reflectionToString(entity) + " ]");
		return avatarBaseDAO.insert(entity);
	}

	@Override
	public int modify(T entity) {
		log.info("修改[ " + entity.getClass().getName() + " ]，数据内容[ " + ToStringBuilder.reflectionToString(entity) + " ]");
		return avatarBaseDAO.update(entity);
	}

	@Override
	public int remove(T entity) {
		log.info("删除[ " + entity.getClass().getName() + " ]，数据内容[ " + ToStringBuilder.reflectionToString(entity) + " ]");
		return avatarBaseDAO.delete(entity);
	}
	
}
