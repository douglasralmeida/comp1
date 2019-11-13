package arvoreSintaxe;

import java.util.ArrayList;

public class DeclList {
	
	public ArrayList<Decl> list;
	
	public boolean erroSemantico;

	public DeclList() {
		list = new ArrayList<Decl>();
		erroSemantico = false;
	}
	
	public void add(Decl dec) {
		if (list.contains(dec)) {
			System.out.println("Um erro semantico foi encontrado. Variavel duplicada: " + dec.identifier + ".");
			erroSemantico = true;
		}
		else
			list.add(dec);
	}
	
	public void addAll(DeclList anotherlist) {
        for (Decl dec: anotherlist.list)
        	add(dec);
	}
	
	public void show() {
		for (Decl d: list)
            System.out.println(d);
	}
}
