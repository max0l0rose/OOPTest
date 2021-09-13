package OOPTest;

// ====================================================
class RocketCar extends FastCar {

//    class qqq {
//        static int a;  // static ERROR!
//    }

    static void sqqq() {
        classStaticMeth();
    }

    void func() {
        super.func();

        classStaticMeth();
    }
}
