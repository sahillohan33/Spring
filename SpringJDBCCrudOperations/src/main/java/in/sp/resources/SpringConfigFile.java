package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile {
		@Bean
		public DriverManagerDataSource myDataSource() {
			DriverManagerDataSource DataSource=new DriverManagerDataSource("com.mysql.cj.jdbc.Driver");
			DataSource.setUrl("jdbc:mysql://127.0.0.1:3306/spring_jdbc_db");
			DataSource.setUsername("root");
			DataSource.setPassword("sahil930");
			return DataSource;
		}
		@Bean
		public JdbcTemplate myJdbcTemplate() {
			JdbcTemplate jdbcTemplate=new JdbcTemplate();
			jdbcTemplate.setDataSource(myDataSource());
			return jdbcTemplate;
		}
}
