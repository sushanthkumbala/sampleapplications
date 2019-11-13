package main;

import java.util.Optional;

public class OptionalExample {
	
	public static void main(String args[]) {
		String[] str = new String[10];  
        //String lowercaseString = str[5].toLowerCase();  
        //System.out.print(lowercaseString); 
		str[5]="SUSSHANTH BHAVANI";
		
		Optional<String> empty = Optional.empty();
	    Optional<String> checknull=Optional.ofNullable(str[5]);
	    if(checknull.isPresent()) {
	    	checknull.ifPresent(System.out::println);
	    	System.out.println(checknull.get());
	    	String lowercaseString = str[5].toLowerCase();  
	        System.out.print(lowercaseString);  
	    }else {
	    	System.out.println("String Value is not present");
	    }
	    
	    System.out.println(checknull.filter(s-> s.equals("SUSSHANTH BHAVAN")));
	    System.out.println(checknull.of(str[5]));
	    System.out.println("or else"+checknull.orElse("it is not there"));
	    System.out.println(empty.orElse("it is not present"));
	}

}
