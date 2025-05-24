package in.orcas.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.orcas.bean.EngCourse;

public class TestApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Access beans by their auto-generated names
        EngCourse course0 = context.getBean("in.orcas.bean.EngCourse#0", EngCourse.class);
        System.out.println(course0);
        System.out.println();

        EngCourse course1 = context.getBean("in.orcas.bean.EngCourse#1", EngCourse.class);
        System.out.println(course1);
        System.out.println();

        EngCourse course2 = context.getBean("in.orcas.bean.EngCourse#2", EngCourse.class);
        System.out.println(course2);
    }
}
