package com.heacewalker.avatar.demo.dao;

import org.springframework.stereotype.Service;

import com.heacewalker.avatar.common.core.dao.AvatarBaseDAO;
import com.heacewalker.avatar.common.core.entity.AvatarBaseEntity;

@Service("avatarDemoDAO")
public class AvatarDemoDAO<T extends AvatarBaseEntity> extends AvatarBaseDAO<T> {

}
