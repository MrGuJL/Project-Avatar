package com.heacewalker.avatar.common.core.entity;

import java.io.Serializable;

public class AvatarBaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String objectRemark;
	private String modifyUser;
	private String modifyDateTime;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getObjectRemark() {
		return objectRemark;
	}
	public void setObjectRemark(String objectRemark) {
		this.objectRemark = objectRemark;
	}
	public String getModifyUser() {
		return modifyUser;
	}
	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}
	public String getModifyDateTime() {
		return modifyDateTime;
	}
	public void setModifyDateTime(String modifyDateTime) {
		this.modifyDateTime = modifyDateTime;
	}

}
