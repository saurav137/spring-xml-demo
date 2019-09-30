package com.stackroute;

import com.stackroute.domain.BeanLifecycleDemo;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.context.support.AbstractApplicationContext;

import java.beans.Beans;

/**
 * Hello world!
 *
 */

public class Main
{
    public static void main ( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        ((AbstractApplicationContext)context).registerShutdownHook();
//        Movie te = (Movie) context.getBean("textEditor");
        BeanLifecycleDemo beanLifecycleDemo = (BeanLifecycleDemo) context.getBean("Lifecycle",BeanLifecycleDemo.class);
       // beanLifecycleDemo.show();



    }
}
