package arvoreSintaxe;

public class AssignStmt extends Stmt {
	
	String identifier;
	
	Expr expression;
	
	public AssignStmt(String id, Expr expr) {
		identifier = id;
		expression = expr;
		erroSemantico = false;
	}

}
