package OOPTest;

import OOPTest.Interfaces.ICar;

// ====================================================
public class FastCar implements ICar {

    int qqq = 1; // package private. Default.

    static {
        int a = 1;
    }

    @Override
    public void brake() {
    }


    static void classStaticMeth() {
        //statMeth(); // ERROR!
    }

    void func() {
        //interfaceStatMeth(); // ERROR!
    }

}
