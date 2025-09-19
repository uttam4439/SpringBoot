package org.rajuttam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // ApplicationContext create a container for me
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // when this line comes it create object for that class from configuration in xml file
        Student s1 = (Student) context.getBean("student");
        s1.work();
    }
}
