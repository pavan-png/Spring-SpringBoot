package in.orcas.child;

import in.orcas.parent.GreetingUtil;

public class ChildApp {
	 public static void main(String[] args) {
	        String greeting = GreetingUtil.getGreeting("ChildApp");
	        System.out.println(greeting);
	        System.out.println("This is an extended logic in child project.");
	    }
}
