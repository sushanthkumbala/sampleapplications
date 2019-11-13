package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.IntToLongFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author skumbala
 *
 */
public class LambdaExpressionExample1 {

	public static void main(String srgs[]) {
		Drawable d1=(s1, s2) -> {
			System.out.println("hai i am executing muti lines");
			System.out.println("hai i am executing muti linessss");
			return s2+" hai i am imp fun through lambda "+s1;};
		System.out.println(d1.draw("circle", "Start"));
		d1.doit();
		   List<Product> list=new ArrayList<Product>();  
		   
		   list.add(new Product(1,"Samsung A5",17000f));  
	        list.add(new Product(3,"Iphone 6S",65000f));  
	        list.add(new Product(2,"Sony Xperia",25000f));  
	        list.add(new Product(4,"Nokia Lumia",15000f));  
	        list.add(new Product(5,"Redmi4 ",26000f));  
	        list.add(new Product(6,"Lenevo Vibe",19000f));  
	        
	        
	        Stream<Product> stpl=list.stream().filter(p-> p.price>20000);
	        
	         
	        List<Float> list1=list.stream().filter(p -> p.price>20000)
	        		          // .map(p-> p.price)
	        		           .map(Product::getPrice)
	        		           .collect(Collectors.toList());
	        System.out.println("after adding filter using streams using map and collect and filters"+list1);
	        stpl.forEach(s -> System.out.println(s.id));
	        Runnable r=new Runnable() {
				
				@Override
				public void run() {
					System.out.println("i am normal thread");
					
				}
			};
			
			Thread t=new Thread(r);
			t.start();
			
			Runnable r1=() -> {System.out.println("i am lambda thread");};
			
			Thread t1=new Thread(r1);
			t1.start();
			
			
			// method ref
			
			Sayable sa=MethodRef::saysomething;
			sa.say();
			
			Thread t2=new Thread(MethodRef::saysomething);
			t2.start();
		
			
			BiFunction<Integer, Integer, Integer> intadd= Arthamatic::add;
			BiFunction<Float, Float, Float> floadd=Arthamatic::add;
			
		
			
			System.out.println(intadd.apply(2, 3));
			System.out.println(floadd.apply(2.3f,3.2f));
			
	}
}
