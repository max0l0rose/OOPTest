package OOPTest.Interfaces;

public interface ICar extends IMovable, IEngine {

    static void interfaceStatMeth()
    {
        //super.interfaceStatMeth(); // super error

        IMovable.interfaceStatMeth(); // OK

        String methodName = new Throwable()
                .getStackTrace()[0]
                .getMethodName();
        System.out.println(methodName);
    }


    default IAdditionalDevice defMethGas() {
        IMovable.interfaceStatMeth();
        IEngine.smmm();
        //System.out.println("ICar::gas");
        //aaa();
        IEngine.IAdditionalDevice ad = null;
        return ad;
    }


    void brake();
}
