package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] args) {
	//	String conf_Loc="/in/sp/resources/applicationContext.xml";
		String conf_Loc="/in/sp/resources/applicationContext2.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(conf_Loc);
		
		Student std=(Student) context.getBean("stdId");
		std.display();
		
	}

}