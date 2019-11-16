package arvoreSintaxe;

public class Simbolo {
	
	public String identifier;
	
	public Type type;

	public Simbolo(String nome, Type novotipo) {
		identifier = nome;
		type = novotipo;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		return identifier.equals(((Simbolo)obj).identifier);
	}
	
	public String toString() {
		return identifier + ": " + type;
	}
}
