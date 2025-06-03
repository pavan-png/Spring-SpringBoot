package in.orcas.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;


@Component
public class MyBean {

    static {
        System.out.println("Static block: class loaded");
    }

    {
        System.out.println("Instance block: object creation started");
    }

    public MyBean() {
        System.out.println("Constructor: MyBean instance created");
    }

    private String message;

    public void setMessage(String message) {
        this.message = message;
        System.out.println("Setter: message property set");
    }

    @PostConstruct
    public void init() {
        this.message = "Hello from Spring!";
        System.out.println("PostConstruct: init method called");
    }

    public void doWork() {
        System.out.println("Business Logic: " + message);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("PreDestroy: destroy method called");
    }
}
