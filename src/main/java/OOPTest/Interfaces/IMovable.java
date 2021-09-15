package OOPTest.Interfaces;

public interface IMovable {
    final static int interfaceStatA = 1; // _final_ static !!

    default IEngine.IAdditionalDevice defMethGas() {
        System.out.println("IMovable::gas");
        //a = 2; // error, final!
        IEngine.IAdditionalDevice ad = null;
        return ad;
    }

    static void interfaceStatMeth() {
    }
}
