package OOPTest;

import OOPTest.Interfaces.ICar;
import lombok.Getter;

@Getter
public enum Role implements ICar {
    Admin(1), User(2);

    static private class NestedStatic_InEnum_Class22 {
    }

    private int param;

    Role(int p) {
        param = p;
    }

    @Override
    public void brake() {
    }
}
