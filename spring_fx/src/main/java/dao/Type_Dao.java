package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import entity.Type;

@Repository
public interface Type_Dao {

	@Select("select count(1) from  Type   ${where}")
	public  Integer getCount(@Param("where") String where);

	@Select("select Type.* from  Type   ${where} ${limit}")
	public  List<Type> getWhere(@Param("where") String where,@Param("limit") String limit);

	@Select("select Type.* from  Type ")
	public  List<Type> getAll();

	@Select("select Type.* from Type  where id=#{id}")
	public  Type getByid(@Param("id")Integer id);

	@Delete("delete from Type where id=#{id}")
	public Integer delete(@Param("id")Integer id);

	 @Insert("insert into Type (name) values(#{name})")
	 public Integer insert(Type t);

	 @Update("update Type set name=#{name} where id=#{id}")
	 public Integer update(Type t);
}
