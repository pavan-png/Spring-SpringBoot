package in.orcas.bean;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("fpkt")
public class Flipkart {

    private Courier courier;

    static {
        System.out.println("Flipkart.class file is loading...");
    }

    @Autowired  // Constructor injection byType
    public Flipkart(Courier courier) {
        System.out.println("Flipkart constructor called for injecting Courier (byType)");
        this.courier = courier;
    }

    public String shopping(String[] items, float[] prices) {
        System.out.println("Flipkart.shopping()");
        System.out.println(courier.getClass().getName());

        float billAmt = 0.0f;
        for (float price : prices) billAmt += price;

        int oid = new Random().nextInt(1000);
        String msg = courier.deliver(oid);

        return Arrays.toString(items) + " total: " + billAmt + " -> " + msg;
    }
}
