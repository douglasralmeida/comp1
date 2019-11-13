package arvoreSintaxe;

public class Decl {
		
	public String identifier;

	public Type type;
	
	public Decl(String id, Type newtype) {
		type = newtype;
		identifier = id;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		return identifier.equals(((Decl)obj).identifier);
	}
	
	public String toString() {
		return identifier + ": " + type;
	}
}
