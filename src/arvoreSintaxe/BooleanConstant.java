package arvoreSintaxe;

public class BooleanConstant extends Constant {

	public boolean value;
	
	public BooleanConstant(boolean newvalue) {
		value = newvalue;
		erroSemantico = false;
		tipo = Type.BOOLEAN;
	}
}
