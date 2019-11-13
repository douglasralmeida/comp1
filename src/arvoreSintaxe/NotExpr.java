package arvoreSintaxe;

public class NotExpr extends Expr {

	public Expr expression;
	
	public NotExpr(Expr exp) {
	    expression = exp;
	}

	@Override
	public void aceitar() {
		// TODO Auto-generated method stub
		
	}

}
