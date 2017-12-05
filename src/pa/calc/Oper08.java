package pa.calc;

public class Oper08 implements ItfOper{

	@Override
	public double oper(double op1, double op2) {
		
		return Math.pow(op1,op2);
	}
}
