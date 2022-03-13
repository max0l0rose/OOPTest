package OOPTest;

// test pack access

public class Class13 { // static -- error here!
    public static int stField13 = 1;
    int nonStatic13 = 1;

    public Class13() {
        stField13 = 2;

        NestedStaticClass132.statFunc();
    }

    public Class13(int a) {
        stField13 = a;
    }

    static class NestedStaticClass132 { // protected, private - OK!
        int nonStatic132 = 1; // OK

        int getOuterField(){
            //nonStatic13 = 1; //ERROR!
            nonStatic132 = 2; // OK
            //nonStatic13 = 2; // ERROR
            return stField13; // !!!!!!!! // OK
        }

        void nonStatFunc() { // ok!
        }

        private static void statFunc() { // ok!
        }
    }
}


