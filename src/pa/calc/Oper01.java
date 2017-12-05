package pa.calc;

import static java.lang.Math.sqrt;

public class Oper01 implements ItfOper {
    //Calcular hipotenusa v.3
	@Override
	public double oper(double op1, double op2) {
    	double hipo = sqrt(op1*op1 + op2*op2);
		System.out.println("Hipotenusa: sqrt(" + op1 + "^2 + " + op2 + "^2) = " + String.format("%.4f", hipo));
		return hipo;	
	}
}
