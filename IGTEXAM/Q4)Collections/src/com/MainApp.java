package com;
import org.apache.log4j.lf5.util.Resource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

 

public class MainApp {

 

    public static void main(String[] args) {

        System.out.println("========SETTER INJUCTION");



        ApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassPathResource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        Employee p= (Employee)factory.getBean("Employee");
        p.display();


 

    }

 

}