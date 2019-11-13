package arvoreSintaxe;

public class RelacExpr extends Expr {
	
	public Expr expression1, expression2;
	
	public Relac relac;

	public RelacExpr(Expr exp1, Relac newrelac, Expr exp2) {
		expression1 = exp1;
		expression2 = exp2;
		relac = newrelac;
	}

	@Override
	public void aceitar() {
		// TODO Auto-generated method stub

	}

}
