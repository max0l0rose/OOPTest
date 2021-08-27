package OOPTest;

import OOPTest.Interfaces.*;
import io.vavr.control.Try;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Callable;

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
                class13.field1 = 666;
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


    static int extest() {
        int a = 0;
        try {
            int b = 1 / a;
        }
        catch (ArithmeticException e) {
            a = 10;
            return 10; // 10 will be returned
        }
        catch (RuntimeException e) {
            a = 11;
        }
        catch (Exception e) {
            a = 12;
        }
        finally {
            a = 100;
            return 100;
            //return; // !!!!!!!! Ловить не надо! )))))))))))) Все работает
        }

        //return a;
    }


    class WrapInt{
        int value = 1;
    }

    static void paramsPassingTest(WrapInt i) {
        i.value++;
    }


    static void paramsPassingTest(Integer[] arr) {
        arr[0]++;
    }


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
        paramsPassingTest(theInt);

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


    // =============================================================================================
    // =============================================================================================
    // =============================================================================================
    public static void main(String[] args) {

        //vavr();

        HashMap;
        HashSet;


        Main main = new Main();
        main.run(args);

        Main m = new Main();

        String[] s = { "aaa" };
        Integer i = 1;
        int[] iarr = { 1 };
        m.qqq(i, s, iarr);

        int res = extest();

//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(1, "qqq");
//        map.put(4, null); // ok
//        map.put(null, "rrrr"); // ok

//        HashSet<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(4);
//        set.add(null); // ok

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

        int aa = Role.User.getParam();
        String name = Role.User.name();
        Role role = Role.valueOf("User1");

        AdditionalDevice1 ad1 = new AdditionalDevice1();
        ad1.notStatic = 2;

        /////////// ORRRRRRRUUUUUUUUUUUUUUU ORU
        /////////// ORRRRRRRUUUUUUUUUUUUUUU ORU
        /////////// ORRRRRRRUUUUUUUUUUUUUUU ORU
        AdditionalDevice1.NestedClass1 nc1 = ad1.new NestedClass1(); /////////// ORRRRRRRUUUUUUUUUUUUUUU ORU

        class13 c13 = new class13();
        c13. new NestedStaticClass22();

//        TreeSet<AdditionalDevice1> treeSet = new TreeSet<AdditionalDevice1>();
//        treeSet.add(new AdditionalDevice1() {
//            int t = 1; // static - error
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        });
//        //treeSet.add(new AdditionalDevice1());
//       // treeSet.add(new AdditionalDevice1());

        FastCar fastCar = new FastCar();
                                    // RocketAirBus fastCar = new AirBus(); -- incopat types error!!
                                    // RocketAirBus fastCar = (RocketAirBus)new AirBus(); -- runtime: OOPTest.AirBus cannot be cast to OOPTest.RocketAirBus
        ICar.sm();
        fastCar.sm2(); //gas();
        FastCar.sm2();
        //((ICar)fastCar).sm();//  ))))))))))))

        fastCar.point.x = 2;
        fastCar.point.x = 3;
        int aaa = ((IMovable)fastCar).a;
        //RocketAirBus rai = (RocketAirBus)fastCar;

        fastCar.qqq();

        Object o;
        //RocketAirBus.sqqq();

        System.out.println("----- End ------");
    }
}