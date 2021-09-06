package OOPTest;

// ====================================================
class class131 extends class13 { // static -- error here!
    protected int field1 = 1;

    class131() {
        field1 = 131;
        class13.stField13 = 3333;
    }

    class131(int a) {
        super(a);
        //field1 = 6; // protected test. from another pack.
    }
}

