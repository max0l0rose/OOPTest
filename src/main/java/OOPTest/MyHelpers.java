package OOPTest;

import java.util.function.Predicate;

public class MyHelpers {
	public static Predicate<Integer> helper1() {
		return (q) ->  q > 0;
	}
}
