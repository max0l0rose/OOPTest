package OOPTest.Interfaces;

//import java.awt.*;

public interface IEngine {

    public interface IAdditionalDevice {
        String Name();
    }

    final static int staticA = 1; // final static !!
    //final static Point staticPoint = new Point(1,2);

    default IAdditionalDevice gas() {
        System.out.println("IEngine::gas");
        IAdditionalDevice i = () -> "qqq";
        return i;
    }

    static void smmm() { // private - Java 9
    }
}
