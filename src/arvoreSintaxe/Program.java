package arvoreSintaxe;

import java.util.ArrayList;


public class Program {

	public ArrayList<Decl> dec_list;
	
	public CompoundStmt compound_stmt;
	
	public Program(ArrayList<Decl> list, CompoundStmt stmt) {
		dec_list = list;
		compound_stmt = stmt;
	}
	
	public void aceitar() {
		
	}

}
