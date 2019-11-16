package arvoreSintaxe;

public class NotExpr extends Expr {

	public Expr expression;
	
	public NotExpr(Expr exp) {
	    expression = exp;
	    tipo = exp.tipo;
	    if (tipo == Type.BOOLEAN) {
	    	System.out.println("Um erro semantico foi encontrado. O operador ! s� pode ser utilizado em express�es booleanas.");
	    	erroSemantico = true;
	    }
	    erroSemantico = exp.erroSemantico;
	}
}
