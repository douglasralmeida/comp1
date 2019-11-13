package arvoreSintaxe;

public class AddExpr extends Expr {
	
	public Expr expression1, expression2;
	
	public Add add;

	public AddExpr(Expr exp1, Add newadd, Expr exp2) {
		expression1 = exp1;
		expression2 = exp2;
		add = newadd;
	}

	@Override
	public void aceitar() {
		// TODO Auto-generated method stub

	}

}
