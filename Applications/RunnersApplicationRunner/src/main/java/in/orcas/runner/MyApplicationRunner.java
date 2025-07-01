package in.orcas.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner{
	@Override
	public void run(ApplicationArguments args) {
		  System.out.println("Option Names: " + args.getOptionNames());
	        System.out.println("Non-option args: " + args.getNonOptionArgs());
	        System.out.println("Value of 'name': " + args.getOptionValues("name"));
	}
}
