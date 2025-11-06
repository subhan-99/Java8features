package LambdaExpression;

import java.util.Set;
import java.util.TreeSet;

public class Test1 {
	public static void main(String[] args) {
		Set<Integer> s= new TreeSet<>();
		s.add(22);
		s.add(1);
		s.add(13);
		System.out.println("Before manual sorting: " + s);
		Set<Integer> ss = new TreeSet<>((a,b)-> b-a);
		ss.add(22);
		ss.add(1);
		ss.add(13);
		System.out.println("after manual sorting desc: " + ss);
	}

}
