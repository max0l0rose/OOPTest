package OOPTest;

import OOPTest.Interfaces.ICar;

// ====================================================
class FastCar implements ICar {

    int qqq = 1; // package private. Default.

    static {
        int a = 1;
    }

    @Override
    public void brake() {
    }


    static void sm2() {
        //smmm();
    }

    void qqq() {
        //smmm();
    }

}
