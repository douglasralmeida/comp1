package pacoteTestes;

import pacotePrincipal.TabelaSimbolos;

public final class TesteTabelaSimbolos {
	static TabelaSimbolos s;

	public static void main(String[] args) {
		s = new TabelaSimbolos();
		
		s.abrirBloco(); 
		s.adicionar("ab","int");
		s.adicionar("bb","int");
		s.adicionar("cb","int"); 
		s.adicionar("db","int"); 
		s.adicionar("eb","int");
		s.adicionar("fb","int");
		s.adicionar("gb","int");
		s.adicionar("hb","int"); 
		
		s.obter("ab");
		s.obter("db");
		
		s.abrirBloco();
		s.obter("ab"); 
		s.obter("db");
		
		s.adicionar("ib","int"); 
		s.adicionar("jb","int"); 
		s.adicionar("kb","int");
		s.adicionar("lb","int");
		s.adicionar("mb","int");
		s.adicionar("nb","int");
		s.adicionar("ob","int");
		s.adicionar("pb","int");
		s.adicionar("qb","int"); 
		s.obter("ab");
		s.obter("db");

		s.abrirBloco();
		s.obter("ab");
		s.obter("db");
		s.adicionar("rb","int");
		s.adicionar("sb","int");
		s.adicionar("tb","int");
		s.adicionar("ub","int");
		s.adicionar("vb","int");
		s.adicionar("wb","int");
		s.adicionar("xb","int");
		s.adicionar("yb","int");
		s.adicionar("zb","int");
		
		s.obter("ab");
		s.obter("db");
		s.sairBloco();
		
		s.obter("ab");
		s.obter("db"); 
 		s.sairBloco();
 		
 		s.obter("ab");
 		s.obter("db"); 
 		s.sairBloco();
 		
 		
	}
}