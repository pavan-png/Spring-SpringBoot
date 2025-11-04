package in.orcas.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 1️⃣ How long annotation should stay
@Retention(RetentionPolicy.RUNTIME)

// 2️⃣ Where annotation can be used
@Target({ElementType.TYPE, ElementType.METHOD})

// 3️⃣ Create the annotation
public @interface MyAnnotation {

    // Properties (these act like inputs to the annotation)
    String author() default "Unknown";
    String version() default "1.0";
}
