package SpringCoreAutowireAtc.com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		
		ApplicationContext factory= new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp=(Employee) factory.getBean("yaksh");
		
		System.out.println(emp);
		
		
	}

}
