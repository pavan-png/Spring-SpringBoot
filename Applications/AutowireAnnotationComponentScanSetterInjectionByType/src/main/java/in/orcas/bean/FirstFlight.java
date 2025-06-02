package in.orcas.bean;

import org.springframework.stereotype.Component;

@Component("fflight")
public class FirstFlight implements Courier {

    static {
        System.out.println("FirstFlight.class file is loading...");
    }

    
    public FirstFlight() {
        System.out.println("FirstFlight object is instantiated...");
    }

    @Override
    public String deliver(int oid) {
        System.out.println("FirstFlight.deliver()");
        return "FirstFlight courier will deliver with the order id ::" + oid + " order products";
    }
}
