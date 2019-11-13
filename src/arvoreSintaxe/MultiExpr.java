package arvoreSintaxe;

public class MultiExpr extends Expr {

	public Expr expression1, expression2;
	
	public Multi multi;
	
	public MultiExpr(Expr exp1, Multi newmulti, Expr exp2) {
		expression1 = exp1;
		expression2 = exp2;
		multi = newmulti;
	}

	@Override
	public void aceitar() {
		// TODO Auto-generated method stub

	}

}
