package arvoreSintaxe;

public class Identifier extends Expr {
	
	public String name;
	
	public Identifier(String newname) {
		name = newname;
		erroSemantico = false;
	}
	
	public String toString() {
		return name;
	}

}
