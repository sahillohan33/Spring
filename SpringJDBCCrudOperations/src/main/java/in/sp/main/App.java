package in.sp.main;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.beans.Student;
import in.sp.mappers.StudentRowMapper;
import in.sp.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    {   	
      ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
      JdbcTemplate jdbcTemplate=context.getBean(JdbcTemplate.class);
      
      //---------------- insert operation ------------------------------------
      
      /*
      int std_roll=102;
      String std_name="Aman";
      int marks=88;
      String insert_query="insert into student values(?,?,?)";
      int count=jdbcTemplate.update(insert_query,std_roll,std_name,marks);
      if(count>0) {
    	  System.out.println("Insert Data Successfully");
      }
      else {
    	  System.out.println("Something wrong....");
      }
      */
     //--------- update operation ------------------------------------------
      /*
      String std_name="Sohit";
  	  int std_roll=101;
      String update_query="update student set std_name=? where std_rollno=?";
      int count=jdbcTemplate.update(update_query,std_name,std_roll);
      if(count>0) {
    	  System.out.println("Data Updated successfully");
      }
      else {
    	  System.out.println("Something wrong");
      }
      */
      
      // --------------------- delete operation -------------------------
      /*
      int rollno=101;
      String delete_query="delete from student where std_rollno=?";
      int count=jdbcTemplate.update(delete_query,rollno);
      if(count>0) {
    	  System.out.println("Data deleted successfully");
      }
      else {
    	  System.out.println("Something wrong....");
      }
      */
       
      // --------------------- select operation 1------------------------
      /*
      String select_query="select * from student";
      List<Student> std_list=jdbcTemplate.query(select_query,new StudentRowMapper());
      for(Student std: std_list) {
    	  System.out.println("Roll Number : "+std.getRollno());
    	  System.out.println("Name : "+std.getName());
    	  System.out.println("Marks : "+std.getMarks());
    	  System.out.println("----------------------------------------------");
      }
      */
      // -------------------------- select operation 2 ----------------------------
      /*
      int rollno=105;
      String select_query="select * from student where std_rollno=?";
      List<Student> std_list=jdbcTemplate.query(select_query,new StudentRowMapper(),rollno);
      for(Student std: std_list) {
    	  System.out.println("Roll Number : "+std.getRollno());
    	  System.out.println("Name : "+std.getName());
    	  System.out.println("Marks : "+std.getMarks());
    	  System.out.println("----------------------------------------------");
      }
      */
   // -------------------------- select operation 3 ----------------------------
      
      int rollno=105;
      String select_query="select * from student where std_rollno=?";
      Student std=jdbcTemplate.queryForObject(select_query,new StudentRowMapper(),rollno);
      System.out.println("Roll Number : "+std.getRollno());
	  System.out.println("Name : "+std.getName());
	  System.out.println("Marks : "+std.getMarks());
      
    }
}
