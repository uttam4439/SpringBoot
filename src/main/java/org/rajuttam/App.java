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
        /* ApplicationContext create a container for me
         when this line comes it create object for all class from configuration in xml file */

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Student s1 = (Student) context.getBean("student");
        s1.work();

        /* "By default " Singleton scope means Spring creates only one bean instance per container,
         and the same instance is shared across all references and injections.

       2. A new bean instance is created every time you request it from the Spring container
       (getBean() or injection). --> beans are not shared. every bean can be different data
       (no automatic destruction).

         */
    }
}
