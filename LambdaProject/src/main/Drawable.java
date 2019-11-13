package main;

@FunctionalInterface
public interface Drawable {

	public String draw(String s,String s2);
	
	default void doit() {
		System.out.println("i am the default method in functional interface");
	}
	
	int hashCode();
	String toString();
	boolean equals(Object obj);
}
