package in.orcas.bean;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("fpkt")
@Scope("prototype")
@Lazy
public class Flipkart {
	
	private Random random;

    private Courier courier;
    
    @Value("${flipkart.offerCode:NA}")
    private String offerCode;

    static {
        System.out.println("Flipkart.class file is loading...");
    }

    @Autowired
    @Qualifier("bdart")
    public void setCourier(Courier courier) {
        System.out.println("Setter injection for Courier");
        this.courier = courier;
    }
    
    @Autowired
    public void setRandom(Random random) {
        System.out.println("Setter injection for Random");
        this.random = random;
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
