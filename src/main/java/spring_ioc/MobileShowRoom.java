package spring_ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MobileShowRoom {
	public static void main(String[] args) {
		BeanFactory container =  new XmlBeanFactory(new ClassPathResource("hello.xml"));
		System.out.println(container.getBean(Mobile.class)) ;
		System.out.println(container.getBean(SonyCamera.class)) ;
	}
	

}
