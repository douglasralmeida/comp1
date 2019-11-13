package arvoreSintaxe;

import java.util.ArrayList;

public class WriteStmt extends Stmt {

	ArrayList<Expr> expr_list;
	
	public WriteStmt(ArrayList<Expr> list) {
		expr_list = list;
	}

}
