package arvoreSintaxe;

public class AddExpr extends Expr {
	
	public Expr expression1, expression2;
	
	public Add add;

	public AddExpr(Expr exp1, String addop, Expr exp2) {
		expression1 = exp1;
		expression2 = exp2;
		setOperador(addop);
		erroSemantico = exp1.erroSemantico || exp2.erroSemantico;
		switch (add) {
			case MINUS:
				setAddTipo();
				break;
			case OR:
				setOrTipo();
				break;
			case PLUS:
				setAddTipo();
				break;
			default:
				break;
		}
	}
	
	private void setOperador(String s) {
		if (s == "+")
			add = Add.PLUS;
		else if (s == "-")
			add = Add.MINUS;
		else
			add = Add.OR;
	}
	
	private void setAddTipo() {
		if (expression1.tipo == Type.INTEGER && expression2.tipo == Type.REAL) {
			tipo = Type.REAL;
		} else if (expression1.tipo == Type.REAL && expression2.tipo == Type.INTEGER) {
			tipo = Type.REAL;
		} else if (expression1.tipo != expression2.tipo) {
			System.out.println("Um erro semântico foi encontrado. Os operadores + e = não podem ser utilizados em expressões com tipos diferentes.");
			erroSemantico = true;
			tipo = Type.UNDEFINED;
		} else if (expression1.tipo == Type.BOOLEAN || expression2.tipo == Type.BOOLEAN) {
			System.out.println("Um erro semântico foi encontrado. Os operadores + e = não podem ser utilizados em expressões com tipo booleano.");
			erroSemantico = true;
			tipo = Type.UNDEFINED;
		} else if (expression1.tipo == Type.CHAR || expression2.tipo == Type.CHAR) {
			System.out.println("Um erro semântico foi encontrado. Os operadores + e = não podem ser utilizados em expressões com tipo char.");
			erroSemantico = true;
			tipo = Type.UNDEFINED;
		} else {
			tipo = expression1.tipo;
		}		
	}
	
	private void setOrTipo() {
		if (expression1.tipo == Type.BOOLEAN && expression2.tipo == Type.BOOLEAN) {
			tipo = Type.BOOLEAN;
		} else if (expression1.tipo == Type.INTEGER && expression2.tipo == Type.INTEGER) {
			tipo = Type.INTEGER;
		} else {
			System.out.println("Um erro semântico foi encontrado. O operador 'or' é permitido apenas em expressões com somente tipo booleano ou somente tipo inteiro.");
			erroSemantico = true;
			tipo = Type.UNDEFINED;
		}
	}
}
