package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean
	public Address createAddrObj() {
		Address addr=new Address(101,"Hansi",125031);
		return addr;
	}
	@Bean
	public Student createStdObj() {
		Student std=new Student(101,"Sahil Kumar",createAddrObj());
		return std;
				
	}
}
