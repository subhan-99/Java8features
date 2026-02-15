package LambdaExpression;

import java.util.*;

class Employee1
{
    String name;
    int eno;

    Employee1(String name, int eno)
    {
        this.name = name;
        this.eno = eno;
    }

    public String toString()
    {
        return eno + ":" + name;
    }
}

class Test5
{
    public static void main(String[] args)
    {
        ArrayList<Employee1> l = new ArrayList<Employee1>();

        l.add(new Employee1("Durga", 872425));
        l.add(new Employee1("Sunny", 212345));
        l.add(new Employee1("Bunny", 111213));
        l.add(new Employee1("Chinny", 434343));
        l.add(new Employee1("Vinny", 424345));

        System.out.println(l);

        Collections.sort(l, (e1, e2) -> e1.name.compareTo(e2.name));

        System.out.println(l);
    }
}


