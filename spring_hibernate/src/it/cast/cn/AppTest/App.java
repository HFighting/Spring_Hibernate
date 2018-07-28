package it.cast.cn.AppTest;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import it.cast.cn.javabean.Emploee;
import it.cast.cn.service.Service;

public class App {

	static private ApplicationContext ac ;
	static{
		ac = new ClassPathXmlApplicationContext("bean.xml");
	}
	@Test
	public void test(){
		Emploee em = (Emploee)ac.getBean("emploee");
		em.setName("bloody butterfly");
		em.setAge(28);
		em.setDept("µÏ²½ÑÇÉç");
		
		Service service = (Service) ac.getBean("service");
		service.save(em);
	}
	
}
