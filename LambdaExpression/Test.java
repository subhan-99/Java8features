package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(6);
		list.add(0);
		list.add(99);
		list.add(6);
		Collections.sort(list,(a,b) -> a-b);
		System.out.println(list);
	}

}
