package arvoreSintaxe;

import java.util.ArrayList;

public class ReadStmt extends ProcStmt {
	
	ArrayList<Identifier> ident_list;

	public ReadStmt(ArrayList<Identifier> list) {
		ident_list = list;
		for (Identifier id: list)
			erroSemantico |= id.erroSemantico;
		if (erroSemantico)
			paramcount = 0;
		else {
			paramcount = list.size();
			if (paramcount == 0) {
				System.out.println("Um erro semântico foi encontrado. O método Read requer, pelo menos, um parâmetro.");
				erroSemantico = true;
			}
		}
	}
}
