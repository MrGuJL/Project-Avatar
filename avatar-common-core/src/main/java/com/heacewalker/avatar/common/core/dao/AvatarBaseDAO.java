package com.heacewalker.avatar.common.core.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heacewalker.avatar.common.core.entity.AvatarBaseEntity;

@Service("avatarBaseDAO")
public abstract class AvatarBaseDAO<T extends AvatarBaseEntity> extends SqlSessionDaoSupport{
	
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	public SqlSessionTemplate getSessionTemplate(){
		return sessionTemplate;
	}
	
	public int insert(T entity) {
		if( entity == null ){
			throw new RuntimeException("entity is null");
		}
		int records = sessionTemplate.insert( DBOperator.DB_INSERT.getOperator(), entity );
		return records;
	}

	public int insert(List<T> list) {
		if( list == null ){
			throw new RuntimeException("list is null");
		}
		if( list.size() == 0 ){
			throw new RuntimeException("list size is 0");
		}
		int records = sessionTemplate.insert( DBOperator.DB_BATCH_INSERT.getOperator(), list );
		return records;
	}

	public int update(T entity) {
		if( entity == null ){
			throw new RuntimeException("entity is null");
		}
		int records = sessionTemplate.insert( DBOperator.DB_UPDATE.getOperator(), entity );
		return records;
	}

	public int update(List<T> list) {
		if( list == null ){
			throw new RuntimeException("list is null");
		}
		if( list.size() == 0 ){
			throw new RuntimeException("list size is 0");
		}
		int records = sessionTemplate.insert( DBOperator.DB_BATCH_UPDATE.getOperator(), list );
		return records;
	}

	public int delete(T entity) {
		if( entity == null ){
			throw new RuntimeException("entity is null");
		}
		int records = sessionTemplate.insert( DBOperator.DB_DELETE.getOperator(), entity );
		return records;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<T> getList(HashMap<String, Object> param) {
		return (List)sessionTemplate.selectList( DBOperator.DB_GET_LIST.getOperator(), param );
	}

}
