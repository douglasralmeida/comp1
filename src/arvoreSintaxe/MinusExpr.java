package arvoreSintaxe;

public class MinusExpr extends Expr {
	
    public Expr expression;
	
	public MinusExpr(Expr exp) {
		expression = exp;
		tipo = exp.tipo;
	    if (tipo == Type.INTEGER || tipo == Type.REAL)
	    	erroSemantico = exp.erroSemantico;
	    else {
	    	System.out.println("Um erro semantico foi encontrado. O operador - s� pode ser utilizado em express�es de tipo inteiro ou real.");
	    	erroSemantico = true;
	    }	    
	}
}
