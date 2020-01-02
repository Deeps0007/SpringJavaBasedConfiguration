package com.spring.interview.SpringJavaBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
        
        Employee emp=context.getBean("empbean", Employee.class);
        System.out.println("Employee bean is created");
        
        
        College clg=context.getBean("clgBean",College.class);
        clg.viewCollege();
        
    }
}
