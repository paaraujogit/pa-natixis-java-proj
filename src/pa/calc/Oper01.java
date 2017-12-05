package pa.calc;

import static java.lang.Math.sqrt;

public class Oper01 implements ItfOper {

	@Override
	public double oper(double op1, double op2) {
		return sqrt(op1*op1 + op2*op2);
	}

}
