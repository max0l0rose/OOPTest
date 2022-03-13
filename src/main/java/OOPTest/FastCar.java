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



    public int binarySearch(int[] array, int X) throws Exception {
        int center, left = 0;
        int right = array.length;

        do {
            center = (right-left) / 2;
            if (array[center] < X)
                right = center;
            else
                left = center;
        } while(array[center] != X
                        || left >= right);

        if (left == right)
            throw new Exception();

        return center;
    }
}
