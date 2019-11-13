package arvoreSintaxe;

import java.util.ArrayList;

public class CompoundStmt {
	
	ArrayList<Stmt> stmt_list;

	public CompoundStmt(ArrayList<Stmt> list) {
		stmt_list = list;
	}

}
