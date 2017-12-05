package pa.calc;

public class Oper04 implements ItfOper{

	@Override
	public double oper(double op1, double op2) {
		return Math.max(op1, op2);
	}

}

