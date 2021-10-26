package OOPTest;

// ====================================================
class Class131 extends Class13 { // static -- error here!

    static {
        finStatic131 = 1;
    }

    protected int field1 = 1;

    static int staticField131 = 1;
    public final static int finStatic131;

    Class131() {
        field1 = 131;
        stField13 = 3333;
    }

    Class131(int a) {
        super(a);
        //field1 = 6; // protected test. from another pack.
    }
}

