package Predicate;

import java.util.function.Function;

public class Demo {
	public static void main(String[] args) {
		Function<String,String> f=s->s.toUpperCase();
		System.out.println(f.apply("Soft"));
	}

}
