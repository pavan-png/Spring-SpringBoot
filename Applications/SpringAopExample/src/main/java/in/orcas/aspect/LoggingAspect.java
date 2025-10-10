package in.orcas.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // 1️⃣ Pointcut: Tells which methods should get extra logic
    // Here, we target all methods inside the service package
    @Pointcut("execution(* in.orcas.service.*.*(..))")
    public void serviceLayerMethods() {
        // Empty method: only used to name the pointcut
    }

    // 2️⃣ Advice: The extra logic to run before service methods
    @Before("serviceLayerMethods()")
    public void logBeforeService() {
        System.out.println("🔍 AOP Advice: Validating student details before service method executes...");
    }
}
