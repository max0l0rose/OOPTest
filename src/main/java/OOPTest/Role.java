package OOPTest;

import OOPTest.Interfaces.ICar;
import lombok.Getter;

@Getter
public enum Role // extends E // error. impossible extend Enum
                // extends C // error. impossible extend Class
                implements ICar
{
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


class C //extends Role // impossible
{
}


enum E //extends Role // impossible
{
    a, b
}

interface ITest // extends Role // ERROR
{

}