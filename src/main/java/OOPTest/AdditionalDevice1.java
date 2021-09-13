package OOPTest;

import OOPTest.Interfaces.IEngine;

// ====================================================
class AdditionalDevice1 implements IEngine.IAdditionalDevice {//, Comparable
    private static int staticDdd = 1;
    int notStaticA = 2;

    class NestedClass1 {
//        static int ggg = 1; // wow! ERROR! Inner classes cannot have static decl. !!!!!!!!!!!!!!!!!!!!!!!!!!

        int NestedClass1_ggg = 1;

//        static {              // wow! ERROR! Inner classes cannot have static decl.
//            int ddd = 2;
//        }

        int GetField() {
            return staticDdd;
        }
    }


    class NestedClass2 {
        NestedClass2() {
            notStaticA = 3;
        }
    }


    AdditionalDevice1() {
        NestedClass1 nc1 = new NestedClass1();
    }


    @Override
    public String Name() {
        return null;
    }
}
