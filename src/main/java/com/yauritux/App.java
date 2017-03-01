package com.yauritux;

import com.yauritux.domain.RuleService;
import com.yauritux.domain.UserService;
import com.yauritux.factory.RuleServiceFactory;
import com.yauritux.factory.UserServiceFactory;

public class App {
	
    public static void main( String[] args ) {
    	System.out.println("Testing UserServiceFactory");
    	UserServiceFactory userServiceFactory = new UserServiceFactory();
    	UserService userService = userServiceFactory.create();
    	
    	System.out.println(userService.getUserById("bf75e871-a4f0-4837-a00e-063e5db1e291"));
    	
    	System.out.println("Testing RuleService...");
    	RuleServiceFactory ruleServiceFactory = new RuleServiceFactory();
    	RuleService ruleService = ruleServiceFactory.create();
    	
    	System.out.println(ruleService.getRuleByName("current_fico_calculations"));
    	
    	System.out.println("DONE");
    }
}
