package com.heacewalker.avatar.common.core.dao;

public enum DBOperator {

	DB_INSERT( "insert", "单条插入" ),
	DB_BATCH_INSERT( "batchInsert", "多条插入" ),
	DB_UPDATE( "update", "单条修改" ),
	DB_BATCH_UPDATE( "batchUpdate", "多条修改" ),
	DB_DELETE( "delete", "单条删除" ),
	DB_GET_LIST( "getList", "获取" );
	
	private String operator;
	private String operatorDesc;
	
	private DBOperator( String operator, String operatorDesc ){
		this.operator = operator;
		this.operatorDesc = operatorDesc;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperatorDesc() {
		return operatorDesc;
	}

	public void setOperatorDesc(String operatorDesc) {
		this.operatorDesc = operatorDesc;
	}
}
