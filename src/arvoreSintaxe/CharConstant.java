package arvoreSintaxe;

public class CharConstant extends Constant {
	
	public char value;

	public CharConstant(char newvalue) {
		value = newvalue;
		erroSemantico = false;
		tipo = Type.CHAR;
	}	
}
