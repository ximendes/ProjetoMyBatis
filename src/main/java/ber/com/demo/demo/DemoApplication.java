package ber.com.demo.demo;

import ber.com.demo.demo.mybatis.InsertViagem;
import ber.com.demo.demo.repository.StudentMyBatisRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
    StudentMyBatisRepository repository;

	@Autowired
    InsertViagem insertViagem;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {


		insertViagem.insertViagem();

		
		//new MybatisInsert().teste();

//		logger.info("Student id 10001 -> {}", repository.findById(10001L));
//		
//		logger.info("All users 1 -> {}", repository.findAll());
	}
}
