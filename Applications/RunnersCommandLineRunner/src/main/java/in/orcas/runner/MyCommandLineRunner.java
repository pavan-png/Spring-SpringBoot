package in.orcas.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner{
	@Override
	public void run(String... args) {
		 for (String arg : args) {
	            System.out.println("CommandLineRunner arg: " + arg);
	        }
	}
}

