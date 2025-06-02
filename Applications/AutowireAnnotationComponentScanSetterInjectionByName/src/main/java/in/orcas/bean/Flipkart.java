package in.orcas.bean;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public class Flipkart {

    private Courier courier;

    static {
        System.out.println("Flipkart.class file is loading...");
    }

    public Flipkart() {
        System.out.println("Flipkart object is created...");
    }

    @Autowired
    @Qualifier("fflight")
    public void setCourier(Courier courier) {
        System.out.println("Setter method called to inject Courier");
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
