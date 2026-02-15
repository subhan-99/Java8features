package StreamAPI;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class Test10
{
    public static void main(String[] args)
    {
        ArrayList<Integer> l = new ArrayList<Integer>();

        l.add(10);
        l.add(0);
        l.add(15);
        l.add(5);
        l.add(20);

        Integer[] i = l.stream().toArray(Integer[]::new);
        Stream.of(i).forEach(System.out::println);
    }
}



