package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import entity.Type;

@Repository
public interface Type_Dao {

	@Select("select * from type ${where}")
	public List<Type> select(@Param("where") String where);
}
