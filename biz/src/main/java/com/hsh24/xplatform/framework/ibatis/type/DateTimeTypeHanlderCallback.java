package com.hsh24.xplatform.framework.ibatis.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

/**
 * 
 * @author
 * 
 */
public class DateTimeTypeHanlderCallback implements TypeHandler<Object> {

	@Override
	public void setParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		ps.setString(i, df.format(parameter));
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
