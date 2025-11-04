package in.orcas.runner;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;  // <-- Add this import and annotation!

@Component  // <-- This makes it a bean!
public class Test implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("From CommandLineRunner :: " + Arrays.asList(args));
    }
}