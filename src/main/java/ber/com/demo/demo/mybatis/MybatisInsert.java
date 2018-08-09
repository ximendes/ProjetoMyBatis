package ber.com.demo.demo.mybatis;

import java.io.IOException;
import java.io.Reader;

import ber.com.demo.demo.model.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisInsert {
	
	
	public void teste() throws IOException {
	    Reader reader = Resources.getResourceAsReader("mybatis/SqlMapConfig.xml");

	    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
	    sqlSessionFactory.getConfiguration().addMapper(Student.class);
	    SqlSession session = sqlSessionFactory.openSession();
	    
	    //Create a new student object
	    Student student = new Student(1L, "Mohammad","It", 80, 984803322, "Mohammad@gmail.com" );
	    
	    //Insert student data      
	    session.insert("Student.insert", student);
	    System.out.println("record inserted successfully");
	    session.commit();
	    session.close();
	}
}
