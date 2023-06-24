package springsqldemo.springsql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import sqlspring.Models.ProductsList;

@SpringBootApplication
public class SqlringsqlApplication implements CommandLineRunner  {

	@Autowired
	private JdbcTemplate jdbc;
	
	public static void main(String[] args) {
		SpringApplication.run(SqlringsqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		String cmd_getAllProducts = "select * from productlist";
	 List<ProductsList> pList = 	jdbc.query(cmd_getAllProducts, BeanPropertyRowMapper.newInstance(ProductsList.class));
	 
	 pList.forEach(System.out :: println);
	 
	}
	
	


}
