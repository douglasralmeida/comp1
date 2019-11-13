package arvoreSintaxe;

public class ParExpr extends Expr {

	public Expr expression;
	
	public ParExpr(Expr exp) {
		expression = exp;
	}

	@Override
	public void aceitar() {
		// TODO Auto-generated method stub

	}

}
