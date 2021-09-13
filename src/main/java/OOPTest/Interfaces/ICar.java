package OOPTest.Interfaces;

public interface ICar extends IMovable, IEngine {

    default IAdditionalDevice defMethGas() {
        IMovable.statMeth();
        IEngine.smmm();
        //System.out.println("ICar::gas");
        //aaa();
        IEngine.IAdditionalDevice ad = null;
        return ad;
    }

    void brake();

    static void interfaceStatMeth()
    {
        String methodName = new Throwable()
                .getStackTrace()[0]
                .getMethodName();
        System.out.println(methodName);
    }

}
