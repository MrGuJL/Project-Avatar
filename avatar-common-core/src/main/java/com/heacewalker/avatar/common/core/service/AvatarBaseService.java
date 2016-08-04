package com.heacewalker.avatar.common.core.service;

import com.heacewalker.avatar.common.core.entity.AvatarBaseEntity;

public interface AvatarBaseService<T extends AvatarBaseEntity> {
	
	public int save( T entity ) throws Exception;
	
	public int modify( T entity );
	
	public int remove( T entity );

}
