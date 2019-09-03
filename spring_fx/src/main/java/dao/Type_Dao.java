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

	@Select("select * from Type ${txt}")
	public List<Type> select(@Param("txt") String txt);
	
	@Select("select * from Type where id=#{id}")
	public Type selectById(int id);
	
	@Delete("delete from Type where id=#{id}")
	public void delete(int id);
	
	@Insert("insert into Type(name) values(#{name})")
	public void insert(Type t);
	
	@Update("update Type set name=#{name} where id=#{id}")
	public void update(Type t);
}
