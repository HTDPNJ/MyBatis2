package converter;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BooleanAndIntConverter extends BaseTypeHandler<Boolean>
{ //自己实现类型转换器（java的bool转换成db的number类型）

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Boolean parameter, JdbcType jdbcType) throws SQLException
    {
        if(parameter){
            ps.setInt(i,1);
        }else{
            ps.setInt(i,0);
        }
    }

    @Override
    public Boolean getNullableResult(ResultSet rs, String columnName) throws SQLException
    {
        int sexNum=rs.getInt(columnName);
        return sexNum==1?true:false;
    }

    @Override
    public Boolean getNullableResult(ResultSet rs, int columnIndex) throws SQLException
    {
        int sexNum=rs.getInt(columnIndex);
        return sexNum==1?true:false;
    }

    @Override
    public Boolean getNullableResult(CallableStatement cs, int columnIndex) throws SQLException
    {
        int sexNum=cs.getInt(columnIndex);
        return sexNum==1?true:false;
    }
}
