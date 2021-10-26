package OOPTest;

// test pack access

import OOPTest.Interfaces.IMovable;

public class Class13 { // static -- error here!
    public static int stField13 = 1;
    static int stField13_2 = 1;
    int nonStatic13 = 1;
    final static int finStatic13;
    final static int finStatic2_13 = 1;
    final static int finStatic3_13 = 1;

    static {
        finStatic13 = 1;
        final int finStatic4_13 = 1;
    }

    public Class13() {
        stField13 = 2;

        //NestedStaticClass13.statFunc();
    }

    public Class13(int a) {
        stField13 = a;
    }

    static class NestedStaticClass13// protected, private - OK!
                            implements IMovable { // OK
        int nonStaticNested13 = 1; // OK
        static int staticNested13 = 1; // OK

        public NestedStaticClass13() {
            this.nonStaticNested13 = 2;
        }

        int getOuterField() {
            //static int a = 1; // ERROR
            //nonStatic13 = 1; //ERROR!
            nonStaticNested13 = 2; // OK
            return stField13; // !!!!!!!! // OK
        }

        void nonStatFunc() { // ok!
        }

        private static void statFunc13() { // ok!
            //static int a = 1; // ERROR
        }
    }


    static class NestedStaticClass13A extends NestedStaticClass13 // protected, private - OK!
    { // OK
        int nonStaticNested13 = 1; // OK
        static int staticNested13 = 1; // OK

        public NestedStaticClass13A() {
            nonStaticNested13 = 2;
        }

        int getOuterField() {
            //nonStatic13 = 1; //ERROR!
            nonStaticNested13 = 2; // OK
            return stField13; // !!!!!!!! // OK
        }

        void nonStatFunc() { // ok!
        }

        private static void statFunc13A() { // ok!
        }
    }



    class NestedClass13 { // protected, private - OK!
        int nonStaticNested13 = 1; // OK
        //static int staticNested13 = 1; // ERROR static!!!!!!

        int getOuterField() {
            nonStatic13 = 1; //OK!!!!!
            nonStaticNested13 = 2; // OK
            return stField13; // !!!!!!!! // OK
        }

        void nonStatFunc() { // ok!
        }

//        static void statFunc() { // ERROR static!!!!!!
//        }
    }

}


