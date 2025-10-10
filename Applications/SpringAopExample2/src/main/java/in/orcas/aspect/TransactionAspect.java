package in.orcas.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TransactionAspect {

    // Define Pointcut for all methods inside DAO package
    @Pointcut("execution(* in.orcas.dao.*.*(..))")
    public void daoMethods() {}

    // Run this advice when exception occurs in DAO layer
    @AfterThrowing(value = "daoMethods()", throwing = "ex")
    public void rollBackTransaction(Exception ex) {
        System.out.println("🔴 Exception detected! Rolling back transaction...");
        System.out.println("❌ Reason: " + ex.getMessage());
    }
}
