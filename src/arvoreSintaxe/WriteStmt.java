package arvoreSintaxe;

import java.util.ArrayList;

public class WriteStmt extends ProcStmt {

	public ArrayList<Expr> expr_list;
	
	public WriteStmt(ArrayList<Expr> list) {
		expr_list = list;
		for (Expr exp: list)
			erroSemantico |= exp.erroSemantico;
		if (erroSemantico)
			paramcount = 0;
		else {
			paramcount = list.size();
			if (paramcount == 0) {
				System.out.println("Um erro sem�ntico foi encontrado. O m�todo Write requer, pelo menos, um par�metro.");
				erroSemantico = true;
			}
		}
	}

}
