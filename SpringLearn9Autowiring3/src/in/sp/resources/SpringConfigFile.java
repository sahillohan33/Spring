package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean
	public Address createAddrObj1() {
		Address addr=new Address();
		
		addr.setHouseno(107);
		addr.setCity("Gohana");
		addr.setPincode(125069);
		return addr;
	}
	@Bean
	public Address createAddrObj2() {
		Address addr=new Address();
		
		addr.setHouseno(105);
		addr.setCity("Jind");
		addr.setPincode(125029);
		return addr;
	}
	@Bean
	public Student createStdObj() {
		Student std=new Student();
		std.setRollno(105);
		std.setName("Sarita Lohan");
//		std.setAddress(createAddrObj()); // manually Dependency Injection
		return std;
				
	}
}
