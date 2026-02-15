package StaticMethods;

@FunctionalInterface
 interface Interf1{
    int square(int x);
}

class Test1{
    public static void main(String[] args) {

        Interf1 i = x -> x * x;

        //System.out.println("The Square of 5 is: " + i.square(5));
         System.out.println(i.square(4));
         System.out.println(i.square(5));
    }
}
