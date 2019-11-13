package arvoreSintaxe;

import java.util.ArrayList;

public class ReadStmt extends Stmt {
	
	ArrayList<Identifier> ident_list;

	public ReadStmt(ArrayList<Identifier> list) {
		ident_list = list;
	}

}
