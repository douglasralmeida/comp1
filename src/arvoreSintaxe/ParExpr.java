package arvoreSintaxe;

public class ParExpr extends Expr {

	public Expr expression;
	
	public ParExpr(Expr exp) {
		expression = exp;
		tipo = exp.tipo;
		erroSemantico = exp.erroSemantico;
	}
}
