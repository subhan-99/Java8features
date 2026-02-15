package LambdaExpression;

import java.util.*;

class Test4 {
    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(20);
        l.add(10);
        l.add(25);
        l.add(5);

        System.out.println(l);

        Comparator<Integer> c = (I1, I2) ->
                (I1 < I2) ? -1 : (I1 > I2) ? 1 : 0;

        Collections.sort(l, c);

        System.out.println(l);
    }
}

