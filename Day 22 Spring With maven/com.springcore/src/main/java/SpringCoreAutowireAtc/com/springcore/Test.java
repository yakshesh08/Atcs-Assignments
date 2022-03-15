package SpringCoreAutowireAtc.com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("SpringCoreAutowireAtc.com.springcore")
public class Test {
	
	public static void main(String[] args) {
		
		
		ApplicationContext factory= new AnnotationConfigApplicationContext(Test.class);
		Employee emp=(Employee) factory.getBean("yaksh");
		
		System.out.println(emp);
		
		
	}

}
