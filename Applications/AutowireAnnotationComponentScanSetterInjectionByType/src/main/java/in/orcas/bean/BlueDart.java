package in.orcas.bean;

import org.springframework.stereotype.Component;

@Component("bdart")
public class BlueDart implements Courier {

    static {
        System.out.println("BlueDart.class file is loading...");
    }

    public BlueDart() {
        System.out.println("BlueDart object is instantiated...");
    }

    @Override
    public String deliver(int oid) {
        System.out.println("BlueDart.deliver()");
        return "BlueDart courier will deliver with the order id ::" + oid + " order products";
    }
}
