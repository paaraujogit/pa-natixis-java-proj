package pa.calc;

public class Oper02 implements ItfOper {
	public Oper02() {}
	public double oper(double op1, double op2) {
		//logaritmo base op1 de op2
		return Math.log10(op2)/Math.log10(op1)+1;
	}
	
}
