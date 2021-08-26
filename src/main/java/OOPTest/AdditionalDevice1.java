package OOPTest;

import OOPTest.Interfaces.IEngine;

// ====================================================
class AdditionalDevice1 implements IEngine.IAdditionalDevice {//, Comparable
    private static int ddd = 1;
    int notStatic = 2;

    class NestedClass1 {
//        static int ggg = 1; // wow! Error! Inner classes cannot have static decl. !!!!!!!!!!!!!!!!!!!!!!!!!!

        int NestedClass1_ggg = 1;

//        static {              // wow! Error! Inner classes cannot have static decl.
//            int ddd = 2;
//        }

        int GetField() {
            return ddd;
        }
    }


    class NestedClass2 {
        NestedClass2() {
            notStatic = 3;
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
