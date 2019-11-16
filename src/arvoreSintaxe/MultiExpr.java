package arvoreSintaxe;

public class MultiExpr extends Expr {

	public Expr expression1, expression2;
	
	public Multi multi;
	
	public MultiExpr(Expr exp1, String op, Expr exp2) {
		expression1 = exp1;
		expression2 = exp2;
		setOperador(op);
		erroSemantico = exp1.erroSemantico || exp2.erroSemantico;
		switch (multi) {		
			case TIMES:
				setTimesTipo();
				break;
			case AND:
				setAndTipo();
				break;
			case DIVIDED:
				setDividedTipo();
				break;
			case MOD:
				setModTipo();
				break;
			default:
				break;
		}
	}
	
	private void setOperador(String s) {
		if (s == "*")
			multi = Multi.TIMES;
		else if (s == "/" || s == "div")
			multi = Multi.DIVIDED;
		else if (s == "mod")
			multi = Multi.MOD;
		else
			multi = Multi.AND;
	}

	private void setAndTipo() {
		if (expression1.tipo == Type.BOOLEAN && expression2.tipo == Type.BOOLEAN) {
			tipo = Type.BOOLEAN;
		} else if (expression1.tipo == Type.INTEGER && expression2.tipo == Type.INTEGER) {
			tipo = Type.INTEGER;			
		} else {
			System.out.println("Um erro sem�ntico foi encontrado. O operador 'and' � permitido apenas em express�es com somente tipo booleano ou somente tipo inteiro.");
			erroSemantico = true;
			tipo = Type.UNDEFINED;
		}
	}
	
	private void setDividedTipo() {
		if (expression1.tipo == Type.INTEGER && expression2.tipo == Type.REAL) {
			if (expression2.getClass().getName() == "RealConstant" && ((RealConstant)expression2).value == 0.0f) {
				System.out.println("Um erro sem�ntico foi encontrado. Divis�o por zero n�o � permitida.");
				erroSemantico = true;
				tipo = Type.UNDEFINED;
			} else
				tipo = Type.REAL;
		} else if (expression1.tipo == Type.REAL && expression2.tipo == Type.INTEGER) {
			if (expression2.getClass().getName() == "IntegerConstant" && ((IntegerConstant)expression2).value == 0) {
				System.out.println("Um erro sem�ntico foi encontrado. Divis�o por zero n�o � permitida.");
				erroSemantico = true;
				tipo = Type.UNDEFINED;
			} else
				tipo = Type.REAL;
		} else if (expression1.tipo != expression2.tipo) {
			System.out.println("Um erro sem�ntico foi encontrado. Os operadores / e 'div' n�o podem ser utilizados em express�es com tipos diferentes.");
			erroSemantico = true;
			tipo = Type.UNDEFINED;
		} else if (expression1.tipo == Type.BOOLEAN || expression2.tipo == Type.BOOLEAN) {
			System.out.println("Um erro sem�ntico foi encontrado. Os operadores / e 'div' n�o podem ser utilizados em express�es com tipo booleano.");
			erroSemantico = true;
			tipo = Type.UNDEFINED;
		} else if (expression1.tipo == Type.CHAR || expression2.tipo == Type.CHAR) {
			System.out.println("Um erro sem�ntico foi encontrado. Os operadores / e 'div' n�o podem ser utilizados em express�es com tipo char.");
			erroSemantico = true;
			tipo = Type.UNDEFINED;
		} else if (expression2.getClass().getName() == "RealConstant" && ((RealConstant)expression2).value == 0.0f) {
			System.out.println("Um erro sem�ntico foi encontrado. Divis�o por zero n�o � permitida.");
			erroSemantico = true;
			tipo = Type.UNDEFINED;
		} else if (expression2.getClass().getName() == "IntegerConstant" && ((IntegerConstant)expression2).value == 0) {
			System.out.println("Um erro sem�ntico foi encontrado. Divis�o por zero n�o � permitida.");
			erroSemantico = true;
			tipo = Type.UNDEFINED;
		} else {
			tipo = expression1.tipo;
		}
	}

	private void setModTipo() {
		if (expression1.tipo == Type.INTEGER && expression2.tipo == Type.INTEGER) {
			tipo = Type.INTEGER;
		} else {
			System.out.println("Um erro sem�ntico foi encontrado. O operador 'mod' somente � permitido em express�es com tipo inteiro.");
			erroSemantico = true;
			tipo = Type.UNDEFINED;
		}
	}
	
	private void setTimesTipo() {
		if (expression1.tipo == Type.INTEGER && expression2.tipo == Type.REAL) {
			tipo = Type.REAL;
		} else if (expression1.tipo == Type.REAL && expression2.tipo == Type.INTEGER) {
			tipo = Type.REAL;
		} else if (expression1.tipo != expression2.tipo) {
			System.out.println("Um erro sem�ntico foi encontrado. O operador * n�o pode ser utilizado em express�es com tipos diferentes.");
			erroSemantico = true;
			tipo = Type.UNDEFINED;
		} else if (expression1.tipo == Type.BOOLEAN || expression2.tipo == Type.BOOLEAN) {
			System.out.println("Um erro sem�ntico foi encontrado. O operador * n�o pode ser utilizado em express�es com tipo booleano.");
			erroSemantico = true;
			tipo = Type.UNDEFINED;
		} else if (expression1.tipo == Type.CHAR || expression2.tipo == Type.CHAR) {
			System.out.println("Um erro sem�ntico foi encontrado. O operador * n�o pode ser utilizado em express�es com tipo char.");
			erroSemantico = true;
			tipo = Type.UNDEFINED;
		} else {
			tipo = expression1.tipo;
		}
	}
}
