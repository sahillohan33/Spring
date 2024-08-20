package in.sp.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subject;

@Configuration
public class SpringConfigFile {
	@Bean
	public Address createAddrObj() {
		Address addr=new Address();
		
		addr.setHouseno(105);
		addr.setCity("Jind");
		addr.setPincode(125029);
		return addr;
	}
	@Bean
	public Subject createSubjectObj() {
		Subject subj =new Subject();
		List<String> subject_List=new ArrayList<String>();
		subject_List.add("Java");
		subject_List.add("Python");
		subject_List.add("C");
		subj.setSubjects(subject_List);
		return subj;
	}
	@Bean
	public Student createStdObj() {
		Student std=new Student();
		std.setRollno(109);
		std.setName("Sarita Lohan");
//		std.setAddress(createAddrObj()); // manually Dependency Injection
	//	std.setSubject(createSubjectObj());
		return std;
				
	}
}
