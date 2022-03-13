package OOPTest;

// ====================================================
class Class131 extends Class13 { // static -- error here!
    protected int field1 = 1;

    Class131() {
        field1 = 131;
        Class13.stField13 = 3333;
    }

    Class131(int a) {
        super(a);
        //field1 = 6; // protected test. from another pack.
    }
}

