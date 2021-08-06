package OOPTest.pack1;

// test pack access

public class class13 { // static -- error here!
    public static int field1 = 1;

    public class13() {
        field1 = 2;
    }

    public class13(int a) {
        field1 = a;
    }

    public class NestedStaticClass22 {
        int nonStatic = 1;
        int getOutterField(){
            return field1; // !!!!!!!!
        }
    }
}