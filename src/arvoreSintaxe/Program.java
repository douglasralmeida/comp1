package arvoreSintaxe;

public class Program {
	
	public CompoundStmt compound_stmt;
	
	public TabelaSimbolos tabela;
	
	public Program(CompoundStmt stmt, TabelaSimbolos tab) {		
		compound_stmt = stmt;
		tabela = tab;
	}
	
	public boolean possuiErroSemantico() {
		return tabela.erroSemantico || compound_stmt.erroSemantico;
	}
}
