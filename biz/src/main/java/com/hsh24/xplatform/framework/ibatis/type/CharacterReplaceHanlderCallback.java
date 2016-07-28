package com.hsh24.xplatform.framework.ibatis.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

/**
 * 
 * @author
 * 
 */
public class CharacterReplaceHanlderCallback implements TypeHandler<Object> {

	@Override
	public void setParameter(PreparedStatement ps, int i, Object obj, JdbcType jdbcType) throws SQLException {
		String parameter = (String) obj;
		parameter = parameter.replace("'", "");
		ps.setString(i, parameter);
	}

	@Override
	public Object getResult(ResultSet rs, String columnName) throws SQLException {
		return new UnsupportedOperationException();
	}

	@Override
	public Object getResult(ResultSet rs, int columnIndex) throws SQLException {
		return new UnsupportedOperationException();
	}

	@Override
	public Object getResult(CallableStatement cs, int columnIndex) throws SQLException {
		return new UnsupportedOperationException();
	}

}