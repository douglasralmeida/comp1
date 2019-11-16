package arvoreSintaxe;

public class IfStmt extends Stmt {

	public Expr cond;
	
	public Stmt then_stmt;
	
	public Stmt else_stmt;
	
	public IfStmt(Expr newcond, Stmt t_stmt, Stmt e_stmt) {
		cond = newcond;
		then_stmt = t_stmt;
		else_stmt = e_stmt;
		erroSemantico = false;
	}

}
