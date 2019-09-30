package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

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

//        Movie te = (Movie) context.getBean("textEditor");
        Movie obj = (Movie) context.getBean("Movie");
        obj.showActor();
    }
}
