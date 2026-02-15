package StreamAPI;


import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class Test9
{
    public static void main(String[] args)
    {
        ArrayList<Integer> l = new ArrayList<Integer>();

        l.add(10);
        l.add(0);
        l.add(15);
        l.add(5);
        l.add(20);

        System.out.println(l);

        Consumer<Integer> c = i -> {
            System.out.println("The Square of " + i + " is: " + (i * i));
        };

        l.stream().forEach(c);
    }
}

