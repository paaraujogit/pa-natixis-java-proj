package pa.calc;

public class Calculadora {

	public static void main(String[] args) {
		// OperEx Example
		OperEx opex=new OperEx();
		double resEx = opex.oper(1, 2);
		System.out.println(resEx);
		
		// ToDo - All Students Must Implement one Operation
		
		// - Oper01 - Alexandre M.
		
		Oper01 ope01=new Oper01();
		double res01 = ope01.oper(1, 2);
		System.out.println(res01);

		// - Oper02 - Alexandre T.
		
		Oper02 ope02=new Oper02();
		double res02 = ope02.oper(2, 3);
		System.out.println(res02);

		// - Oper03 - António F.
		
		OperacaoParaboloideHiperbolico ope03=new OperacaoParaboloideHiperbolico(); 
		double res03 = ope03.oper(1, 2);
		System.out.println("Operação Paraboloide hiperbolico:");
		System.out.println(res03);
		// outra operação
		System.out.println("Inverso da peração Paraboloide hiperbolico:");
		double invRes03 = ope03.oper(2, 1);
		System.out.println(invRes03);

		// - Oper04 - Gonçalo F.
		
		Oper04 ope04=new Oper04();
		double res04 = ope04.oper(4, 3);
		System.out.println(res04);

		// - Oper05 - Inês S.
		
		Oper05 ope05=new Oper05();
		double res05 = ope05.oper(1, 20);
		System.out.println(res05);

		// - Oper06 - Leonardo P.
		
		Oper06 ope06=new Oper06();
		double res06 = ope06.oper(1, 2);
		System.out.println(res06);

		// - Oper07 - Nuno M.
		
		Oper07 ope07 = new Oper07();
		double res07 = ope07.oper(1, 2);
		System.out.println(res07);

		// - Oper08 - Pedro Balthazar
		
		Oper08 ope08=new Oper08();
		double res08 = ope08.oper(1, 2);
		System.out.println(res08);

		// - Oper09 - Rui L.
		
		Oper09 ope09=new Oper09();
		double res09 = ope09.oper(1, 2);
		System.out.println(res09);

		// - Oper10 - Rui M.
		
		Oper10 ope10=new Oper10();
		double res10 = ope10.oper(1, 2);
		System.out.println(res10);

	}

}
>>>>>>> branch 'master' of https://github.com/paaraujogit/pa-natixis-java-proj.git
