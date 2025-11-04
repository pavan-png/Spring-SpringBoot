package in.orcas;

import java.lang.reflect.Method;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.orcas.annotations.MyAnnotation;
import in.orcas.controller.StudentController;

@SpringBootApplication
public class CustomAnnotationApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomAnnotationApplication.class, args);
        System.out.println("Spring Boot Custom Annotation Example Started...");

        // Verify annotation presence
        StudentController controller = new StudentController();
        Class<?> clazz = controller.getClass();

        // Check class-level annotation
        if (clazz.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation ann = clazz.getAnnotation(MyAnnotation.class);
            System.out.println("Class Annotation - Author: " + ann.author() + ", Version: " + ann.version());
        }

        // Check method-level annotations
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation ann = method.getAnnotation(MyAnnotation.class);
                System.out.println("Method: " + method.getName() + ", Author: " + ann.author());
            }
        }
    }
}
