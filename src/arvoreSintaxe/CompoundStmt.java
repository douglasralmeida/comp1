package arvoreSintaxe;

public class CompoundStmt extends Stmt {
	
	StmtList stmt_list;
	
	public boolean erroSemantico;

	public CompoundStmt(StmtList list) {
		stmt_list = list;
		erroSemantico = list.erroSemantico;
	}
	
	public void show() {
		stmt_list.show();
	}	

}
