package OOPTest;

// ====================================================
public class Class132 extends Class131 { // static -- error here!

	static {
		finStatic132 = 1;
	}

	protected int field1 = 1;
	static int stField13_2 = 1;
	public final static int finStatic132;

	Class132() {
		field1 = 132;
		stField13 = 3333;
	}

	Class132(int a) {
		super(a);
		//field1 = 6; // protected test. from another pack.
	}
}


