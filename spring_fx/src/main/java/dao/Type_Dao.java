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

	@Select("select Type.*,book.name bookname from type inner join book on type.bookid=book.id ${where}")
	public List<Type> select(@Param("where") String where);
	
	@Select("select * from type where id=#{id}")
	public Type selectById(int id);
	
	@Delete("delete from type where id=#{id}")
	public void delete(int id);
	
	@Insert("insert into type(name,sex,bookid) values(#{name},#{sex},#{bookid})")
	public void insert(Type t);
	
	@Update("update type set name=#{name},sex=#{sex},bookid=#{bookid} where id=#{id}")
	public void update(Type t);
}
