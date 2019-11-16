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
			System.out.println("Um erro semântico foi encontrado. A expressão deve retornar um tipo booleano.");
			erroSemantico = true;
		}		
	}
}
