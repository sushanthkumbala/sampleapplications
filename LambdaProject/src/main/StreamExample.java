package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
  public static void main(String args[]) {
	Stream.iterate(1, element -> element+1)
	      .filter(element -> element%5==0)
	      .limit(5)
	      .forEach(System.out::println);
	
	
	List<Product> list=new ArrayList<Product>();  
	   
	   list.add(new Product(1,"Samsung A5",17000f));  
     list.add(new Product(3,"Iphone 6S",65000f));  
     list.add(new Product(2,"Sony Xperia",25000f));  
     list.add(new Product(4,"Nokia Lumia",15000f));  
     list.add(new Product(5,"Redmi4 ",26000f));  
     list.add(new Product(6,"Lenevo Vibe",19000f)); 
     list.add(new Product(7,"Samsung A5",18000f));
     
     Float sumproductprice= list.stream()
    		                            .map(p-> p.price)
    		                           //.reduce(0.0f, (sum, price)-> sum+price);
                                         .reduce(0.0f, Float::sum);
     System.out.println("sum of product price through reduce"+sumproductprice);
    		  double sumprodprice=list.stream().collect(Collectors.summingDouble(p->p.price));
    		  System.out.println("summing through collectors"+sumprodprice);
    		  
    		  Product maxprod= list.stream().
    				       max((product1,product2) -> product1.price> product2.price?1:-1).get();
    		  System.out.println("max product price"+maxprod.price);
    		  
    		  Product minprod= list.stream().
				       min((product1,product2) -> product1.price> product2.price?1:-1).get();
		  System.out.println("min product price"+minprod.price);
		  
		  Map<String, Double> maplist=list.stream().collect(Collectors.groupingBy(Product::getName, Collectors.summingDouble(Product::getPrice)));
          System.out.println("collector group by classs "+maplist);
          
          
    		                           
}
}
