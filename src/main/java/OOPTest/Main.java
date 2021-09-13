package OOPTest;

import OOPTest.Interfaces.*;
import io.vavr.control.Try;

import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.function.Predicate;

import static org.junit.Assert.assertTrue;


// ====================================================
public class Main {

    //Collection
    //LinkedList
    //List
    //ArrayList

    int aa = 1;
    private static int eee = 1;


    public void qqq(Integer i, String[] sarr, int[] iarr) {

        i = 2;
        sarr[0] = "qqq";
        //sarr[1] = "www";
        iarr[0] = 2;
        class Nested_InMethod_C2 { //static  -- error ////// NO ACCESS MODIFIERS
            int fff = 1; //static - error

            Nested_InMethod_C2() { // instance constructor
                int zzz = 1;
            }

            void func() {
                //Enum1 en = new Enum();
                //aa = 2; // )))))))))))))))))))))))) not static, Error.
                eee = 2;
                fff = 3;
            }
        }

        class Nested_InMethod_C3 extends class131 {
            private int fff = 1; //static - error
            private int field1 = 2;
            Nested_InMethod_C3() { // instance constructor
                super.field1 = 444;
                //super.super.field1 = 444;
                class13.stField13 = 666;
                //super(1);
            }

        }

        Nested_InMethod_C2 nsc2 = new Nested_InMethod_C2();
        nsc2.func();

        Nested_InMethod_C3 nsc3 = new Nested_InMethod_C3();
        nsc3.fff = 2;

        int q = nsc3.field1;
        //int w = Nested_InMethod_C3.field1;

    }



    class WrapInt{
        int value = 1;
    }

    static void paramsPassingTest(WrapInt a, WrapInt b) {
        //i.value++;

//        WrapInt t = a;
//        a = b;
//        b = t;

        int t = a.value;
        a.value = b.value;
        b.value = t;

    }


    static int paramsPassingTest(Integer a, Integer b) {
        //i.value++;
        Integer t = a;
        a = b;
        b = t;
        return ++a;
    }


    static void paramsPassingTest(Integer[] arr) {
        arr[0]++;
    }


    static void paramsPassingTest(String a, String b) {
        //i.value++;
        String t = a;
        a = b;
        b = t;
    }


//    static void paramsPassingTest(byte[] a, byte[] b) {
//        //i.value++;
//        byte[] t = a;
//        a = b;
//        b = t;
//    }


//    static void paramsPassingTest(int[] arr) {
//        arr[0]++;
//    }


    synchronized
    static void paramsPassingTest(int... arr) {
        arr[0]++;
    }


    void run(String[] args) {

        //Integer a = 1;

        WrapInt theInt = new WrapInt() {{ value = 2; }};
        WrapInt theInt2 = new WrapInt() {{ value = 3; }};
        paramsPassingTest(theInt, theInt2);

        Integer theIntA = 2;
        Integer theIntB = 3;
        int res = paramsPassingTest(theIntA, theIntB);

        //Integer[] arr = new Integer[] {1,2,3};
        int[] arr = new int[] {1,2,3};
        paramsPassingTest(arr);

    }


    static void vavr() {

        Try<Integer> result = Try.of(
                () -> 1 / 0
        );

        //assertTrue(result.isFailure());

        int errorSentinel = result.recover(a -> 1).getOrElse(-666);


        io.vavr.collection.List list = io.vavr.collection.List.of(1, "2", 0.7);

//        List<String> wordList = Arrays.asList("abracadabra");
//        List<String> list = Collections.unmodifiableList(wordList);
//        list.add("boom");
    }


    static class Person {
        String firstName;
        String lastName;

        Person() {}

        Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

    static class Person2 extends Person {
        String middleName;

        //Person2() {}

        Person2(String firstName, String lastName, String middleName) {
            super(firstName, lastName);
            this.middleName = middleName;
        }

        Person2(String firstName, String lastName) {
            super(firstName, lastName);
        }
    }

    static class RenegadePerson {
        String qqq;
        String www;

        //RenegadePerson() {}

        RenegadePerson(String qqq, String www) {
            this.qqq = qqq;
            this.www = www;
        }
    }


    interface PersonFactory<P> { // extends Person
        P create(String firstName, String lastName);

        default String getName() {
            return "Vasya";
        }
    }



    // =============================================================================================
    // =============================================================================================
    // =============================================================================================
    public static void main(String[] args) {

//        Function<String, Integer> toInteger = Integer::valueOf;
//        Function<String, String> backToString = toInteger.andThen(String::valueOf);
//
//        int ii = toInteger.apply("123");
//        String s = backToString.apply("123");


        Predicate<Integer> negative =
                i -> i > 0;
        Predicate<Integer> above10 =
                i -> i < -10;
        boolean res = negative.and(above10).negate().test(-5);

        //PersonFactory<RenegadePerson> personFactory = RenegadePerson::new;
        //PersonFactory<RenegadePerson> personFactory = (n, ln) -> new RenegadePerson(getName(), ln); // ERROR
        PersonFactory<RenegadePerson> personFactory = new PersonFactory<RenegadePerson>() {
            @Override
            public RenegadePerson create(String firstName, String lastName) {
                return new RenegadePerson(getName(), lastName);
            }
        };
        RenegadePerson person = personFactory.create("rPeter", "rParker");


        String a = new String("2"); // different
        String b = new String("2");

//        String a = "2"; // the same
//        String b = "2";

        //assertTrue(a == b);
        paramsPassingTest(a, b);


        Main main = new Main();
        main.run(args);

        String[] s2 = { "aaa" };
        Integer i = 1;
        int[] iarr = { 1 };
        main.qqq(i, s2, iarr);



        Callable callable = new Callable() {
            public int a = 1; // static  error
            @Override
            public Object call() throws Exception {
                return a;
            }
        };

        //class13.field1 = 5; // protected
        //class13.NestedStaticClass22 nsc22 = new class13.NestedStaticClass22(); // protected

//        Integer i1 = 128;
//        Long l1 = 128L;
//        boolean res = i1 == l1 + 0;

//        String s1 = "qqq";
//        String s2 = new String(s1);
//        String s3 = new String(s2);
//        //s2 += "q";
//        s2 = s2.intern();
//        //s1.intern();
//        boolean res = s1 == "qqq";
//        boolean res11 = s2.equals("qqq");
//        boolean res2 = s1 == s2;
//        boolean res3 = s2 == s3;

        Abstract1 abstract1 = new Abstract1() {
            @Override
            public void abs() { // public !!!! - redefinition of visibility!!!!! works!
            }
        };

        abstract1.abs();
        Abstract1.statm();
        Abstract2.statm();

//        int aa = Role.User.getParam();
//        String name = Role.User.name();
//        Role role = Role.valueOf("User1");

        AdditionalDevice1 ad1 = new AdditionalDevice1();
        ad1.notStaticA = 2;

        /////////// ORRRRRRRUUUUUUUUUUUUUUU ORU
        AdditionalDevice1.NestedClass1 nc1 = ad1.new NestedClass1(); /////////// ORRRRRRRUUUUUUUUUUUUUUU ORU

        //class13 c13 = new class13();
        //c13. new NestedStaticClass22();


        new AdditionalDevice1() {
            //static int t = 1; // static - error

            public int compareTo1(Object o) {
                return 0;
            }
        };


        ICar.interfaceStatMeth();
        FastCar fastCar = new FastCar();
        // RocketAirBus fastCar = new AirBus(); // incopati types ERROR!!
        // RocketAirBus fastCar = (RocketAirBus)new AirBus(); // ERROR runtime: OOPTest.AirBus cannot be cast to OOPTest.RocketAirBus

        //fastCar.interfaceStatMeth(); //Error!!!!!
        fastCar.classStaticMeth(); //gas();
        fastCar.defMethGas(); // OK !!!!!
        //((IMovable)fastCar).smmm();//  ERROR ))))))))))))

        fastCar.staticPoint.x = 3;
        int aaa = fastCar.interfaceStatA; // OK - field!
        int a3 = IMovable.interfaceStatA;
        //int aaa = fastCar.smmm(); // ERROR - stat method!


        //IAircraft ac = (IAircraft)fastCar; // CAST ERROR!!

        //Object o;
        //RocketAirBus.sqqq();

        System.out.println("----- End ------");
    }
}
