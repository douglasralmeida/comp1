package arvoreSintaxe;

import java.util.ArrayList;

public class TabelaSimbolos {
	
	public ArrayList<Simbolo> list;
	
	public boolean erroSemantico;

	public TabelaSimbolos() {
		list = new ArrayList<Simbolo>();
		erroSemantico = false;
	}
	
	public void add(Simbolo simb) {
		if (list.contains(simb)) {
			System.out.println("Um erro semantico foi encontrado. Variavel duplicada: " + simb.identifier + ".");
			erroSemantico = true;
		}
		else
			list.add(simb);
	}
	
	public void addAll(TabelaSimbolos tabela) {
        for (Simbolo simb: tabela.list)
        	add(simb);
	}
	
	public boolean contains(String nome) {
		if (list.contains(new Simbolo(nome, Type.BOOLEAN)))
			return true;
		else {
			System.out.println("Um erro semantico foi encontrado. A variavel chamada '" + nome + "' não foi declarada.");			
			return false;
		}
	}
	
	public void show() {
		for (Simbolo s: list)
            System.out.println(s);
	}

}
