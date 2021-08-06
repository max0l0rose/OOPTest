package OOPTest.Interfaces;

public interface ICar extends IMovable, IEngine {

    default IAdditionalDevice gas() {
        IMovable.smmm();
        IEngine.smmm();
        //System.out.println("ICar::gas");
        //aaa();
        IEngine.IAdditionalDevice i = null;
        return i;
    }

    void brake();

    static void aaa()
    {
        String methodName = new Throwable()
                .getStackTrace()[0]
                .getMethodName();
        System.out.println(methodName);
    }

    static void sm() {
    }

}
