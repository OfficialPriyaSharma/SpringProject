package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.xml.XmlBeanFactory;

public class BookImpl {

    public static void main(String[] args) {

        Resource classPathRes = new ClassPathResource("SpringConfig.xml");
        BeanFactory beanFactoryContainer =  new XmlBeanFactory(classPathRes);
        Book obj = (Book)beanFactoryContainer.getBean("bookBean");

        System.out.println(obj);
        System.out.println(obj.getAuth());

        obj.display();
        System.out.println(obj);
        System.out.println(obj.getAuth());

        Book obj1 = (Book)beanFactoryContainer.getBean("bookBean");
        System.out.println(obj);
    }
}
