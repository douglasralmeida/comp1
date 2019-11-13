package arvoreSintaxe;

import java.util.ArrayList;

public class WhileStmt extends Stmt {

	public Expr cond;
	
	public ArrayList<Stmt> stmt_list;
	
	public WhileStmt(Expr newcond, ArrayList<Stmt> list) {
		cond = newcond;
		stmt_list = list;
	}

}
