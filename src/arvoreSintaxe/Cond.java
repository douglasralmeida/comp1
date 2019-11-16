package arvoreSintaxe;

public class Cond extends Expr {

	public Expr expression;
	
	public Cond(Expr exp) {
		expression = exp;
		erroSemantico = exp.erroSemantico;
		if (exp.tipo == Type.BOOLEAN) {
			tipo = Type.BOOLEAN;
		} else {
			tipo = Type.UNDEFINED;
			System.out.println("Um erro sem�ntico foi encontrado. A express�o deve retornar um tipo booleano.");
			erroSemantico = true;
		}		
	}
}
