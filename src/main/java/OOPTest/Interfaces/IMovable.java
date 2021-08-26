package OOPTest.Interfaces;

public interface IMovable {
    final static int a = 1; // final static !!

    default IEngine.IAdditionalDevice gas() {
        System.out.println("IMovable::gas");
        // a = 2; // error
        //aaa();
        IEngine.IAdditionalDevice i = null;
        return i;
    }

    static void smmm() {
    }
}
