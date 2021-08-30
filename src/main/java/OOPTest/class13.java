package OOPTest;

// test pack access

public class class13 { // static -- error here!
    public static int field1 = 1;
    private int nonStatic13 = 1;

    public class13() {
        field1 = 2;

        NestedStaticClass132.statFunc();
    }

    public class13(int a) {
        field1 = a;
    }

    public static class NestedStaticClass132 {
        //int nonStatic22 = 1;
        int getOuterField(){
            //nonStatic = 2;
            return field1; // !!!!!!!!
        }

        void nonStatFunc() { // ok!
        }

        private static void statFunc() { // ok!
        }
    }
}


