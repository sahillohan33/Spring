package in.sp.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] args) {
		String conf_Loc="/in/sp/resources/applicationContext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(conf_Loc);
		
		Student std1=(Student) context.getBean("stdId1");
		std1.display();
		System.out.println("----------------------");
		Student std2=(Student) context.getBean("stdId2");
		std2.display();
	}

}
// 1. spring-beans-xxx.jar
// 2. spring-core-xxx.jar
// 3. spring-context-xxx.jar
// 4. common-logging-xxx.jar
// 5. spring-expression-xxx.jar
