package arvoreSintaxe;

import java.util.ArrayList;

public class StmtList {
	
	public ArrayList<Stmt> list;
	
	public boolean erroSemantico;

	public StmtList() {
		list = new ArrayList<Stmt>();
		erroSemantico = false;
	}
	
	public void add(Stmt stmt) {
		list.add(stmt);
		erroSemantico |= stmt.erroSemantico;
	}
	
	public void addAll(StmtList anotherlist) {
        for (Stmt stmt: anotherlist.list)
        	add(stmt);
	}
	
	public void show() {
		for (Stmt s: list)
            System.out.println(s);
	}
}