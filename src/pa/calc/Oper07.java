package pa.calc;

public class Oper07 implements ItfOper {

	@Override
	public double oper(double op1, double op2) {
		
		double calc = ((op1*op2) * (op2*op2) * (op2/op1))/2;
		
		return calc;
	}
	
}
