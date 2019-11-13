package arvoreSintaxe;

import java.util.ArrayList;

public class DoUntilStmt extends Stmt {

	public Expr cond;
	
	public ArrayList<Stmt> stmt_list;
	
	public DoUntilStmt(ArrayList<Stmt> list, Expr newcond) {
		cond = newcond;
		stmt_list = list;
	}


}
