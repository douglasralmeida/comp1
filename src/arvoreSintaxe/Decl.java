package arvoreSintaxe;

public class Decl {
	
	public String identifier;

	public Type type;
	
	public Decl(String id, Type newtype) {
		type = newtype;
		identifier = id;
	}

	public void aceitar() {
		
	}
}
