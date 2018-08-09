package ber.com.demo.demo.repository;

import java.util.List;

import ber.com.demo.demo.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentMyBatisRepository {
	
	final String FIND_BY_ID = "SELECT * FROM student WHERE id = #{id}";
	
	
	@Select(FIND_BY_ID)
	public Student findById(long id);
	
	@Select("select * from student")
	public List<Student> findAll();

}
