package pa.calc;

public class Oper05 implements ItfOper{

	@Override
	public double oper(double op1, double op2) {
		double value=0.0;
		if(op2>10.0) {
		int op2_int= (int) op2;
		
			for(int i=0; i<op2_int;i++) {
				value=i+op1;
		}
		}else {
			value = Math.min(op1,op2); 
		}
		return (value);
	}
	//versao2 
}
