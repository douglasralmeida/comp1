package arvoreSintaxe;

public class Program {

	public DeclList dec_list;
	
	public CompoundStmt compound_stmt;
	
	public boolean erroSemantico;
	
	public Program(DeclList list, CompoundStmt stmt) {		
		dec_list = list;
		compound_stmt = stmt;
		erroSemantico = list.erroSemantico || stmt.erroSemantico;
	}
}
