package pa.calc;

public class Oper04 implements ItfOper{

	@Override
	public double oper(double op1, double op2) {
		return Math.atan2(op1, op2);
	}

}

