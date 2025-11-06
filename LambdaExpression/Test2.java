package LambdaExpression;

import java.util.Map;
import java.util.TreeMap;

public class Test2 {
	public static void main(String[] args) {
		Map<Integer,String> m = new TreeMap<>();
		m.put(2, "z");
		m.put(3, "f");
		m.put(1, "y");
		System.out.println("Before manal sorting: " + m);
		Map<Integer, String> mm = new TreeMap<>((a,b) -> b -a);
		mm.put(2,"z");
		mm.put(3, "f");
		mm.put(1, "y");
		System.out.println("After manual sorting desc:" +mm);
	}

}
