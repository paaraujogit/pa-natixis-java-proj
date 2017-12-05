package pa.calc;

import static java.lang.Math.sqrt;

public class Oper01 implements ItfOper {
    //Calcular hipotenusa
	@Override
	public double oper(double op1, double op2) {
    	double hipo = sqrt(op1*op1 + op2*op2);
		System.out.println(hipo);
		return hipo;	
	}
}
