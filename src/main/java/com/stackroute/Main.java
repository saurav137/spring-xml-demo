package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
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
        XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("Beans.xml"));
        Movie obj = (Movie) factory.getBean("Movie");
        obj.showActor();
    }
}
