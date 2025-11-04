package in.orcas.runners;

import java.util.Arrays;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Test implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        // Printing all arguments as a single array
        System.out.println("From ApplicationRunner :: " + Arrays.asList(args.getSourceArgs()));

        // Printing non-option arguments (commands)
        System.out.println("Non-Option Args :: " + args.getNonOptionArgs());

        // Printing option arguments (keys only)
        System.out.println("Option Names :: " + args.getOptionNames());

        // Printing option name and value(s)
        Set<String> optionNames = args.getOptionNames();
        for (String optionName : optionNames) {
            System.out.println(optionName + " :: " + args.getOptionValues(optionName));
        }

        // Example conditional logic based on non-option arguments
        if (args.getNonOptionArgs().contains("start")) {
            System.out.println("Start taking Email Dump...");
        } else if (args.getNonOptionArgs().contains("stop")) {
            System.out.println("Stop Email Dumping process...");
        }
    }
}
