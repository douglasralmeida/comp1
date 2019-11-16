package arvoreSintaxe;

public class RelacExpr extends Expr {
	
	public Expr expression1, expression2;
	
	public Relac relac;

	public RelacExpr(Expr exp1, String op, Expr exp2) {
		expression1 = exp1;
		expression2 = exp2;
		setOperador(op);
		erroSemantico = exp1.erroSemantico || exp2.erroSemantico;
		switch(relac) {
			case DIFFERENT:
				setAllTypesTipo();
				break;
			case EQUAL:
				setAllTypesTipo();
				break;
			case GREATER:
				setOnlyNumbersTipo();
				break;
			case GREATEREQUAL:
				setOnlyNumbersTipo();
				break;
			case LESS:
				setOnlyNumbersTipo();
				break;
			case LESSEQUAL:
				setOnlyNumbersTipo();
				break;
			default:
				break;		
		}
	}
	
	private void setAllTypesTipo() {
		if (expression1.tipo == expression2.tipo) {
			tipo = Type.BOOLEAN;
		} else {
			tipo = Type.UNDEFINED;
			erroSemantico = true;
			System.out.println("Um erro semântico foi encontrado. Os operadores = e != não podem ser utilizados em expressões com tipos diferentes.");
		}
	}
	
	private void setOnlyNumbersTipo() {
		if ((expression1.tipo == Type.INTEGER && expression2.tipo == Type.REAL) || 
		    (expression1.tipo == Type.REAL && expression2.tipo == Type.INTEGER )||
		    (expression1.tipo == Type.INTEGER && expression2.tipo == Type.INTEGER) ||
		    (expression1.tipo == Type.REAL && expression2.tipo == Type.REAL)) {
			tipo = Type.BOOLEAN;
		} else {
			erroSemantico = true;
			tipo = Type.UNDEFINED;
			System.out.println("Um erro semântico foi encontrado. Os operadores >, >=, < e <= não podem ser utilizados em expressões com tipos diferentes de inteiro ou real.");
		}
	}
	
	private void setOperador(String s) {
		if (s == "=")
			relac = Relac.EQUAL;
		else if (s == "<")
			relac = Relac.LESS;
		else if (s == "<=")
			relac = Relac.GREATEREQUAL;
		else if (s == ">")
			relac = Relac.GREATER;
		else if (s == ">=")
			relac = Relac.GREATEREQUAL;
		else
			relac = Relac.DIFFERENT;
	}
}
