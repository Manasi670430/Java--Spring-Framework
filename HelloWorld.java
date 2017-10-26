package SpringPackage;

import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class HelloWorld  {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("file:C:/Users/Manasi/workspace/SpringHello/src/beans.xml");
		World greetings = (World) context.getBean("Greeter");
		System.out.println(greetings.getGreeting());

	}


} 
